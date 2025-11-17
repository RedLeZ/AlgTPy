from generated.algoParser import algoParser
from generated.algoVisitor import algoVisitor

class Translator(algoVisitor):
    def __init__(self):
        super().__init__()
        self.type_defs = {}  # Map TDNT type names to constructor strings
        self.import_numpy = False
        self.import_pickle = False
        self.file_modes = {}  # Map file handle name -> {'mode': str, 'binary': bool}
        self.need_eof_helpers = False
        self.var_inits = []  # TDO variable initializations
        # Accumulated output lines for main.py to consume
        self.output = []

    def visitProgram(self, ctx:algoParser.ProgramContext):
        py = ["# Translated from algo"]
        main_block = None
        # Preserve declaration order before the main block
        for child in ctx.getChildren():
            if isinstance(child, algoParser.TdntDeclContext):
                py.append(self.visit(child))
            elif isinstance(child, algoParser.TdoDeclContext):
                py.append(self.visit(child))
            elif isinstance(child, algoParser.BlockContext):
                main_block = child
        # Main algorithm block
        if main_block is None:
            # Fallback to method if not discovered during child scan
            py.append(self.visit(ctx.block()))
        else:
            py.append(self.visit(main_block))
        # Add numpy import if needed
        if self.import_numpy:
            py.insert(1, "import numpy as np")
        # Add pickle import if needed
        if self.import_pickle:
            insert_pos = 1 if not self.import_numpy else 2
            py.insert(insert_pos, "import pickle")
        # Add EOF helper functions if needed
        if self.need_eof_helpers:
            helpers = [
                "def __eof_text(__f):",
                "    __pos = __f.tell()",
                "    __ch = __f.read(1)",
                "    if __ch == '':",
                "        return True",
                "    try:",
                "        __f.seek(__pos)",
                "    except Exception:",
                "        pass",
                "    return False",
                "",
                "def __eof_bin(__f):",
                "    try:",
                "        __p = __f.peek(1)",
                "        return __p == b''",
                "    except Exception:",
                "        __pos = __f.tell()",
                "        __b = __f.read(1)",
                "        if __b == b'':",
                "            return True",
                "        try:",
                "            __f.seek(__pos)",
                "        except Exception:",
                "            pass",
                "        return False",
                "",
            ]
            # Insert helpers after imports
            insert_at = 1
            if self.import_numpy:
                insert_at += 1
            if self.import_pickle:
                insert_at += 1
            py[insert_at:insert_at] = helpers
        # Expose as list of lines for the driver
        self.output = "\n".join(py).splitlines()
        return "\n".join(py)

    # TDNT: Type definitions
    def visitTdntDecl(self, ctx:algoParser.TdntDeclContext):
        code = []
        for newtype in ctx.newTypeDecl():
            code.append(self.visit(newtype))
        return "\n".join(code)

    def visitNewTypeDecl(self, ctx:algoParser.NewTypeDeclContext):
        name = ctx.IDENTIFIER(0).getText()
        # enregistrement
        if ctx.getChild(2).getText() == "enregistrement":
            fields = [(idn.getText(), tname.getText()) for idn, tname in zip(ctx.IDENTIFIER()[1:], [tn for tn in ctx.typeName()])]
            code = []
            code.append(f"def {name}():")
            code.append("    return {")
            for fname, tname in fields:
                code.append(f'        "{fname}": {self.python_default(tname)},')
            code.append("    }")
            self.type_defs[name] = f"{name}()"
            return "\n".join(code)
        # tableau
        elif ctx.getChild(2).getText() == "tableau":
            # TDNT array type: produce a numpy array constructor
            self.import_numpy = True
            size = ctx.NUMBER().getText()
            tname = ctx.typeName(0).getText()
            dtype = self.numpy_dtype(tname)
            array_def = f"np.zeros({size}, dtype={dtype})"
            self.type_defs[name] = array_def
            return f"{name} = {array_def}"
        else:
            return f"# Unknown type {name}"

    # TDO: Variable initializations
    def visitTdoDecl(self, ctx:algoParser.TdoDeclContext):
        code = []
        for vardecl in ctx.varDecl():
            code.append(self.visit(vardecl))
        return "\n".join(code)

    def visitVarDecl(self, ctx:algoParser.VarDeclContext):
        varname = ctx.IDENTIFIER().getText()
        # Detect array declaration form (tableau de N type)
        try:
            children_text = [c.getText() for c in ctx.getChildren()]
        except Exception:
            children_text = []
        if 'tableau' in children_text and 'de' in children_text:
            try:
                size = ctx.NUMBER().getText()
            except Exception:
                size = '0'
            tname = ctx.typeName().getText() if ctx.typeName() else 'entier'
            self.import_numpy = True
            dtype = self.numpy_dtype(tname)
            return f"{varname} = np.zeros({size}, dtype={dtype})"
        else:
            typename = ctx.typeName().getText()
            constructor = self.type_defs.get(typename, self.python_default(typename))
            return f"{varname} = {constructor}"

    # Blocks
    def visitBlock(self, ctx:algoParser.BlockContext):
        return "\n".join([self.visit(stmt) for stmt in ctx.statement()])

    # Statement wrappers (dispatch from statement-alternative contexts)
    def visitInputStatement(self, ctx:algoParser.InputStatementContext):
        return self.visit(ctx.inputStmt())

    def visitOutputStatement(self, ctx:algoParser.OutputStatementContext):
        return self.visit(ctx.outputStmt())

    def visitIfStatement(self, ctx:algoParser.IfStatementContext):
        return self.visit(ctx.ifStmt())

    def visitWhileStatement(self, ctx:algoParser.WhileStatementContext):
        return self.visit(ctx.whileStmt())

    def visitForStatement(self, ctx:algoParser.ForStatementContext):
        return self.visit(ctx.forStmt())

    def visitJusquaStatement(self, ctx:algoParser.JusquaStatementContext):
        return self.visit(ctx.jusquaStmt())

    def visitSelonStatement(self, ctx:algoParser.SelonStatementContext):
        return self.visit(ctx.selonStmt())

    def visitProcedureDeclaration(self, ctx:algoParser.ProcedureDeclarationContext):
        return self.visit(ctx.procedureDecl())

    def visitFunctionDeclaration(self, ctx:algoParser.FunctionDeclarationContext):
        return self.visit(ctx.functionDecl())

    def visitFunctionCallStatement(self, ctx:algoParser.FunctionCallStatementContext):
        return self.visit(ctx.funcCall())

    def visitAssignStatement(self, ctx:algoParser.AssignStatementContext):
        return self.visit(ctx.assignStmt())

    # Concrete statement implementations (rule-level contexts)
    def visitInputStmt(self, ctx:algoParser.InputStmtContext):
        # Preferred: lire(file, var). Also accept lire(var) for stdin.
        filevar = None
        var = None
        try:
            ids = ctx.IDENTIFIER()
            if isinstance(ids, list):
                if len(ids) >= 2:
                    filevar = ids[0].getText()
                    var = ids[1].getText()
                elif len(ids) == 1:
                    var = ids[0].getText()
            elif ids is not None:
                var = ids.getText()
        except Exception:
            pass
        if var is None:
            # Fallback
            var = 'x'
        if filevar:
            # Use pickle for binary handles, otherwise read() and autodetect
            mode = self.file_modes.get(filevar, {})
            if mode.get('binary'):
                self.import_pickle = True
                return f"{var} = pickle.load({filevar})"
            return f"{var} = autodetect({filevar}.read())"
        return f"{var} = autodetect(input())"

    def visitOutputStmt(self, ctx:algoParser.OutputStmtContext):
        expr_nodes = list(ctx.expr())
        target = None
        # Leading handle: grammar allows optional IDENTIFIER before first expr
        try:
            ids = ctx.IDENTIFIER()
            lead = None
            if isinstance(ids, list) and len(ids) > 0:
                lead = ids[0].getText()
            elif ids is not None:
                lead = ids.getText()
            if lead and lead in self.file_modes:
                target = lead
        except Exception:
            pass
        # Detect 'vers IDENTIFIER'
        if not target:
            try:
                children = [c.getText() for c in ctx.getChildren()]
                if 'vers' in children:
                    i = children.index('vers')
                    if i + 1 < len(children):
                        cand = children[i + 1]
                        if cand in self.file_modes:
                            target = cand
            except Exception:
                pass
        # If no 'vers', prefer first-argument-as-file-handle style: ecrire(f, expr...)
        if not target and len(expr_nodes) >= 2:
            try:
                first_text = ctx.expr(0).getText()
                if first_text in self.file_modes:
                    target = first_text
                    expr_nodes = expr_nodes[1:]
            except Exception:
                pass
            if not target:
                try:
                    ch = [c.getText() for c in ctx.getChildren()]
                    if '(' in ch:
                        i = ch.index('(')
                        if i + 1 < len(ch) and ch[i+1] in self.file_modes:
                            target = ch[i+1]
                            # remove first expr node
                            if expr_nodes:
                                expr_nodes = expr_nodes[1:]
                except Exception:
                    pass
        # Back-compat: last-argument-as-file-handle style: ecrire(expr..., f)
        if not target and len(expr_nodes) >= 2:
            try:
                last_text = ctx.expr(len(ctx.expr()) - 1).getText()
                if last_text in self.file_modes:
                    target = last_text
                    expr_nodes = expr_nodes[:-1]
            except Exception:
                pass
        exprs = [self.visit(e) for e in expr_nodes]
        if target:
            # File write: use pickle for binary handles, otherwise f.write(str(expr))
            mode = self.file_modes.get(target, {})
            if mode.get('binary'):
                self.import_pickle = True
                if len(exprs) == 1:
                    return f"pickle.dump({exprs[0]}, {target})"
                # For multiple, dump each
                return "\n".join([f"pickle.dump({e}, {target})" for e in exprs])
            # Text: write each expr; convert to str explicitly
            if len(exprs) == 1:
                return f"{target}.write(str({exprs[0]}))"
            return "\n".join([f"{target}.write(str({e}))" for e in exprs])
        # Console output remains print
        return f"print({', '.join(exprs)})"

    # File I/O statement wrappers
    def visitOpenFileStatement(self, ctx):
        return self.visit(ctx.openFileStmt())

    def visitCloseFileStatement(self, ctx):
        return self.visit(ctx.closeFileStmt())

    def visitOpenFileStmt(self, ctx):
        # Grammar: 'ouvrir' '(' IDENTIFIER ',' IDENTIFIER ',' fileMode ')'
        # Semantics: first IDENTIFIER is path variable, second is file handle
        try:
            path_ident = ctx.IDENTIFIER(0).getText()
            file_ident = ctx.IDENTIFIER(1).getText()
        except Exception:
            ids = ctx.IDENTIFIER()
            if isinstance(ids, list) and len(ids) >= 2:
                path_ident, file_ident = ids[0].getText(), ids[1].getText()
            else:
                name = ids.getText() if not isinstance(ids, list) else ids[0].getText()
                path_ident, file_ident = name, name
        # Mode token is the penultimate child (before ')')
        try:
            mode_text = ctx.getChild(ctx.getChildCount() - 2).getText()
        except Exception:
            mode_text = 'r'
        # Ensure mode is quoted for Python open()
        if not (mode_text.startswith("'") or mode_text.startswith('"')):
            mode_text = f"'{mode_text}'"
        # Track mode for downstream read/write behavior
        unquoted = mode_text.strip('"\'')
        self.file_modes[file_ident] = { 'mode': unquoted, 'binary': ('b' in unquoted.lower()) }
        if 'b' in unquoted.lower():
            self.import_pickle = True
        return f"{file_ident} = open({path_ident}, {mode_text})"

    def visitCloseFileStmt(self, ctx):
        name = ctx.IDENTIFIER().getText()
        return f"{name}.close()"

    def visitIfStmt(self, ctx:algoParser.IfStmtContext):
        py = []
        py.append(f"if {self.visit(ctx.expr(0))}:")
        py.append(self.indent(self.visit(ctx.block(0))))
        # elif branches
        for i in range(1, len(ctx.expr())):
            py.append(f"elif {self.visit(ctx.expr(i))}:")
            py.append(self.indent(self.visit(ctx.block(i))))
        # else branch
        if ctx.block(-1) and ctx.getChildCount() > 6:  # has 'sinon'
            py.append("else:")
            py.append(self.indent(self.visit(ctx.block(-1))))
        return "\n".join(py)

    def visitWhileStmt(self, ctx:algoParser.WhileStmtContext):
        cond = self.visit(ctx.expr())
        py = [f"while {cond}:"]
        py.append(self.indent(self.visit(ctx.block())))
        return "\n".join(py)

    def visitForStmt(self, ctx:algoParser.ForStmtContext):
        var = ctx.IDENTIFIER().getText()
        start = self.visit(ctx.expr(0))
        end = self.visit(ctx.expr(1))
        step = self.visit(ctx.expr(2)) if ctx.expr(2) else "1"
        py = [f"for {var} in range({start}, {end}+1, {step}):"]
        py.append(self.indent(self.visit(ctx.block())))
        return "\n".join(py)

    def visitJusquaStmt(self, ctx:algoParser.JusquaStmtContext):
        py = []
        py.append("while True:")
        py.append(self.indent(self.visit(ctx.block())))
        py.append(f"    if {self.visit(ctx.expr())}: break")
        return "\n".join(py)

    def visitSelonStmt(self, ctx:algoParser.SelonStmtContext):
        expr = self.visit(ctx.expr())
        py = []
        first_case = True
        for i, case_expr in enumerate(ctx.expr()[1:]):
            block = ctx.block(i)
            cond = f"{expr} == {self.visit(case_expr)}"
            if first_case:
                py.append(f"if {cond}:")
                first_case = False
            else:
                py.append(f"elif {cond}:")
            py.append(self.indent(self.visit(block)))
        # autres/default
        if ctx.block(-1):
            py.append("else:")
            py.append(self.indent(self.visit(ctx.block(-1))))
        return "\n".join(py)

    # Procedures / Functions
    def visitProcedureDecl(self, ctx:algoParser.ProcedureDeclContext):
        name = ctx.IDENTIFIER().getText()
        params = self.visit(ctx.paramList()) if ctx.paramList() else ""
        py = [f"def {name}({params}):"]
        py.append(self.indent(self.visit(ctx.block())))
        return "\n".join(py)

    def visitFunctionDecl(self, ctx:algoParser.FunctionDeclContext):
        name = ctx.IDENTIFIER().getText()
        params = self.visit(ctx.paramList()) if ctx.paramList() else ""
        py = [f"def {name}({params}):"]
        py.append(self.indent(self.visit(ctx.block())))
        py.append(self.indent(f"return {self.visit(ctx.expr())}"))
        return "\n".join(py)

    def visitParamList(self, ctx:algoParser.ParamListContext):
        return ", ".join([self.visit(p) for p in ctx.param()])

    def visitParam(self, ctx:algoParser.ParamContext):
        return ctx.IDENTIFIER().getText()

    # Function / Procedure Calls
    def visitFuncCall(self, ctx:algoParser.FuncCallContext):
        name = ctx.IDENTIFIER().getText()
        args = [self.visit(e) for e in ctx.expr()]
        # Compatibility shim: treat ouvrir(...) and fermer(...) as file I/O if grammar path isn't used
        if name == 'ouvrir' and len(args) == 3:
            path, handle, mode = args[0], args[1], args[2]
            if not (mode.startswith("'") or mode.startswith('"')):
                mode = f"'{mode}'"
            unquoted = mode.strip('"\'')
            self.file_modes[handle] = { 'mode': unquoted, 'binary': ('b' in unquoted.lower()) }
            if 'b' in unquoted.lower():
                self.import_pickle = True
            return f"{handle} = open({path}, {mode})"
        if name == 'fermer' and len(args) == 1:
            return f"{args[0]}.close()"
        if name == 'lireln' and len(args) == 2:
            # lireln(file, var): read one line (text). Binary not supported; treat as text.
            f, var = args[0], args[1]
            return f"{var} = {f}.readline()"
        if name == 'lire' and (1 <= len(args) <= 2):
            # Support:
            #  - lire(var)
            #  - lire(var, f)
            #  - lire(f, var)  <-- preferred style
            if len(args) == 1:
                var = args[0]
                return f"{var} = autodetect(input())"
            a, b = args[0], args[1]
            # If first arg is a known file handle, treat as lire(f, var)
            if a in self.file_modes:
                f, var = a, b
            else:
                var, f = a, b
            mode = self.file_modes.get(f, {})
            if mode.get('binary'):
                self.import_pickle = True
                return f"{var} = pickle.load({f})"
            return f"{var} = autodetect({f}.read())"
        if name == 'finfichier' and len(args) == 1:
            f = args[0]
            self.need_eof_helpers = True
            info = self.file_modes.get(f, {})
            if info.get('binary') is True:
                return f"__eof_bin({f})"
            if info.get('binary') is False:
                return f"__eof_text({f})"
            # Fallback: try binary check first if available
            return f"(__eof_bin({f}) if hasattr({f}, 'peek') else __eof_text({f}))"
        if name == 'ecrire' and len(args) >= 1:
            # ecrire(f, expr...) or ecrire(expr...) -> console
            if len(args) >= 2:
                f = args[0]
                exprs = args[1:]
                mode = self.file_modes.get(f, {})
                if mode.get('binary'):
                    self.import_pickle = True
                    if len(exprs) == 1:
                        return f"pickle.dump({exprs[0]}, {f})"
                    return "\n".join([f"pickle.dump({e}, {f})" for e in exprs])
                if len(exprs) == 1:
                    return f"{f}.write(str({exprs[0]}))"
                return "\n".join([f"{f}.write(str({e}))" for e in exprs])
            # console print
            return f"print({', '.join(args)})"
        return f"{name}({', '.join(args)})"

    # Assignment
    def visitAssignStmt(self, ctx:algoParser.AssignStmtContext):
        var = ctx.IDENTIFIER().getText()
        value = self.visit(ctx.expr())
        return f"{var} = {value}"

    # Expressions
    def visitMulDiv(self, ctx:algoParser.MulDivContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        return f"({left} {op} {right})"

    def visitAddSub(self, ctx:algoParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        return f"({left} {op} {right})"

    def visitComparison(self, ctx:algoParser.ComparisonContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        op_map = {'=': '==', '≠': '!=', '<': '<', '≤': '<=', '>': '>', '≥': '>='}
        py_op = op_map.get(op, op)
        return f"({left} {py_op} {right})"

    def visitLogical(self, ctx:algoParser.LogicalContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        op_map = {'et': 'and', 'ou': 'or', 'ouex': '^'}
        py_op = op_map.get(op, op)
        return f"({left} {py_op} {right})"

    def visitNegate(self, ctx:algoParser.NegateContext):
        return f"(not {self.visit(ctx.expr())})"

    def visitParens(self, ctx:algoParser.ParensContext):
        return f"({self.visit(ctx.expr())})"

    def visitNumber(self, ctx:algoParser.NumberContext):
        return ctx.NUMBER().getText()

    def visitBoolean(self, ctx:algoParser.BooleanContext):
        val = ctx.BOOLEAN().getText()
        return "True" if val == "vrai" else "False"

    def visitString(self, ctx:algoParser.StringContext):
        return ctx.STRING().getText()

    def visitChar(self, ctx:algoParser.CharContext):
        return ctx.CHAR().getText()

    def visitVariable(self, ctx:algoParser.VariableContext):
        return ctx.IDENTIFIER().getText()

    # Utility
    def python_default(self, tname):
        tname = tname.lower()
        if tname in ["entier"]:
            return "0"
        elif tname in ["réel", "reel"]:
            return "0.0"
        elif tname in ["booléen", "booleen", "bool"]:
            return "False"
        elif tname in ["caractère", "caractere"]:
            return "''"
        elif tname in ["chaîne", "chaine"]:
            return "''"
        elif tname in self.type_defs:
            return f"{tname}()"
        return "None"

    def numpy_dtype(self, tname):
        tname = tname.lower()
        if tname in ["entier"]:
            return "int"
        elif tname in ["réel", "reel"]:
            return "float"
        elif tname in ["booléen", "booleen", "bool"]:
            return "bool"
        else:
            return "object"

    def indent(self, text):
        return "\n".join(["    " + line for line in text.splitlines() if line.strip() != ""])
