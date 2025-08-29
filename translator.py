from generated.algoVisitor import algoVisitor
from generated.algoParser import algoParser

type_map = {
    "entier": "int",
    "reel": "float", "réel": "float",
    "booleen": "bool", "booléen": "bool", "bool": "bool",
    "caractere": "str", "caractère": "str",
    "chaine": "str"
}

def _indent_block(code: str, levels: int = 1) -> str:
    if code is None or code == "":
        return ""
    prefix = "    " * levels
    return "\n".join(prefix + line if line.strip() != "" else "" for line in code.split("\n"))

class Translator(algoVisitor):
    def __init__(self, strict_level=2):
        self.output = []
        self.var_types = {}
        self.indent_level = 0
        self.strict_level = strict_level

    # ------- program driver: collect strings from statement visitors and emit with current indent -------
    def visitProgram(self, ctx):
        # program : (statement NEWLINE?)* EOF
        for stmt_ctx in ctx.statement():
            code = self.visit(stmt_ctx)
            if code:
                for line in code.split("\n"):
                    self._emit(line)
        return None

    def _emit(self, line: str):
        indent = "    " * self.indent_level
        self.output.append(f"{indent}{line}")

    # ------------------ Statements (return strings) ------------------
    def visitVarDeclStatement(self, ctx: algoParser.VarDeclStatementContext):
        # ctx.varDecl() -> VarDeclContext
        vd = ctx.varDecl()
        name = vd.IDENTIFIER().getText()
        expr_code = self.visit(vd.expr())
        return f"{name} = {expr_code}"

    # Accept alternative name if generated differently
    visitVarDecl = visitVarDeclStatement

    def visitInputStatement(self, ctx: algoParser.InputStatementContext):
        # ctx.inputStmt() -> InputStmtContext
        stmt = ctx.inputStmt()
        name = stmt.IDENTIFIER().getText()
        type_ctx = stmt.typeName()

        if type_ctx:
            typ = type_ctx.getText().lower()
            py_type = type_map.get(typ, "str")

            if py_type == "int":
                if self.strict_level >= 2:
                    return (
                        f"try:\n"
                        f"    {name} = int(input())\n"
                        f"except ValueError:\n"
                        f"    raise ValueError('Input is not an integer')"
                    )
                else:
                    return f"{name} = int(input())"

            elif py_type == "float":
                if self.strict_level >= 2:
                    return (
                        f"try:\n"
                        f"    {name} = float(input())\n"
                        f"except ValueError:\n"
                        f"    raise ValueError('Input is not a float')"
                    )
                else:
                    return f"{name} = float(input())"

            elif py_type == "bool":
                return (
                    f"val = input().strip().lower()\n"
                    f"if val in ['vrai','true']:\n"
                    f"    {name} = True\n"
                    f"elif val in ['faux','false']:\n"
                    f"    {name} = False\n"
                    f"else:\n"
                    f"    raise ValueError(f'{{val}} is not a boolean')"
                )
            else:
                return f"{name} = input()"
        else:
            return f"{name} = autodetect(input())"

    visitInputStmt = visitInputStatement

    def visitOutputStatement(self, ctx: algoParser.OutputStatementContext):
        stmt = ctx.outputStmt()
        expr_code = self.visit(stmt.expr())
        return f"print({expr_code})"

    visitOutputStmt = visitOutputStatement

    # ------------------ If / ElseIf / Else (compound: return multi-line string with inner lines indented 1 level) ------------------
    def _render_block_ctx(self, block_ctx):
        """Given a BlockContext, return the multi-line string for that block (each inner statement already indented by 1 level)."""
        lines = []
        # block rule: (statement NEWLINE?)*
        for stmt in block_ctx.statement():
            stmt_code = self.visit(stmt)  # must return a string
            if stmt_code:
                # indent the returned statement-string by 1 level (relative indentation inside the if)
                for subline in stmt_code.split("\n"):
                    lines.append("    " + subline)
        return "\n".join(lines)

    def _render_ifstmt_core(self, ifctx):
        """ifctx is an IfStmtContext (not the wrapper). Return a multi-line string representing the whole if/elif/else
           with inner statements already indented one level (4 spaces)."""
        lines = []
        cond_code = self.visit(ifctx.expr())
        lines.append(f"if {cond_code}:")

        # main then block: ifctx.block() returns a BlockContext
        then_block = ifctx.block()
        lines.append(self._render_block_ctx(then_block))

        # elseifBlock(): zero or more ElseifBlockContext; each has expr and block()
        for elseif in (ifctx.elseifBlock() or []):
            elif_cond = self.visit(elseif.expr())
            lines.append(f"elif {elif_cond}:")
            lines.append(self._render_block_ctx(elseif.block()))

        else_ctx = ifctx.elseBlock()
        if else_ctx:
            lines.append("else:")
            if hasattr(else_ctx, "block"):
                else_block = else_ctx.block()
            else:
                else_block = else_ctx
            lines.append(self._render_block_ctx(else_block))

      
  
        out_lines = []
        for piece in lines:
            if piece is None:
                continue
            for l in str(piece).split("\n"):
                if l != "":
                    out_lines.append(l)
        return "\n".join(out_lines)

    def visitIfStatement(self, ctx: algoParser.IfStatementContext):
        ifctx = ctx.ifStmt()
        return self._render_ifstmt_core(ifctx)

    def visitIfStmt(self, ctx: algoParser.IfStmtContext):
        return self._render_ifstmt_core(ctx)

    # ------------------ While loop ------------------
    def visitWhileStmt(self, ctx: algoParser.WhileStmtContext):
        cond_code = self.visit(ctx.expr())
        lines = [f"while {cond_code}:"]
        lines.append(self._render_block_ctx(ctx.block()))
        return "\n".join(lines)

    # ------------------ For loop ------------------    
    def visitForStmt(self, ctx: algoParser.ForStmtContext):
        var_name = ctx.IDENTIFIER().getText()
        start = self.visit(ctx.expr(0))
        end = self.visit(ctx.expr(1))
        step = self.visit(ctx.expr(2)) if ctx.expr(2) else "1"

        lines = [f"for {var_name} in range({start}, {end}+1, {step}):"]
        lines.append(self._render_block_ctx(ctx.block()))
        return "\n".join(lines)
    
    # -------------------- Jusqu'a --------------------
    def visitJusquaStmt(self, ctx: algoParser.JusquaStmtContext):
        # condition is after 'jusqua'
        cond_code = self.visit(ctx.expr())

        # emit while-not condition
        lines = []
        lines.append(f"while not ({cond_code}):")

        # block of code to repeat
        block_code = []
        for stmt in ctx.block().statement():
            stmt_code = self.visit(stmt)
            if stmt_code:
                for subline in stmt_code.split("\n"):
                    block_code.append("    " + subline)

        lines.extend(block_code)
        return "\n".join(lines)

   # ------------------ Expressions ------------------
    def visitMulDiv(self, ctx: algoParser.MulDivContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        return f"({left} {op} {right})"

    def visitAddSub(self, ctx: algoParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        return f"({left} {op} {right})"

    def visitComparison(self, ctx: algoParser.ComparisonContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        return f"({left} {op} {right})"

    def visitLogicalAndOr(self, ctx: algoParser.LogicalAndOrContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        op = ctx.op.text
        if op == "et":
            op = "and"
        elif op == "ou":
            op = "or"
        return f"({left} {op} {right})"

    def visitNegate(self, ctx: algoParser.NegateContext):
        expr = self.visit(ctx.expr())
        return f"-{expr}"

    def visitParens(self, ctx: algoParser.ParensContext):
        expr = self.visit(ctx.expr())
        return f"({expr})"

    def visitNumber(self, ctx: algoParser.NumberContext):
        return ctx.NUMBER().getText()

    def visitBoolean(self, ctx: algoParser.BooleanContext):
        b = ctx.BOOLEAN().getText()
        return "True" if b.lower() == "vrai" else "False"

    def visitString(self, ctx: algoParser.StringContext):
        return ctx.STRING().getText()

    def visitChar(self, ctx: algoParser.CharContext):
        return ctx.CHAR().getText()

    def visitVariable(self, ctx: algoParser.VariableContext):
        return ctx.IDENTIFIER().getText()

    # Fallback generic visitor for unlabeled statement contexts 
    def visitStatement(self, ctx):
        if ctx.varDecl():
            return self.visitVarDeclStatement(ctx)
        if ctx.inputStmt():
            return self.visitInputStatement(ctx)
        if ctx.outputStmt():
            return self.visitOutputStatement(ctx)
        if ctx.ifStmt():
            return self.visitIfStmt(ctx.ifStmt())
        return None

