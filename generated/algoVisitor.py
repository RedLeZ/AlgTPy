# Generated from algo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .algoParser import algoParser
else:
    from algoParser import algoParser

# This class defines a complete generic visitor for a parse tree produced by algoParser.

class algoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by algoParser#program.
    def visitProgram(self, ctx:algoParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#tdntDecl.
    def visitTdntDecl(self, ctx:algoParser.TdntDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#newTypeDecl.
    def visitNewTypeDecl(self, ctx:algoParser.NewTypeDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#tdoDecl.
    def visitTdoDecl(self, ctx:algoParser.TdoDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#varDecl.
    def visitVarDecl(self, ctx:algoParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#block.
    def visitBlock(self, ctx:algoParser.BlockContext):
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


    # Visit a parse tree produced by algoParser#JusquaStatement.
    def visitJusquaStatement(self, ctx:algoParser.JusquaStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#SelonStatement.
    def visitSelonStatement(self, ctx:algoParser.SelonStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#ProcedureDeclaration.
    def visitProcedureDeclaration(self, ctx:algoParser.ProcedureDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#FunctionDeclaration.
    def visitFunctionDeclaration(self, ctx:algoParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#FunctionCallStatement.
    def visitFunctionCallStatement(self, ctx:algoParser.FunctionCallStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#AssignStatement.
    def visitAssignStatement(self, ctx:algoParser.AssignStatementContext):
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


    # Visit a parse tree produced by algoParser#whileStmt.
    def visitWhileStmt(self, ctx:algoParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#forStmt.
    def visitForStmt(self, ctx:algoParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#jusquaStmt.
    def visitJusquaStmt(self, ctx:algoParser.JusquaStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#selonStmt.
    def visitSelonStmt(self, ctx:algoParser.SelonStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#procedureDecl.
    def visitProcedureDecl(self, ctx:algoParser.ProcedureDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#functionDecl.
    def visitFunctionDecl(self, ctx:algoParser.FunctionDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#paramList.
    def visitParamList(self, ctx:algoParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#param.
    def visitParam(self, ctx:algoParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#funcCall.
    def visitFuncCall(self, ctx:algoParser.FuncCallContext):
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


    # Visit a parse tree produced by algoParser#Logical.
    def visitLogical(self, ctx:algoParser.LogicalContext):
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


    # Visit a parse tree produced by algoParser#FuncCallExpr.
    def visitFuncCallExpr(self, ctx:algoParser.FuncCallExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#assignStmt.
    def visitAssignStmt(self, ctx:algoParser.AssignStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by algoParser#typeName.
    def visitTypeName(self, ctx:algoParser.TypeNameContext):
        return self.visitChildren(ctx)



del algoParser