from pathlib import Path
import subprocess
import sys


PROJECT_ROOT = Path(__file__).resolve().parents[1]
MAIN = PROJECT_ROOT / "main.py"


def run_cli(*args: str) -> subprocess.CompletedProcess[str]:
    return subprocess.run(
        [sys.executable, str(MAIN), *args],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True,
        check=False,
    )


def test_cli_returns_error_2_when_input_file_does_not_exist() -> None:
    """CLI reports exit code 2 when input .algo file is missing."""
    result = run_cli("tests/does_not_exist.algo")
    assert result.returncode == 2
    assert "Input path does not exist" in result.stderr


def test_cli_returns_error_2_when_directory_passed_without_batch() -> None:
    """CLI reports exit code 2 when directory is passed without --batch flag."""
    result = run_cli("tests")
    assert result.returncode == 2
    assert "Use --batch for directory processing" in result.stderr


def test_cli_returns_error_2_when_batch_flag_used_with_file_input() -> None:
    """CLI reports exit code 2 when --batch is used with a file instead of directory."""
    result = run_cli("--batch", "tests/test_control_flow_if_elif_else.algo")
    assert result.returncode == 2
    assert "--batch requires input_path to be a directory" in result.stderr


def test_cli_returns_error_2_when_output_dir_used_without_batch() -> None:
    """CLI reports exit code 2 when --output-dir is used without --batch flag."""
    result = run_cli("tests/test_control_flow_if_elif_else.algo", "--output-dir", "tmp_out")
    assert result.returncode == 2
    assert "--output-dir is only valid with --batch" in result.stderr
