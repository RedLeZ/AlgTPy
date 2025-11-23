// Generated from /Users/redlez.shadow/Documents/Red Work/AlgTPy/algo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link algoParser}.
 */
public interface algoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link algoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(algoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(algoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#tdntDecl}.
	 * @param ctx the parse tree
	 */
	void enterTdntDecl(algoParser.TdntDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#tdntDecl}.
	 * @param ctx the parse tree
	 */
	void exitTdntDecl(algoParser.TdntDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#newTypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeDecl(algoParser.NewTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#newTypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeDecl(algoParser.NewTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#tdoDecl}.
	 * @param ctx the parse tree
	 */
	void enterTdoDecl(algoParser.TdoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#tdoDecl}.
	 * @param ctx the parse tree
	 */
	void exitTdoDecl(algoParser.TdoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(algoParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(algoParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(algoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(algoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(algoParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(algoParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(algoParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(algoParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenFileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOpenFileStatement(algoParser.OpenFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenFileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOpenFileStatement(algoParser.OpenFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseFileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCloseFileStatement(algoParser.CloseFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseFileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCloseFileStatement(algoParser.CloseFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(algoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(algoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(algoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(algoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(algoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(algoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JusquaStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterJusquaStatement(algoParser.JusquaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JusquaStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitJusquaStatement(algoParser.JusquaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelonStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelonStatement(algoParser.SelonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelonStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelonStatement(algoParser.SelonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcedureDeclaration}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(algoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcedureDeclaration}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(algoParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(algoParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(algoParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(algoParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(algoParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(algoParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link algoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(algoParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#openFileStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenFileStmt(algoParser.OpenFileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#openFileStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenFileStmt(algoParser.OpenFileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#closeFileStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseFileStmt(algoParser.CloseFileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#closeFileStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseFileStmt(algoParser.CloseFileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(algoParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(algoParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmt(algoParser.OutputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmt(algoParser.OutputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(algoParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(algoParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(algoParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(algoParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(algoParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(algoParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#jusquaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJusquaStmt(algoParser.JusquaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#jusquaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJusquaStmt(algoParser.JusquaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#selonStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelonStmt(algoParser.SelonStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#selonStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelonStmt(algoParser.SelonStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#procedureDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDecl(algoParser.ProcedureDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#procedureDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDecl(algoParser.ProcedureDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(algoParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(algoParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(algoParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(algoParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(algoParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(algoParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(algoParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(algoParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(algoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(algoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(algoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(algoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(algoParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(algoParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(algoParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(algoParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(algoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(algoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(algoParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(algoParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(algoParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(algoParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical(algoParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical(algoParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(algoParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(algoParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(algoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(algoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(algoParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(algoParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(algoParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link algoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(algoParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(algoParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(algoParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link algoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(algoParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link algoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(algoParser.TypeNameContext ctx);
}