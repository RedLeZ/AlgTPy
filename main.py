import sys
from antlr4 import FileStream, CommonTokenStream
from generated.algoLexer import algoLexer
from generated.algoParser import algoParser
from translator import Translator
import argparse
import ast

def main():
    parser = argparse.ArgumentParser(
        description="AlgTPy: .algo → Python translator with optional strictness levels. By RedLeZ"
    )
    parser.add_argument("input_file", help="Input .algo file")
    parser.add_argument("-o", "--output", help="Save translated Python code to a file")
    parser.add_argument("-r", "--run", action="store_true", help="Run the translated Python code immediately")
    parser.add_argument(
        "-S", "--strictness", type=int, choices=[1,2,3], default=2,
        help="Strictness level: 1=lenient, 2=moderate, 3=very strict"
    )
    args = parser.parse_args()

    # Read and tokenize
    input_stream = FileStream(args.input_file, encoding='utf-8')
    lexer = algoLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser_ = algoParser(tokens)
    tree = parser_.program()

    visitor = Translator(strict_level=args.strictness)
    visitor.visit(tree)
    
    # injecting autodetect()
    python_code = [
        "import ast",
        "def autodetect(value):",
        "    v = value.strip()",
        "    try:",
        "        return ast.literal_eval(v)",
        "    except (ValueError, SyntaxError):",
        "        return v\n"
    ] + visitor.output

    full_code = "\n".join(python_code)

    # Save to file if requested
    if args.output:
        with open(args.output, "w", encoding="utf-8") as f:
            f.write(full_code)
        print(f"Python code saved to {args.output}")

    # Run if requested
    if args.run:
        namespace = {}
        try:
            exec(full_code, namespace)
        except Exception as e:
            print(f"Error executing code: {e}")

if __name__ == "__main__":
    main()

