import argparse
import ast
import sys
from pathlib import Path

from antlr4 import CommonTokenStream, FileStream

from generated.algoLexer import algoLexer
from generated.algoParser import algoParser
from translator import Translator


def translate_file(input_file: Path) -> str:
    """Translate one .algo file to Python source code."""
    try:
        input_stream = FileStream(str(input_file), encoding="utf-8")
    except OSError as exc:
        raise RuntimeError(f"Unable to read input file: {input_file}") from exc

    lexer = algoLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser_ = algoParser(tokens)
    tree = parser_.program()

    if parser_.getNumberOfSyntaxErrors() > 0:
        raise ValueError(f"Parsing failed with {parser_.getNumberOfSyntaxErrors()} syntax error(s)")

    visitor = Translator()
    visitor.visit(tree)

    # inject autodetect() used by the translated input operations
    python_code = [
        "import ast",
        "def autodetect(value):",
        "    v = value.strip()",
        "    try:",
        "        return ast.literal_eval(v)",
        "    except (ValueError, SyntaxError):",
        "        return v\n",
    ] + visitor.output

    return "\n".join(python_code)


def write_output(output_path: Path, content: str) -> None:
    output_path.parent.mkdir(parents=True, exist_ok=True)
    output_path.write_text(content, encoding="utf-8")


def run_translated_code(full_code: str) -> None:
    namespace = {}
    exec(full_code, namespace)


def process_single_file(args: argparse.Namespace, input_file: Path, explicit_output: Path | None = None) -> int:
    try:
        full_code = translate_file(input_file)
    except Exception as exc:
        print(f"[ERROR] {input_file}: {exc}", file=sys.stderr)
        return 1

    output_path = explicit_output
    if output_path is None and args.output:
        output_path = Path(args.output)

    if output_path:
        write_output(output_path, full_code)
        print(f"Python code saved to {output_path}")

    if args.run:
        try:
            run_translated_code(full_code)
        except Exception as exc:
            print(f"[ERROR] Runtime execution failed for {input_file}: {exc}", file=sys.stderr)
            return 1

    return 0


def process_batch(args: argparse.Namespace, input_dir: Path) -> int:
    if args.output and not args.output_dir:
        print("[ERROR] --output is for single-file mode. Use --output-dir with --batch.", file=sys.stderr)
        return 2

    output_dir = Path(args.output_dir) if args.output_dir else None
    fixtures = sorted(input_dir.glob("*.algo"))
    if not fixtures:
        print(f"[ERROR] No .algo files found in directory: {input_dir}", file=sys.stderr)
        return 2

    failures = 0
    for fixture in fixtures:
        out_file = output_dir / f"{fixture.stem}.py" if output_dir else None
        code = process_single_file(args, fixture, out_file)
        if code == 0:
            print(f"[PASS] {fixture}")
        else:
            failures += 1
            print(f"[FAIL] {fixture}", file=sys.stderr)

    print(f"Batch summary: {len(fixtures) - failures}/{len(fixtures)} passed")
    return 1 if failures else 0


def main() -> int:
    parser = argparse.ArgumentParser(
        description="AlgTPy: .algo -> Python translator with optional strictness levels. By RedLeZ"
    )
    parser.add_argument("input_path", help="Input .algo file or directory (with --batch)")
    parser.add_argument("-o", "--output", help="Save translated Python code to a file")
    parser.add_argument("--output-dir", help="Directory to store translated files in --batch mode")
    parser.add_argument("--batch", action="store_true", help="Translate all .algo files in input directory")
    parser.add_argument("-r", "--run", action="store_true", help="Run the translated Python code immediately")
    parser.add_argument(
        "-S",
        "--strictness",
        type=int,
        choices=[1, 2, 3],
        default=2,
        help="Strictness level: 1=lenient, 2=moderate, 3=very strict"
    )
    args = parser.parse_args()

    input_path = Path(args.input_path)
    if not input_path.exists():
        print(f"[ERROR] Input path does not exist: {input_path}", file=sys.stderr)
        return 2

    if args.batch:
        if not input_path.is_dir():
            print("[ERROR] --batch requires input_path to be a directory.", file=sys.stderr)
            return 2
        return process_batch(args, input_path)

    if input_path.is_dir():
        print("[ERROR] Input path is a directory. Use --batch for directory processing.", file=sys.stderr)
        return 2

    if input_path.suffix.lower() != ".algo":
        print("[ERROR] Input file must use the .algo extension.", file=sys.stderr)
        return 2

    if args.output_dir:
        print("[ERROR] --output-dir is only valid with --batch.", file=sys.stderr)
        return 2

    return process_single_file(args, input_path)

if __name__ == "__main__":
    sys.exit(main())

