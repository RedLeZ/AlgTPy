"""
Comprehensive feature-based test suite for AlgTPy.

Organized by core language features to ensure reliable translation coverage.
"""

from pathlib import Path
import subprocess
import sys

import pytest


PROJECT_ROOT = Path(__file__).resolve().parents[1]
MAIN = PROJECT_ROOT / "main.py"
FIXTURES_DIR = PROJECT_ROOT / "tests"


def run_translator(fixture: Path) -> subprocess.CompletedProcess[str]:
    """Run translator on a single .algo file."""
    return subprocess.run(
        [sys.executable, str(MAIN), str(fixture)],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True,
        check=False,
    )


class TestControlFlowFeature:
    """Verify if/elif/else and boolean logic translation."""

    def test_control_flow_if_elif_else_translates_correctly(self) -> None:
        """Test if/elif/else statements and nested conditions."""
        fixture = FIXTURES_DIR / "test_control_flow_if_elif_else.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Control flow test failed:\n{result.stderr}"


class TestArraysMatricesFeature:
    """Verify array and matrix translation."""

    def test_array_indexing_translates_correctly(self) -> None:
        """Test array declaration, indexing, and assignment."""
        fixture = FIXTURES_DIR / "test_arrays_declaration_and_indexing.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Array indexing test failed:\n{result.stderr}"


class TestIOFeature:
    """Verify input/output (lire/ecrire) translation."""

    def test_text_io_translates_correctly(self) -> None:
        """Test text-based I/O in test_io_text.algo."""
        fixture = FIXTURES_DIR / "test_io_text.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Text I/O test failed:\n{result.stderr}"

    def test_text_io_02_translates_correctly(self) -> None:
        """Test text I/O operations in test_io_02.algo."""
        fixture = FIXTURES_DIR / "test_io_02.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Text I/O 02 test failed:\n{result.stderr}"

    def test_binary_io_translates_correctly(self) -> None:
        """Test binary file I/O in test_io_bin.algo."""
        fixture = FIXTURES_DIR / "test_io_bin.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Binary I/O test failed:\n{result.stderr}"


class TestLoopsAndIterationFeature:
    """Verify loop translation (while, for, do-until)."""

    def test_while_and_for_loops_translate_correctly(self) -> None:
        """Test while loops and for loop constructs."""
        fixture = FIXTURES_DIR / "test_loops_while_and_for.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Loop iteration test failed:\n{result.stderr}"

    def test_do_until_loop_translates_correctly(self) -> None:
        """Test do-until (repeter-jusqua) loop construct."""
        fixture = FIXTURES_DIR / "test_loops_do_until.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Do-until loop test failed:\n{result.stderr}"


class TestFunctionsAndProceduresFeature:
    """Verify function, procedure, and record type translation."""

    def test_functions_procedures_and_records_translate_correctly(self) -> None:
        """Test function definitions, procedures with parameters, and record types."""
        fixture = FIXTURES_DIR / "test_functions_procedures_and_records.algo"
        result = run_translator(fixture)
        assert result.returncode == 0, f"Functions/procedures test failed:\n{result.stderr}"


class TestBatchProcessing:
    """Verify batch translation mode functionality."""

    def test_batch_mode_processes_all_fixtures(self) -> None:
        """Test --batch flag processes entire fixture directory."""
        result = subprocess.run(
            [sys.executable, str(MAIN), "--batch", str(FIXTURES_DIR)],
            cwd=PROJECT_ROOT,
            capture_output=True,
            text=True,
            check=False,
        )
        assert result.returncode == 0, f"Batch mode failed:\n{result.stderr}"

        pass_lines = [line for line in result.stdout.splitlines() if line.startswith("[PASS]")]
        fixture_count = len(list(FIXTURES_DIR.glob("test_*.algo")))
        assert len(pass_lines) == fixture_count, (
            f"Expected {fixture_count} passed fixtures, got {len(pass_lines)}"
        )

    def test_batch_mode_with_output_directory(self) -> None:
        """Test --batch with --output-dir writes all outputs."""
        import tempfile
        import shutil

        with tempfile.TemporaryDirectory() as tmpdir:
            result = subprocess.run(
                [sys.executable, str(MAIN), "--batch", str(FIXTURES_DIR), "--output-dir", tmpdir],
                cwd=PROJECT_ROOT,
                capture_output=True,
                text=True,
                check=False,
            )
            assert result.returncode == 0, f"Batch with output-dir failed:\n{result.stderr}"

            output_files = list(Path(tmpdir).glob("*.py"))
            fixture_count = len(list(FIXTURES_DIR.glob("test_*.algo")))
            assert len(output_files) == fixture_count, (
                f"Expected {fixture_count} output files, got {len(output_files)}"
            )


class TestSingleFileProcessing:
    """Verify single-file translation mode."""

    def test_single_file_output_flag(self) -> None:
        """Test -o/--output saves translated Python to file."""
        import tempfile

        fixture = FIXTURES_DIR / "test_control_flow_if_elif_else.algo"
        with tempfile.NamedTemporaryFile(suffix=".py", delete=False) as tmp:
            output_path = tmp.name

        try:
            result = subprocess.run(
                [sys.executable, str(MAIN), str(fixture), "-o", output_path],
                cwd=PROJECT_ROOT,
                capture_output=True,
                text=True,
                check=False,
            )
            assert result.returncode == 0, f"Single file output test failed:\n{result.stderr}"
            assert Path(output_path).exists(), f"Output file not created: {output_path}"
            assert Path(output_path).stat().st_size > 0, "Output file is empty"
        finally:
            Path(output_path).unlink(missing_ok=True)
