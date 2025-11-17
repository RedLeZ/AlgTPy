#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."

if ! command -v java >/dev/null 2>&1; then
  echo "Java runtime not found. Install a JDK (e.g., via 'brew install --cask temurin')." 1>&2
  exit 1
fi

if command -v antlr4 >/dev/null 2>&1; then
  echo "Using antlr4 on PATH"
  antlr4 -Dlanguage=Python3 -visitor -o generated algo.g4
else
  echo "antlr4 CLI not found on PATH. If you have the ANTLR jar, set ANTLR_JAR to its path."
  if [[ -n "${ANTLR_JAR:-}" && -f "$ANTLR_JAR" ]]; then
    echo "Using ANTLR_JAR=$ANTLR_JAR"
    java -jar "$ANTLR_JAR" -Dlanguage=Python3 -visitor -o generated algo.g4
  else
    echo "Please install the antlr4 command or export ANTLR_JAR=/path/to/antlr-4.13.2-complete.jar" 1>&2
    exit 1
  fi
fi

echo "Regeneration complete."
