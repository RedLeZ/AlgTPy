# Generated from algo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .algoParser import algoParser
else:
    from algoParser import algoParser

# This class defines a complete listener for a parse tree produced by algoParser.
class algoListener(ParseTreeListener):

    # Enter a parse tree produced by algoParser#program.
    def enterProgram(self, ctx:algoParser.ProgramContext):
        pass

    # Exit a parse tree produced by algoParser#program.
    def exitProgram(self, ctx:algoParser.ProgramContext):
        pass


    # Enter a parse tree produced by algoParser#tdntDecl.
    def enterTdntDecl(self, ctx:algoParser.TdntDeclContext):
        pass

    # Exit a parse tree produced by algoParser#tdntDecl.
    def exitTdntDecl(self, ctx:algoParser.TdntDeclContext):
        pass


    # Enter a parse tree produced by algoParser#newTypeDecl.
    def enterNewTypeDecl(self, ctx:algoParser.NewTypeDeclContext):
        pass

    # Exit a parse tree produced by algoParser#newTypeDecl.
    def exitNewTypeDecl(self, ctx:algoParser.NewTypeDeclContext):
        pass


    # Enter a parse tree produced by algoParser#tdoDecl.
    def enterTdoDecl(self, ctx:algoParser.TdoDeclContext):
        pass

    # Exit a parse tree produced by algoParser#tdoDecl.
    def exitTdoDecl(self, ctx:algoParser.TdoDeclContext):
        pass


    # Enter a parse tree produced by algoParser#varDecl.
    def enterVarDecl(self, ctx:algoParser.VarDeclContext):
        pass

    # Exit a parse tree produced by algoParser#varDecl.
    def exitVarDecl(self, ctx:algoParser.VarDeclContext):
        pass


    # Enter a parse tree produced by algoParser#block.
    def enterBlock(self, ctx:algoParser.BlockContext):
        pass

    # Exit a parse tree produced by algoParser#block.
    def exitBlock(self, ctx:algoParser.BlockContext):
        pass


    # Enter a parse tree produced by algoParser#InputStatement.
    def enterInputStatement(self, ctx:algoParser.InputStatementContext):
        pass

    # Exit a parse tree produced by algoParser#InputStatement.
    def exitInputStatement(self, ctx:algoParser.InputStatementContext):
        pass


    # Enter a parse tree produced by algoParser#OutputStatement.
    def enterOutputStatement(self, ctx:algoParser.OutputStatementContext):
        pass

    # Exit a parse tree produced by algoParser#OutputStatement.
    def exitOutputStatement(self, ctx:algoParser.OutputStatementContext):
        pass


    # Enter a parse tree produced by algoParser#IfStatement.
    def enterIfStatement(self, ctx:algoParser.IfStatementContext):
        pass

    # Exit a parse tree produced by algoParser#IfStatement.
    def exitIfStatement(self, ctx:algoParser.IfStatementContext):
        pass


    # Enter a parse tree produced by algoParser#WhileStatement.
    def enterWhileStatement(self, ctx:algoParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by algoParser#WhileStatement.
    def exitWhileStatement(self, ctx:algoParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by algoParser#ForStatement.
    def enterForStatement(self, ctx:algoParser.ForStatementContext):
        pass

    # Exit a parse tree produced by algoParser#ForStatement.
    def exitForStatement(self, ctx:algoParser.ForStatementContext):
        pass


    # Enter a parse tree produced by algoParser#JusquaStatement.
    def enterJusquaStatement(self, ctx:algoParser.JusquaStatementContext):
        pass

    # Exit a parse tree produced by algoParser#JusquaStatement.
    def exitJusquaStatement(self, ctx:algoParser.JusquaStatementContext):
        pass


    # Enter a parse tree produced by algoParser#SelonStatement.
    def enterSelonStatement(self, ctx:algoParser.SelonStatementContext):
        pass

    # Exit a parse tree produced by algoParser#SelonStatement.
    def exitSelonStatement(self, ctx:algoParser.SelonStatementContext):
        pass


    # Enter a parse tree produced by algoParser#ProcedureDeclaration.
    def enterProcedureDeclaration(self, ctx:algoParser.ProcedureDeclarationContext):
        pass

    # Exit a parse tree produced by algoParser#ProcedureDeclaration.
    def exitProcedureDeclaration(self, ctx:algoParser.ProcedureDeclarationContext):
        pass


    # Enter a parse tree produced by algoParser#FunctionDeclaration.
    def enterFunctionDeclaration(self, ctx:algoParser.FunctionDeclarationContext):
        pass

    # Exit a parse tree produced by algoParser#FunctionDeclaration.
    def exitFunctionDeclaration(self, ctx:algoParser.FunctionDeclarationContext):
        pass


    # Enter a parse tree produced by algoParser#FunctionCallStatement.
    def enterFunctionCallStatement(self, ctx:algoParser.FunctionCallStatementContext):
        pass

    # Exit a parse tree produced by algoParser#FunctionCallStatement.
    def exitFunctionCallStatement(self, ctx:algoParser.FunctionCallStatementContext):
        pass


    # Enter a parse tree produced by algoParser#AssignStatement.
    def enterAssignStatement(self, ctx:algoParser.AssignStatementContext):
        pass

    # Exit a parse tree produced by algoParser#AssignStatement.
    def exitAssignStatement(self, ctx:algoParser.AssignStatementContext):
        pass


    # Enter a parse tree produced by algoParser#inputStmt.
    def enterInputStmt(self, ctx:algoParser.InputStmtContext):
        pass

    # Exit a parse tree produced by algoParser#inputStmt.
    def exitInputStmt(self, ctx:algoParser.InputStmtContext):
        pass


    # Enter a parse tree produced by algoParser#outputStmt.
    def enterOutputStmt(self, ctx:algoParser.OutputStmtContext):
        pass

    # Exit a parse tree produced by algoParser#outputStmt.
    def exitOutputStmt(self, ctx:algoParser.OutputStmtContext):
        pass


    # Enter a parse tree produced by algoParser#ifStmt.
    def enterIfStmt(self, ctx:algoParser.IfStmtContext):
        pass

    # Exit a parse tree produced by algoParser#ifStmt.
    def exitIfStmt(self, ctx:algoParser.IfStmtContext):
        pass


    # Enter a parse tree produced by algoParser#whileStmt.
    def enterWhileStmt(self, ctx:algoParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by algoParser#whileStmt.
    def exitWhileStmt(self, ctx:algoParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by algoParser#forStmt.
    def enterForStmt(self, ctx:algoParser.ForStmtContext):
        pass

    # Exit a parse tree produced by algoParser#forStmt.
    def exitForStmt(self, ctx:algoParser.ForStmtContext):
        pass


    # Enter a parse tree produced by algoParser#jusquaStmt.
    def enterJusquaStmt(self, ctx:algoParser.JusquaStmtContext):
        pass

    # Exit a parse tree produced by algoParser#jusquaStmt.
    def exitJusquaStmt(self, ctx:algoParser.JusquaStmtContext):
        pass


    # Enter a parse tree produced by algoParser#selonStmt.
    def enterSelonStmt(self, ctx:algoParser.SelonStmtContext):
        pass

    # Exit a parse tree produced by algoParser#selonStmt.
    def exitSelonStmt(self, ctx:algoParser.SelonStmtContext):
        pass


    # Enter a parse tree produced by algoParser#procedureDecl.
    def enterProcedureDecl(self, ctx:algoParser.ProcedureDeclContext):
        pass

    # Exit a parse tree produced by algoParser#procedureDecl.
    def exitProcedureDecl(self, ctx:algoParser.ProcedureDeclContext):
        pass


    # Enter a parse tree produced by algoParser#functionDecl.
    def enterFunctionDecl(self, ctx:algoParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by algoParser#functionDecl.
    def exitFunctionDecl(self, ctx:algoParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by algoParser#paramList.
    def enterParamList(self, ctx:algoParser.ParamListContext):
        pass

    # Exit a parse tree produced by algoParser#paramList.
    def exitParamList(self, ctx:algoParser.ParamListContext):
        pass


    # Enter a parse tree produced by algoParser#param.
    def enterParam(self, ctx:algoParser.ParamContext):
        pass

    # Exit a parse tree produced by algoParser#param.
    def exitParam(self, ctx:algoParser.ParamContext):
        pass


    # Enter a parse tree produced by algoParser#funcCall.
    def enterFuncCall(self, ctx:algoParser.FuncCallContext):
        pass

    # Exit a parse tree produced by algoParser#funcCall.
    def exitFuncCall(self, ctx:algoParser.FuncCallContext):
        pass


    # Enter a parse tree produced by algoParser#Variable.
    def enterVariable(self, ctx:algoParser.VariableContext):
        pass

    # Exit a parse tree produced by algoParser#Variable.
    def exitVariable(self, ctx:algoParser.VariableContext):
        pass


    # Enter a parse tree produced by algoParser#Number.
    def enterNumber(self, ctx:algoParser.NumberContext):
        pass

    # Exit a parse tree produced by algoParser#Number.
    def exitNumber(self, ctx:algoParser.NumberContext):
        pass


    # Enter a parse tree produced by algoParser#MulDiv.
    def enterMulDiv(self, ctx:algoParser.MulDivContext):
        pass

    # Exit a parse tree produced by algoParser#MulDiv.
    def exitMulDiv(self, ctx:algoParser.MulDivContext):
        pass


    # Enter a parse tree produced by algoParser#AddSub.
    def enterAddSub(self, ctx:algoParser.AddSubContext):
        pass

    # Exit a parse tree produced by algoParser#AddSub.
    def exitAddSub(self, ctx:algoParser.AddSubContext):
        pass


    # Enter a parse tree produced by algoParser#Comparison.
    def enterComparison(self, ctx:algoParser.ComparisonContext):
        pass

    # Exit a parse tree produced by algoParser#Comparison.
    def exitComparison(self, ctx:algoParser.ComparisonContext):
        pass


    # Enter a parse tree produced by algoParser#Parens.
    def enterParens(self, ctx:algoParser.ParensContext):
        pass

    # Exit a parse tree produced by algoParser#Parens.
    def exitParens(self, ctx:algoParser.ParensContext):
        pass


    # Enter a parse tree produced by algoParser#Char.
    def enterChar(self, ctx:algoParser.CharContext):
        pass

    # Exit a parse tree produced by algoParser#Char.
    def exitChar(self, ctx:algoParser.CharContext):
        pass


    # Enter a parse tree produced by algoParser#Logical.
    def enterLogical(self, ctx:algoParser.LogicalContext):
        pass

    # Exit a parse tree produced by algoParser#Logical.
    def exitLogical(self, ctx:algoParser.LogicalContext):
        pass


    # Enter a parse tree produced by algoParser#Negate.
    def enterNegate(self, ctx:algoParser.NegateContext):
        pass

    # Exit a parse tree produced by algoParser#Negate.
    def exitNegate(self, ctx:algoParser.NegateContext):
        pass


    # Enter a parse tree produced by algoParser#String.
    def enterString(self, ctx:algoParser.StringContext):
        pass

    # Exit a parse tree produced by algoParser#String.
    def exitString(self, ctx:algoParser.StringContext):
        pass


    # Enter a parse tree produced by algoParser#Boolean.
    def enterBoolean(self, ctx:algoParser.BooleanContext):
        pass

    # Exit a parse tree produced by algoParser#Boolean.
    def exitBoolean(self, ctx:algoParser.BooleanContext):
        pass


    # Enter a parse tree produced by algoParser#FuncCallExpr.
    def enterFuncCallExpr(self, ctx:algoParser.FuncCallExprContext):
        pass

    # Exit a parse tree produced by algoParser#FuncCallExpr.
    def exitFuncCallExpr(self, ctx:algoParser.FuncCallExprContext):
        pass


    # Enter a parse tree produced by algoParser#assignStmt.
    def enterAssignStmt(self, ctx:algoParser.AssignStmtContext):
        pass

    # Exit a parse tree produced by algoParser#assignStmt.
    def exitAssignStmt(self, ctx:algoParser.AssignStmtContext):
        pass


    # Enter a parse tree produced by algoParser#typeName.
    def enterTypeName(self, ctx:algoParser.TypeNameContext):
        pass

    # Exit a parse tree produced by algoParser#typeName.
    def exitTypeName(self, ctx:algoParser.TypeNameContext):
        pass



del algoParser