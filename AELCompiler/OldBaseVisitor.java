// Generated from AEL.g4 by ANTLR 4.9.2
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import jdk.incubator.jpackage.internal.RetryExecutor;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * This class provides an empty implementation of {@link AELVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class AELBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AELVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(AELParser.StartContext ctx) { 
		visit(ctx.declList);
		return ctx.EOF().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDecllist(AELParser.DecllistContext ctx) { 
		return visit(ctx.decl());;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDecleration(AELParser.VariableDeclerationContext ctx) { 
		return visit(ctx.varDecl());;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionDecleration(AELParser.FunctionDeclerationContext ctx) {
		return visit(ctx.funcDecl());
		/* tror ikke dette skal være her
		String type = visit(ctx.type());
		String ID = ctx.ID().getText();
		if(expr(0) != null){
			String exp = expr(0);
		} else { /* return error? }
		*/
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitObjectDecleration(AELParser.ObjectDeclerationContext ctx) {
		return visit(ctx.objDecl());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAttributeDecl(AELParser.AttributeDeclContext ctx) {
		String type = visit(ctx.type());
		String id = ctx.ID().getText(); 
		T exp = visit(ctx.exp());
		if(exp != null){
			return type + id + "=" + exp + ";";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayDecl(AELParser.ArrayDeclContext ctx) { 
		return visit(ctx.array());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncDecleration(AELParser.FuncDeclerationContext ctx) {
		String type = visit(ctx.type());
		String id = ctx.ID().getText();
		String params = visit(ctx.fParams());
		String funcbody = visit(ctx.funcBody());
		return null;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitObjDecleration(AELParser.ObjDeclerationContext ctx) { 
		String ID = ctx.ID().getText();
		String objFuncId = ctx.ObjFuncId().getText();
		Int pinValue = ctx.INTLITERAL().getText(); 

		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitObjFunctionCall(AELParser.ObjFunctionCallContext ctx) { 
		String id = ctx.ID().getText();
		String funcCall = ctx.objFunccallId().getText();
		return null;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOnFunc(AELParser.OnFuncContext ctx) {
		return ctx.ON().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOffFunc(AELParser.OffFuncContext ctx) { 
		return ctx.OFF().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReadFunc(AELParser.ReadFuncContext ctx) { 
		return ctx.READ().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWriteFunc(AELParser.WriteFuncContext ctx) { 
		return ctx.WRITE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCheckOnFunc(AELParser.CheckOnFuncContext ctx) { 
		return ctx.ISON().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCheckOffFunc(AELParser.CheckOffFuncContext ctx) { 
		return ctx.ISOFF().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitButtonType(AELParser.ButtonTypeContext ctx) { 
		return ctx.BUTTON().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLedType(AELParser.LedTypeContext ctx) {
		return ctx.LED.getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncParams(AELParser.FuncParamsContext ctx) { 
		boolean sentinel = true;
		int i = 0;
		List<T> fParams = new ArrayList<>();
		while(sentinel){
			T value = visit(ctx.fParamsDecl(i));
			if (value != null){
				fParams.add(value);
				i++;
			} else{
				sentinel = !sentinel;
			}
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncParamsDecl(AELParser.FuncParamsDeclContext ctx) { 
		String type = visit(ctx.type());
		String id = ctx.ID().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionBody(AELParser.FunctionBodyContext ctx) { 
		T vardecl = visit(ctx.varDecl());
		T stmt = visit(ctx.stmt());

		return visitChildren(ctx);
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrintStmt(AELParser.PrintStmtContext ctx) { 
		T exp = visit(ctx.exp());
		return null;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfStmts(AELParser.IfStmtsContext ctx) { 
		if(ctx.exp() == true || ctx.exp(0) == "true") {
			T exp = visit(ctx.stmt(0));
		} else if (ctx.RCURLY(1).exists() && ctx.exp(1) == true && ctx.LCURLY(1).exists()){
			T exp2 = visit(ctx.stmt(1));
			break; // return ??
		} else if (ctx.else.exists()) {
			

		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDoWhileStmt(AELParser.DoWhileStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileStmt(AELParser.WhileStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForStmt(AELParser.ForStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSwitchStmt(AELParser.SwitchStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWaitStmt(AELParser.WaitStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReturnStmt(AELParser.ReturnStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionCallStmt(AELParser.FunctionCallStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitObjfunccallStmt(AELParser.ObjfunccallStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(AELParser.ExpressionContext ctx) {
		 return visitChildren(ctx);
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTimeFormat(AELParser.TimeFormatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCaseStmt(AELParser.CaseStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefaultStmt(AELParser.DefaultStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAracExp(AELParser.AracExpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTermExp(AELParser.TermExpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNegateStmt(AELParser.NegateStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignStmt(AELParser.AssignStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNegativeStmt(AELParser.NegativeStmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValueAssign(AELParser.ValueAssignContext ctx) { 
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id, value);
		return value;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPlusOp(AELParser.PludOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == AELParser.plusOp) return left + right;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMinusOp(AELParser.MinusOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == AELParser.minusOp) return left - right;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTimesOp(AELParser.TimesOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.timesOp) return left * right;
		
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDivideOp(AELParser.DivideOpContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.divideOp) return left * right;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndOp(AELParser.AndOpContext ctx) { 
		boolean left = visit(ctx.expr(0));
		boolean right = visit(ctx.expr(1));

		if(left == false || right == false){
			return false;
		} else {
			return true;
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrOp(AELParser.OrOpContext ctx) { 
		boolean left = visit(ctx.expr(0));
		boolean right = visit(ctx.expr(1));

		if(left == true && right == false || left == false && right == true){
			return true;
		} else {
			return false;
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEqualsOp(AELParser.EqualsOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.EQUALS && left == right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNonEqualsOp(AELParser.NonEqualsOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.NOTEQUALS && left != right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLessOp(AELParser.LessOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.LESS && left < right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public boolean visitGreaterOp(AELParser.GreaterOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType() == AELParser.GREATER && left > right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public boolean visitLessEqualsOp(AELParser.LessEqualsOpContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == AELParser.LESSEQUALS && left <= right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGreaterEqualsOp(AELParser.GreaterEqualsOpContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == AELParser.GREATEREQUALS && left >= right) return true;
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdTerm(AELParser.IdTermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNumberTerm(AELParser.NumberTermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStringTerm(AELParser.StringTermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public boolean visitTrueTerm(AELParser.TrueTermContext ctx) { 
		return true;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public boolean visitFalseTerm(AELParser.FalseTermContext ctx) { 
		return false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParanExpTerm(AELParser.ParanExpTermContext ctx) { 
		return ctx.expr(0);
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunccallTerm(AELParser.FunccallTermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionCall(AELParser.FunctionCallContext ctx) { 
		String id = ctx.ID().getText();
		if(visit(aParams) != null) {
			T aParams = visit(aParams);
		}	
		// return ??;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpParam(AELParser.ExpParamContext ctx) { 
		T myExp = visit(ctx.exp());

		return myExp;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpParams(AELParser.ExpParamsContext ctx) { 
		T myExp = visit(ctx.exp());
		T myComma = ctx.COMMA().getText();
		T addParams = visit(aParams());
		
		return myExp + myComma + addParams;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public int visitArrayStructure(AELParser.ArrayStructureContext ctx) { 
		return 0; //returns dummy value?
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdArrayVal(AELParser.IdArrayValContext ctx) { 
		return ctx.ID().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public int visitIntArrayVal(AELParser.IntArrayValContext ctx) { 
		return Integer.valueOf(ctx.INTLITERAL().getText());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitStringArrayVal(AELParser.StringArrayValContext ctx) { 
		return String.valueOf(ctx.STRINGLITERAL().getText());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTrueArrayval(AELParser.TrueArrayvalContext ctx) { 
		return ctx.TRUE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFalseArrayVal(AELParser.FalseArrayValContext ctx) { 
		return ctx.FALSE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNumberType(AELParser.NumberTypeContext ctx) { 
		return ctx.NUMTYPE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBoolType(AELParser.BoolTypeContext ctx) {
		return ctx.BOOLEANTYPE().getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVoidType(AELParser.VoidTypeContext ctx) {
		System.out.println(ctx.VOIDEDTYPE().getText().getClass().getName());
		return ctx.VOIDEDTYPE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitStringType(AELParser.StringTypeContext ctx) { 
		return ctx.STRINGLITTYPE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCharType(AELParser.CharTypeContext ctx) { 
		return ctx.CHARACTERTYPE().getText();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public int visitIntLiteralNumber(AELParser.IntLiteralNumberContext ctx) {
		 return Integer.valueOf(ctx.INTLITERAL().getText());
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public float visitFloatLiteralNumber(AELParser.FloatLiteralNumberContext ctx) {
		 return Float.valueOf(ctx.FLOATLITERAL().getText()); 
		}
}