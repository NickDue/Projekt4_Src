// Generated from AEL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AELParser}.
 */
public interface AELListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AELParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AELParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AELParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AELParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AELParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AELParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AELParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(AELParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(AELParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void enterObjDecl(AELParser.ObjDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void exitObjDecl(AELParser.ObjDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#objFunccall}.
	 * @param ctx the parse tree
	 */
	void enterObjFunccall(AELParser.ObjFunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#objFunccall}.
	 * @param ctx the parse tree
	 */
	void exitObjFunccall(AELParser.ObjFunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#objFunccallId}.
	 * @param ctx the parse tree
	 */
	void enterObjFunccallId(AELParser.ObjFunccallIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#objFunccallId}.
	 * @param ctx the parse tree
	 */
	void exitObjFunccallId(AELParser.ObjFunccallIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#objFuncId}.
	 * @param ctx the parse tree
	 */
	void enterObjFuncId(AELParser.ObjFuncIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#objFuncId}.
	 * @param ctx the parse tree
	 */
	void exitObjFuncId(AELParser.ObjFuncIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#fParams}.
	 * @param ctx the parse tree
	 */
	void enterFParams(AELParser.FParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#fParams}.
	 * @param ctx the parse tree
	 */
	void exitFParams(AELParser.FParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#fParamsDecl}.
	 * @param ctx the parse tree
	 */
	void enterFParamsDecl(AELParser.FParamsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#fParamsDecl}.
	 * @param ctx the parse tree
	 */
	void exitFParamsDecl(AELParser.FParamsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(AELParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(AELParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AELParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AELParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(AELParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(AELParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AELParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AELParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmt(AELParser.ElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmt(AELParser.ElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(AELParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(AELParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(AELParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(AELParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(AELParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(AELParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(AELParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(AELParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhenStmt(AELParser.WhenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhenStmt(AELParser.WhenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#waitStmt}.
	 * @param ctx the parse tree
	 */
	void enterWaitStmt(AELParser.WaitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#waitStmt}.
	 * @param ctx the parse tree
	 */
	void exitWaitStmt(AELParser.WaitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AELParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AELParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(AELParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(AELParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(AELParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(AELParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#default_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefault_stmt(AELParser.Default_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#default_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefault_stmt(AELParser.Default_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(AELParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(AELParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(AELParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(AELParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#multexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultexpr(AELParser.MultexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#multexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultexpr(AELParser.MultexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#logStmt}.
	 * @param ctx the parse tree
	 */
	void enterLogStmt(AELParser.LogStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#logStmt}.
	 * @param ctx the parse tree
	 */
	void exitLogStmt(AELParser.LogStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#logOp}.
	 * @param ctx the parse tree
	 */
	void enterLogOp(AELParser.LogOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#logOp}.
	 * @param ctx the parse tree
	 */
	void exitLogOp(AELParser.LogOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(AELParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(AELParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AELParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AELParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(AELParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(AELParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#aParams}.
	 * @param ctx the parse tree
	 */
	void enterAParams(AELParser.AParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#aParams}.
	 * @param ctx the parse tree
	 */
	void exitAParams(AELParser.AParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AELParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AELParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#arrayval}.
	 * @param ctx the parse tree
	 */
	void enterArrayval(AELParser.ArrayvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#arrayval}.
	 * @param ctx the parse tree
	 */
	void exitArrayval(AELParser.ArrayvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(AELParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(AELParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(AELParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(AELParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AELParser#numb}.
	 * @param ctx the parse tree
	 */
	void enterNumb(AELParser.NumbContext ctx);
	/**
	 * Exit a parse tree produced by {@link AELParser#numb}.
	 * @param ctx the parse tree
	 */
	void exitNumb(AELParser.NumbContext ctx);
}