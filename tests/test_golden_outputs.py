from pathlib import Path
import sys

import pytest


PROJECT_ROOT = Path(__file__).resolve().parents[1]
sys.path.insert(0, str(PROJECT_ROOT))

from main import translate_file


PROJECT_ROOT = Path(__file__).resolve().parents[1]
FIXTURES_DIR = PROJECT_ROOT / "tests"
GOLDEN_DIR = FIXTURES_DIR / "golden"
FIXTURES = sorted(FIXTURES_DIR.glob("test_*.algo"))


def normalize(text: str) -> str:
    """Keep comparisons stable across newline conventions."""
    return text.replace("\r\n", "\n").rstrip() + "\n"


@pytest.mark.parametrize("fixture", FIXTURES, ids=[p.name for p in FIXTURES])
def test_translated_output_matches_golden_snapshot_to_detect_regressions(fixture: Path) -> None:
    """Verify that translated output matches stored golden snapshot to detect unintended changes."""
    golden_file = GOLDEN_DIR / f"{fixture.stem}.py.golden"
    assert golden_file.exists(), f"Missing golden file for {fixture.name}: {golden_file}"

    translated = translate_file(fixture)
    expected = golden_file.read_text(encoding="utf-8")

    assert normalize(translated) == normalize(expected), (
        f"Golden output mismatch for {fixture.name}. "
        "If changes are intentional, regenerate snapshots in tests/golden/."
    )
