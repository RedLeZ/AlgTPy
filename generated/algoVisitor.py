# Generated from algo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .algoParser import algoParser
else:
    from algoParser import algoParser

# This class defines a complete generic visitor for a parse tree produced by algoParser.

class algoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by algoParser#varDecl.
    def visitVarDecl(self, ctx:algoParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#program.
    def visitProgram(self, ctx:algoParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#VarDeclStatement.
    def visitVarDeclStatement(self, ctx:algoParser.VarDeclStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#InputStatement.
    def visitInputStatement(self, ctx:algoParser.InputStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#OutputStatement.
    def visitOutputStatement(self, ctx:algoParser.OutputStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#IfStatement.
    def visitIfStatement(self, ctx:algoParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#WhileStatement.
    def visitWhileStatement(self, ctx:algoParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#ForStatement.
    def visitForStatement(self, ctx:algoParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#block.
    def visitBlock(self, ctx:algoParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#inputStmt.
    def visitInputStmt(self, ctx:algoParser.InputStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#outputStmt.
    def visitOutputStmt(self, ctx:algoParser.OutputStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#ifStmt.
    def visitIfStmt(self, ctx:algoParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#elseifBlock.
    def visitElseifBlock(self, ctx:algoParser.ElseifBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#elseBlock.
    def visitElseBlock(self, ctx:algoParser.ElseBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#whileStmt.
    def visitWhileStmt(self, ctx:algoParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#forStmt.
    def visitForStmt(self, ctx:algoParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Variable.
    def visitVariable(self, ctx:algoParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Number.
    def visitNumber(self, ctx:algoParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#MulDiv.
    def visitMulDiv(self, ctx:algoParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#AddSub.
    def visitAddSub(self, ctx:algoParser.AddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Comparison.
    def visitComparison(self, ctx:algoParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Parens.
    def visitParens(self, ctx:algoParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Char.
    def visitChar(self, ctx:algoParser.CharContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#LogicalAndOr.
    def visitLogicalAndOr(self, ctx:algoParser.LogicalAndOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Negate.
    def visitNegate(self, ctx:algoParser.NegateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#String.
    def visitString(self, ctx:algoParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#Boolean.
    def visitBoolean(self, ctx:algoParser.BooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#typeName.
    def visitTypeName(self, ctx:algoParser.TypeNameContext):
        return self.visitChildren(ctx)



del algoParser