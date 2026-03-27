from pathlib import Path
import subprocess
import sys

import pytest


PROJECT_ROOT = Path(__file__).resolve().parents[1]
MAIN = PROJECT_ROOT / "main.py"
FIXTURES_DIR = PROJECT_ROOT / "tests"
FIXTURES = sorted(FIXTURES_DIR.glob("test_*.algo"))


@pytest.mark.parametrize("fixture", FIXTURES, ids=[p.name for p in FIXTURES])
def test_single_fixture_translates_without_error(fixture: Path) -> None:
    result = subprocess.run(
        [sys.executable, str(MAIN), str(fixture)],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True,
        check=False,
    )

    assert result.returncode == 0, (
        f"Translation failed for {fixture.name}\n"
        f"STDOUT:\n{result.stdout}\n"
        f"STDERR:\n{result.stderr}"
    )
    assert result.stderr.strip() == "", f"Unexpected stderr for {fixture.name}: {result.stderr}"


def test_batch_mode_reports_all_passes() -> None:
    result = subprocess.run(
        [sys.executable, str(MAIN), "--batch", str(FIXTURES_DIR)],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True,
        check=False,
    )

    assert result.returncode == 0, f"Batch mode failed\nSTDOUT:\n{result.stdout}\nSTDERR:\n{result.stderr}"
    pass_lines = [line for line in result.stdout.splitlines() if line.startswith("[PASS] ")]
    assert len(pass_lines) == len(FIXTURES)
