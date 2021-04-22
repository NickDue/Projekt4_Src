package ANTLR;
// Generated from AEL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AELParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AELVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AELParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AELParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(AELParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(AELParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AELParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(AELParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#objDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDecl(AELParser.ObjDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#objFunccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFunccall(AELParser.ObjFunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#objFunccallId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFunccallId(AELParser.ObjFunccallIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#objFuncId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFuncId(AELParser.ObjFuncIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#fParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFParams(AELParser.FParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#fParamsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFParamsDecl(AELParser.FParamsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(AELParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(AELParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(AELParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#case_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(AELParser.Case_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#default_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_stmt(AELParser.Default_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(AELParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#assignExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(AELParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(AELParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AELParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(AELParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#aParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAParams(AELParser.AParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AELParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#arrayval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayval(AELParser.ArrayvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AELParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(AELParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AELParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AELParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AELParser.NumberContext ctx);
}