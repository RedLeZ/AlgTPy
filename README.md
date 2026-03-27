# AlgTPy

![Version](https://img.shields.io/badge/version-0.1a-orange)
![Status](https://img.shields.io/badge/status-alpha-red)
![Python](https://img.shields.io/badge/python-3.10%2B-blue)
![ANTLR4](https://img.shields.io/badge/antlr-4-lightgrey)
![License](https://img.shields.io/badge/license-MIT-green)

---

AlgTPy is a translator that converts **Tunisian High School Algorithmic Language (Algo)** into **Python code**.  
It was created as a learning tool to help students quickly test, debug, and run their algorithm exercises without having to manually rewrite them in Python.

---

## ✨ Why This Project?

In Tunisian high schools, Informatics students are taught using a **paper-based algorithmic language** (keywords like `lire`, `ecrire`, `si`, `tantque`, etc.).  

This has two major issues:

- Students cannot run their code directly — they only write pseudocode on paper.  
- Debugging and testing logic becomes very difficult without execution.  

AlgTPy was made to solve this by **bridging Algo → Python**, so students can:

- Run their exercises on a real computer.  
- Test logic, loops, and conditions.  
- Learn Python naturally by comparing both languages.  

---

## 🚧 Current Status

This is an **early alpha (0.1a)** release.  

Currently supported:

- ✅ Variable declaration and assignment  
- ✅ Input (`lire`) with type detection (`entier`, `réel`, `booléen`, `chaine`)  
- ✅ Output (`ecrire`) → Python `print()`  
- ✅ If / ElseIf / Else statements  
- ✅ While loops (`tantque ... faire ... finTantque`)  
- ✅ For loops (`pour ... à ... pas ... finPour`)  
- ✅ Expressions: arithmetic, boolean, comparisons  
- ✅  Functions / Procedures
- ✅ Arrays & matrices 
- ⏳/✅ File handling (experimental but usable)

---

## 🛠 Planned Features

- ⏳ Better error messages when translation fails  
- ⏳ A small CLI tool for easier usage  

---

## 📦 Usage (dev version)

```bash
python3 main.py -o output.py tests/example.algo
````

* `tests/example.algo` → input file in Algo language
* `output.py` → generated Python file

Batch translation for a full folder:

```bash
python3 main.py --batch tests/
```

Batch translation and write all generated Python files to a directory:

```bash
python3 main.py --batch tests/ --output-dir generated_py/
```

Notes:

* `--batch` expects a directory containing `.algo` files
* `--output-dir` is only valid with `--batch`
* exit code is non-zero when at least one file fails translation

---

## 🧪 Example

Algo input:

```algo
i <- 0
tantque i < 5 faire
    ecrire(i)
    i <- i + 1
finTantque
```

Generated Python:

```python
i = 0
while (i < 5):
    print(i)
    i = (i + 1)
```

---

## 🤝 Contributing

Contributions are welcome! 🎉

If you are a student, teacher, or developer and want to help improve AlgTPy:

1. Fork the repository
2. Create a new branch (`feature/new-thing`)
3. Commit your changes with clear messages
4. Open a Pull Request

Ideas for contribution:

* Adding missing language features (functions, arrays, etc.)
* Improving translation accuracy
* Creating more test files
* Writing documentation / examples

---

## ✅ Reliability Baseline

Install runtime dependencies:

```bash
pip install -r requirements.txt
```

Install development dependencies (includes pytest):

```bash
pip install -r requirements-dev.txt
```

Run automated fixture checks:

```bash
pytest -q
```
