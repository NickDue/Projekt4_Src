// Generated from c:\Users\meerq\OneDrive\Skrivebord\Projekt4_Src\AELCompiler\Grammar\AEL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AELParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, STRINGLITERTAL=9, 
		NORMALDIGIT=10, STARTDIGIT=11, SEMICOLON=12, WS=13, PLUSOP=14, SUBOP=15, 
		MULTOP=16, DIVOP=17, ANDOP=18, OROP=19, EQUALOP=20, NOTEQUALOP=21, LESSOP=22, 
		GREATEROP=23, LESSSEQUALSOP=24, GREATEREQUALSOP=25, TRUETERM=26, FALSETERM=27, 
		NUMBERTYPE=28, BOOLEANTYPE=29, VOIDTYPE=30, STRINGTYPE=31, CHARACTERTYPE=32, 
		ONFUNC=33, OFFFUNC=34, READFUNC=35, WRITEFUNC=36, ISONFUNC=37, ISOFFFUNC=38, 
		ASSIGN=39, COLON=40, LPAREN=41, RPAREN=42, LCURLY=43, RCURLY=44, LSQ=45, 
		RSQ=46, BUTTON=47, LED=48, PRINT=49, IF=50, ELIF=51, ELSE=52, DO=53, WHILE=54, 
		LOOP=55, TIMES=56, WHEN=57, WAIT=58, RETURN=59;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_funcDecl = 3, 
		RULE_objDecl = 4, RULE_objFunccall = 5, RULE_objFunccallId = 6, RULE_objFuncId = 7, 
		RULE_fParams = 8, RULE_fParamsDecl = 9, RULE_funcBody = 10, RULE_stmt = 11, 
		RULE_printStmt = 12, RULE_ifStmt = 13, RULE_elseIfStmt = 14, RULE_elseStmt = 15, 
		RULE_doWhileStmt = 16, RULE_whileStmt = 17, RULE_loopStmt = 18, RULE_whenStmt = 19, 
		RULE_waitStmt = 20, RULE_returnStmt = 21, RULE_time = 22, RULE_case_stmt = 23, 
		RULE_default_stmt = 24, RULE_exp = 25, RULE_addexpr = 26, RULE_multexpr = 27, 
		RULE_logStmt = 28, RULE_logOp = 29, RULE_assignExp = 30, RULE_term = 31, 
		RULE_funccall = 32, RULE_aParams = 33, RULE_array = 34, RULE_arrayval = 35, 
		RULE_type = 36, RULE_intLiteral = 37, RULE_floatLiteral = 38, RULE_number = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "varDecl", "funcDecl", "objDecl", "objFunccall", "objFunccallId", 
			"objFuncId", "fParams", "fParamsDecl", "funcBody", "stmt", "printStmt", 
			"ifStmt", "elseIfStmt", "elseStmt", "doWhileStmt", "whileStmt", "loopStmt", 
			"whenStmt", "waitStmt", "returnStmt", "time", "case_stmt", "default_stmt", 
			"exp", "addexpr", "multexpr", "logStmt", "logOp", "assignExp", "term", 
			"funccall", "aParams", "array", "arrayval", "type", "intLiteral", "floatLiteral", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'h'", "'m'", "'s'", "'ms'", "'NOT'", null, null, 
			null, null, "';'", null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", 
			"'equals'", "'not equals'", "'<'", "'>'", "'<='", "'>='", "'true'", "'false'", 
			"'number'", "'bool'", "'void'", "'string'", "'char'", "'On()'", "'Off()'", 
			"'Read()'", "'Write()'", "'isOn()'", "'isOff()'", "'='", "':'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'BUTTON'", "'LED'", "'print'", "'if'", 
			"'elif'", "'else'", "'do'", "'while'", "'loop'", "'times'", "'when'", 
			"'wait'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "STRINGLITERTAL", 
			"NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "WS", "PLUSOP", "SUBOP", "MULTOP", 
			"DIVOP", "ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", "LESSOP", "GREATEROP", 
			"LESSSEQUALSOP", "GREATEREQUALSOP", "TRUETERM", "FALSETERM", "NUMBERTYPE", 
			"BOOLEANTYPE", "VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", "ONFUNC", "OFFFUNC", 
			"READFUNC", "WRITEFUNC", "ISONFUNC", "ISOFFFUNC", "ASSIGN", "COLON", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "LSQ", "RSQ", "BUTTON", "LED", 
			"PRINT", "IF", "ELIF", "ELSE", "DO", "WHILE", "LOOP", "TIMES", "WHEN", 
			"WAIT", "RETURN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AEL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AELParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				{
				setState(80);
				decl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public ObjDeclContext objDecl() {
			return getRuleContext(ObjDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				objDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(AELParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type();
				setState(92);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(93);
					match(ASSIGN);
					setState(94);
					exp();
					}
				}

				setState(97);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public FParamsContext fParams() {
			return getRuleContext(FParamsContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			setState(104);
			fParams();
			setState(105);
			funcBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AELParser.ASSIGN, 0); }
		public ObjFuncIdContext objFuncId() {
			return getRuleContext(ObjFuncIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public ObjDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDecl; }
	}

	public final ObjDeclContext objDecl() throws RecognitionException {
		ObjDeclContext _localctx = new ObjDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(ASSIGN);
			setState(109);
			objFuncId();
			setState(110);
			match(LPAREN);
			setState(111);
			intLiteral();
			setState(112);
			match(RPAREN);
			setState(113);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjFunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public ObjFunccallIdContext objFunccallId() {
			return getRuleContext(ObjFunccallIdContext.class,0);
		}
		public ObjFunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFunccall; }
	}

	public final ObjFunccallContext objFunccall() throws RecognitionException {
		ObjFunccallContext _localctx = new ObjFunccallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objFunccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(T__0);
			setState(117);
			objFunccallId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjFunccallIdContext extends ParserRuleContext {
		public TerminalNode ONFUNC() { return getToken(AELParser.ONFUNC, 0); }
		public TerminalNode OFFFUNC() { return getToken(AELParser.OFFFUNC, 0); }
		public TerminalNode READFUNC() { return getToken(AELParser.READFUNC, 0); }
		public TerminalNode WRITEFUNC() { return getToken(AELParser.WRITEFUNC, 0); }
		public TerminalNode ISONFUNC() { return getToken(AELParser.ISONFUNC, 0); }
		public TerminalNode ISOFFFUNC() { return getToken(AELParser.ISOFFFUNC, 0); }
		public ObjFunccallIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFunccallId; }
	}

	public final ObjFunccallIdContext objFunccallId() throws RecognitionException {
		ObjFunccallIdContext _localctx = new ObjFunccallIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objFunccallId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONFUNC) | (1L << OFFFUNC) | (1L << READFUNC) | (1L << WRITEFUNC) | (1L << ISONFUNC) | (1L << ISOFFFUNC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjFuncIdContext extends ParserRuleContext {
		public TerminalNode BUTTON() { return getToken(AELParser.BUTTON, 0); }
		public TerminalNode LED() { return getToken(AELParser.LED, 0); }
		public ObjFuncIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFuncId; }
	}

	public final ObjFuncIdContext objFuncId() throws RecognitionException {
		ObjFuncIdContext _localctx = new ObjFuncIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objFuncId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==BUTTON || _la==LED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public List<FParamsDeclContext> fParamsDecl() {
			return getRuleContexts(FParamsDeclContext.class);
		}
		public FParamsDeclContext fParamsDecl(int i) {
			return getRuleContext(FParamsDeclContext.class,i);
		}
		public FParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParams; }
	}

	public final FParamsContext fParams() throws RecognitionException {
		FParamsContext _localctx = new FParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LPAREN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				setState(124);
				fParamsDecl();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(125);
					match(T__1);
					setState(126);
					fParamsDecl();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(134);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FParamsDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public FParamsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParamsDecl; }
	}

	public final FParamsDeclContext fParamsDecl() throws RecognitionException {
		FParamsDeclContext _localctx = new FParamsDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fParamsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			type();
			setState(137);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LCURLY);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				{
				setState(140);
				varDecl();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(146);
				stmt();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignExpContext assignExp() {
			return getRuleContext(AssignExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public WhenStmtContext whenStmt() {
			return getRuleContext(WhenStmtContext.class,0);
		}
		public WaitStmtContext waitStmt() {
			return getRuleContext(WaitStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public ObjFunccallContext objFunccall() {
			return getRuleContext(ObjFunccallContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				assignExp();
				setState(155);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				doWhileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				loopStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				whenStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				waitStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				returnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				funccall();
				setState(166);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				objFunccall();
				setState(169);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(AELParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PRINT);
			setState(175);
			match(LPAREN);
			setState(176);
			exp();
			setState(177);
			match(RPAREN);
			setState(178);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AELParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public LogStmtContext logStmt() {
			return getRuleContext(LogStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			match(LPAREN);
			setState(182);
			logStmt();
			setState(183);
			match(RPAREN);
			setState(184);
			match(LCURLY);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(185);
				stmt();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RCURLY);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(192);
				elseIfStmt();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(198);
				elseStmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(AELParser.ELIF, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public LogStmtContext logStmt() {
			return getRuleContext(LogStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIfStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ELIF);
			setState(202);
			match(LPAREN);
			setState(203);
			logStmt();
			setState(204);
			match(RPAREN);
			setState(205);
			match(LCURLY);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(206);
				stmt();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AELParser.ELSE, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ELSE);
			setState(215);
			match(LCURLY);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(216);
				stmt();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AELParser.DO, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public TerminalNode WHILE() { return getToken(AELParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public LogStmtContext logStmt() {
			return getRuleContext(LogStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doWhileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DO);
			setState(225);
			match(LCURLY);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(226);
				stmt();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(RCURLY);
			setState(233);
			match(WHILE);
			setState(234);
			match(LPAREN);
			setState(235);
			logStmt();
			setState(236);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AELParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public LogStmtContext logStmt() {
			return getRuleContext(LogStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(WHILE);
			setState(239);
			match(LPAREN);
			setState(240);
			logStmt();
			setState(241);
			match(RPAREN);
			setState(242);
			match(LCURLY);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(243);
				stmt();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(AELParser.LOOP, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(AELParser.TIMES, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LOOP);
			setState(252);
			intLiteral();
			setState(253);
			match(TIMES);
			setState(254);
			match(LCURLY);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(255);
				stmt();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenStmtContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(AELParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public Default_stmtContext default_stmt() {
			return getRuleContext(Default_stmtContext.class,0);
		}
		public WhenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStmt; }
	}

	public final WhenStmtContext whenStmt() throws RecognitionException {
		WhenStmtContext _localctx = new WhenStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whenStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(WHEN);
			setState(264);
			match(LPAREN);
			setState(265);
			exp();
			setState(266);
			match(RPAREN);
			setState(267);
			match(LCURLY);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(268);
				case_stmt();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(274);
				default_stmt();
				}
			}

			setState(277);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitStmtContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(AELParser.WAIT, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public WaitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStmt; }
	}

	public final WaitStmtContext waitStmt() throws RecognitionException {
		WaitStmtContext _localctx = new WaitStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_waitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(WAIT);
			setState(280);
			match(LPAREN);
			setState(281);
			time();
			setState(282);
			match(RPAREN);
			setState(283);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AELParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RETURN);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				setState(286);
				exp();
				}
			}

			setState(289);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public List<IntLiteralContext> intLiteral() {
			return getRuleContexts(IntLiteralContext.class);
		}
		public IntLiteralContext intLiteral(int i) {
			return getRuleContext(IntLiteralContext.class,i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(291);
				intLiteral();
				setState(292);
				match(T__2);
				}
				break;
			}
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(296);
				intLiteral();
				setState(297);
				match(T__3);
				}
				break;
			}
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(301);
				intLiteral();
				setState(302);
				match(T__4);
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NORMALDIGIT) {
				{
				setState(306);
				intLiteral();
				setState(307);
				match(T__5);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AELParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			term();
			setState(312);
			match(COLON);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(313);
				stmt();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AELParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(AELParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Default_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_stmt; }
	}

	public final Default_stmtContext default_stmt() throws RecognitionException {
		Default_stmtContext _localctx = new Default_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_default_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ELSE);
			setState(322);
			match(COLON);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(323);
				stmt();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public AssignExpContext assignExp() {
			return getRuleContext(AssignExpContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SUBOP() { return getToken(AELParser.SUBOP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				assignExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				addexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(T__6);
				setState(334);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(SUBOP);
				setState(336);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddexprContext extends ParserRuleContext {
		public Token op;
		public MultexprContext multexpr() {
			return getRuleContext(MultexprContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode PLUSOP() { return getToken(AELParser.PLUSOP, 0); }
		public TerminalNode SUBOP() { return getToken(AELParser.SUBOP, 0); }
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addexpr);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				multexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				multexpr();
				setState(342);
				((AddexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSOP || _la==SUBOP) ) {
					((AddexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				addexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultexprContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultexprContext multexpr() {
			return getRuleContext(MultexprContext.class,0);
		}
		public TerminalNode MULTOP() { return getToken(AELParser.MULTOP, 0); }
		public TerminalNode DIVOP() { return getToken(AELParser.DIVOP, 0); }
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multexpr);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				term();
				setState(349);
				((MultexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MULTOP || _la==DIVOP) ) {
					((MultexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				multexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogStmtContext extends ParserRuleContext {
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public LogOpContext logOp() {
			return getRuleContext(LogOpContext.class,0);
		}
		public LogStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStmt; }
	}

	public final LogStmtContext logStmt() throws RecognitionException {
		LogStmtContext _localctx = new LogStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			addexpr();
			setState(355);
			logOp();
			setState(356);
			addexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogOpContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQUALOP() { return getToken(AELParser.EQUALOP, 0); }
		public TerminalNode GREATEROP() { return getToken(AELParser.GREATEROP, 0); }
		public TerminalNode LESSOP() { return getToken(AELParser.LESSOP, 0); }
		public TerminalNode GREATEREQUALSOP() { return getToken(AELParser.GREATEREQUALSOP, 0); }
		public TerminalNode LESSSEQUALSOP() { return getToken(AELParser.LESSSEQUALSOP, 0); }
		public TerminalNode NOTEQUALOP() { return getToken(AELParser.NOTEQUALOP, 0); }
		public TerminalNode ANDOP() { return getToken(AELParser.ANDOP, 0); }
		public TerminalNode OROP() { return getToken(AELParser.OROP, 0); }
		public LogOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOp; }
	}

	public final LogOpContext logOp() throws RecognitionException {
		LogOpContext _localctx = new LogOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_logOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((LogOpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANDOP) | (1L << OROP) | (1L << EQUALOP) | (1L << NOTEQUALOP) | (1L << LESSOP) | (1L << GREATEROP) | (1L << LESSSEQUALSOP) | (1L << GREATEREQUALSOP))) != 0)) ) {
				((LogOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AELParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExp; }
	}

	public final AssignExpContext assignExp() throws RecognitionException {
		AssignExpContext _localctx = new AssignExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ID);
			setState(361);
			match(ASSIGN);
			setState(362);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRINGLITERTAL() { return getToken(AELParser.STRINGLITERTAL, 0); }
		public TerminalNode TRUETERM() { return getToken(AELParser.TRUETERM, 0); }
		public TerminalNode FALSETERM() { return getToken(AELParser.FALSETERM, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_term);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(STRINGLITERTAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(TRUETERM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(FALSETERM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				match(LPAREN);
				setState(370);
				exp();
				setState(371);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(373);
				funccall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public AParamsContext aParams() {
			return getRuleContext(AParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(377);
			match(LPAREN);
			setState(378);
			aParams();
			setState(379);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AParamsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AParamsContext aParams() {
			return getRuleContext(AParamsContext.class,0);
		}
		public AParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aParams; }
	}

	public final AParamsContext aParams() throws RecognitionException {
		AParamsContext _localctx = new AParamsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_aParams);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				exp();
				setState(383);
				match(T__1);
				setState(384);
				aParams();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public TerminalNode LSQ() { return getToken(AELParser.LSQ, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(AELParser.RSQ, 0); }
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(AELParser.ASSIGN, 0); }
		public TerminalNode LCURLY() { return getToken(AELParser.LCURLY, 0); }
		public List<ArrayvalContext> arrayval() {
			return getRuleContexts(ArrayvalContext.class);
		}
		public ArrayvalContext arrayval(int i) {
			return getRuleContext(ArrayvalContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(AELParser.RCURLY, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			type();
			setState(389);
			match(ID);
			setState(390);
			match(LSQ);
			setState(391);
			intLiteral();
			setState(392);
			match(RSQ);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(393);
				match(ASSIGN);
				setState(394);
				match(LCURLY);
				setState(395);
				arrayval();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(396);
					match(T__1);
					setState(397);
					arrayval();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(RCURLY);
				}
			}

			setState(407);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayvalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode STRINGLITERTAL() { return getToken(AELParser.STRINGLITERTAL, 0); }
		public TerminalNode TRUETERM() { return getToken(AELParser.TRUETERM, 0); }
		public TerminalNode FALSETERM() { return getToken(AELParser.FALSETERM, 0); }
		public ArrayvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayval; }
	}

	public final ArrayvalContext arrayval() throws RecognitionException {
		ArrayvalContext _localctx = new ArrayvalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayval);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(ID);
				}
				break;
			case NORMALDIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				intLiteral();
				}
				break;
			case STRINGLITERTAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(STRINGLITERTAL);
				}
				break;
			case TRUETERM:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				match(TRUETERM);
				}
				break;
			case FALSETERM:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(FALSETERM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBERTYPE() { return getToken(AELParser.NUMBERTYPE, 0); }
		public TerminalNode BOOLEANTYPE() { return getToken(AELParser.BOOLEANTYPE, 0); }
		public TerminalNode VOIDTYPE() { return getToken(AELParser.VOIDTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(AELParser.STRINGTYPE, 0); }
		public TerminalNode CHARACTERTYPE() { return getToken(AELParser.CHARACTERTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NORMALDIGIT() { return getTokens(AELParser.NORMALDIGIT); }
		public TerminalNode NORMALDIGIT(int i) {
			return getToken(AELParser.NORMALDIGIT, i);
		}
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_intLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(418);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NORMALDIGIT() { return getTokens(AELParser.NORMALDIGIT); }
		public TerminalNode NORMALDIGIT(int i) {
			return getToken(AELParser.NORMALDIGIT, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_floatLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423);
				match(NORMALDIGIT);
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NORMALDIGIT );
			setState(428);
			match(T__0);
			setState(430); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(429);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(432); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_number);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				floatLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\4\3\4\5\4b\n\4\3\4\3\4\3"+
		"\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f\n\16\n\u0085"+
		"\13\n\5\n\u0087\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\7\f\u0090\n\f\f\f\16"+
		"\f\u0093\13\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00bd\n\17\f\17\16\17\u00c0\13\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17"+
		"\u00c7\13\17\3\17\5\17\u00ca\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d2"+
		"\n\20\f\20\16\20\u00d5\13\20\3\20\3\20\3\21\3\21\3\21\7\21\u00dc\n\21"+
		"\f\21\16\21\u00df\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00e6\n\22\f\22"+
		"\16\22\u00e9\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00f7\n\23\f\23\16\23\u00fa\13\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u0103\n\24\f\24\16\24\u0106\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0110\n\25\f\25\16\25\u0113\13\25\3\25\5"+
		"\25\u0116\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27"+
		"\u0122\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u0129\n\30\3\30\3\30\3\30\5"+
		"\30\u012e\n\30\3\30\3\30\3\30\5\30\u0133\n\30\3\30\3\30\3\30\5\30\u0138"+
		"\n\30\3\31\3\31\3\31\7\31\u013d\n\31\f\31\16\31\u0140\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\7\32\u0147\n\32\f\32\16\32\u014a\13\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0155\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u015c\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0163\n\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0179"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0185\n#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u0191\n$\f$\16$\u0194\13$\3$\3$\5$\u0198\n$\3$\3$\3%\3%"+
		"\3%\3%\3%\5%\u01a1\n%\3&\3&\3\'\6\'\u01a6\n\'\r\'\16\'\u01a7\3(\6(\u01ab"+
		"\n(\r(\16(\u01ac\3(\3(\6(\u01b1\n(\r(\16(\u01b2\3)\3)\5)\u01b7\n)\3)\2"+
		"\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNP\2\b\3\2#(\3\2\61\62\3\2\20\21\3\2\22\23\3\2\24\33\3\2\36\"\2\u01cc"+
		"\2U\3\2\2\2\4[\3\2\2\2\6f\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\fu\3\2\2\2\16"+
		"y\3\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24\u008a\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00b6\3\2\2\2\36\u00cb\3\2\2\2 \u00d8"+
		"\3\2\2\2\"\u00e2\3\2\2\2$\u00f0\3\2\2\2&\u00fd\3\2\2\2(\u0109\3\2\2\2"+
		"*\u0119\3\2\2\2,\u011f\3\2\2\2.\u0128\3\2\2\2\60\u0139\3\2\2\2\62\u0143"+
		"\3\2\2\2\64\u0154\3\2\2\2\66\u015b\3\2\2\28\u0162\3\2\2\2:\u0164\3\2\2"+
		"\2<\u0168\3\2\2\2>\u016a\3\2\2\2@\u0178\3\2\2\2B\u017a\3\2\2\2D\u0184"+
		"\3\2\2\2F\u0186\3\2\2\2H\u01a0\3\2\2\2J\u01a2\3\2\2\2L\u01a5\3\2\2\2N"+
		"\u01aa\3\2\2\2P\u01b6\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2V\3\3\2\2\2WU\3\2\2\2X\\\5\6\4\2Y\\\5\b\5\2Z\\\5\n\6\2[X\3\2"+
		"\2\2[Y\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]^\5J&\2^a\7\n\2\2_`\7)\2\2`b\5\64"+
		"\33\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\16\2\2dg\3\2\2\2eg\5F$\2f]\3\2"+
		"\2\2fe\3\2\2\2g\7\3\2\2\2hi\5J&\2ij\7\n\2\2jk\5\22\n\2kl\5\26\f\2l\t\3"+
		"\2\2\2mn\7\n\2\2no\7)\2\2op\5\20\t\2pq\7+\2\2qr\5L\'\2rs\7,\2\2st\7\16"+
		"\2\2t\13\3\2\2\2uv\7\n\2\2vw\7\3\2\2wx\5\16\b\2x\r\3\2\2\2yz\t\2\2\2z"+
		"\17\3\2\2\2{|\t\3\2\2|\21\3\2\2\2}\u0086\7+\2\2~\u0083\5\24\13\2\177\u0080"+
		"\7\4\2\2\u0080\u0082\5\24\13\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086~\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\7,\2\2\u0089\23\3\2\2\2\u008a\u008b\5J&\2\u008b\u008c\7\n\2\2\u008c\25"+
		"\3\2\2\2\u008d\u0091\7-\2\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7.\2\2\u009b\27\3\2\2\2\u009c\u009d"+
		"\5> \2\u009d\u009e\7\16\2\2\u009e\u00af\3\2\2\2\u009f\u00af\5\32\16\2"+
		"\u00a0\u00af\5\34\17\2\u00a1\u00af\5\"\22\2\u00a2\u00af\5$\23\2\u00a3"+
		"\u00af\5&\24\2\u00a4\u00af\5(\25\2\u00a5\u00af\5*\26\2\u00a6\u00af\5,"+
		"\27\2\u00a7\u00a8\5B\"\2\u00a8\u00a9\7\16\2\2\u00a9\u00af\3\2\2\2\u00aa"+
		"\u00ab\5\f\7\2\u00ab\u00ac\7\16\2\2\u00ac\u00af\3\2\2\2\u00ad\u00af\5"+
		"\64\33\2\u00ae\u009c\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae"+
		"\u00a1\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a4\3\2"+
		"\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\7\63\2"+
		"\2\u00b1\u00b2\7+\2\2\u00b2\u00b3\5\64\33\2\u00b3\u00b4\7,\2\2\u00b4\u00b5"+
		"\7\16\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\64\2\2\u00b7\u00b8\7+\2\2\u00b8"+
		"\u00b9\5:\36\2\u00b9\u00ba\7,\2\2\u00ba\u00be\7-\2\2\u00bb\u00bd\5\30"+
		"\r\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\7."+
		"\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00ca\5 \21\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\35\3\2\2\2\u00cb\u00cc\7\65\2\2\u00cc\u00cd\7+\2\2\u00cd\u00ce\5:\36"+
		"\2\u00ce\u00cf\7,\2\2\u00cf\u00d3\7-\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7\37\3\2\2\2"+
		"\u00d8\u00d9\7\66\2\2\u00d9\u00dd\7-\2\2\u00da\u00dc\5\30\r\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1!\3\2\2\2\u00e2"+
		"\u00e3\7\67\2\2\u00e3\u00e7\7-\2\2\u00e4\u00e6\5\30\r\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7.\2\2\u00eb\u00ec\78\2"+
		"\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\5:\36\2\u00ee\u00ef\7,\2\2\u00ef#\3"+
		"\2\2\2\u00f0\u00f1\78\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f3\5:\36\2\u00f3"+
		"\u00f4\7,\2\2\u00f4\u00f8\7-\2\2\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc%\3\2\2\2\u00fd"+
		"\u00fe\79\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100\7:\2\2\u0100\u0104\7-\2\2"+
		"\u0101\u0103\5\30\r\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7.\2\2\u0108\'\3\2\2\2\u0109\u010a\7;\2\2\u010a\u010b\7+\2\2\u010b"+
		"\u010c\5\64\33\2\u010c\u010d\7,\2\2\u010d\u0111\7-\2\2\u010e\u0110\5\60"+
		"\31\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\5\62"+
		"\32\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7.\2\2\u0118)\3\2\2\2\u0119\u011a\7<\2\2\u011a\u011b\7+\2\2\u011b"+
		"\u011c\5.\30\2\u011c\u011d\7,\2\2\u011d\u011e\7\16\2\2\u011e+\3\2\2\2"+
		"\u011f\u0121\7=\2\2\u0120\u0122\5\64\33\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\16\2\2\u0124-\3\2\2\2\u0125"+
		"\u0126\5L\'\2\u0126\u0127\7\5\2\2\u0127\u0129\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a\u012b\5L\'\2\u012b"+
		"\u012c\7\6\2\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0132\3\2\2\2\u012f\u0130\5L\'\2\u0130\u0131\7\7\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2"+
		"\2\2\u0134\u0135\5L\'\2\u0135\u0136\7\b\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0134\3\2\2\2\u0137\u0138\3\2\2\2\u0138/\3\2\2\2\u0139\u013a\5@!\2\u013a"+
		"\u013e\7*\2\2\u013b\u013d\5\30\r\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0142\7\16\2\2\u0142\61\3\2\2\2\u0143\u0144\7\66"+
		"\2\2\u0144\u0148\7*\2\2\u0145\u0147\5\30\r\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\16\2\2\u014c\63\3\2\2\2\u014d\u0155"+
		"\5> \2\u014e\u0155\5\66\34\2\u014f\u0150\7\t\2\2\u0150\u0155\5\64\33\2"+
		"\u0151\u0152\7\21\2\2\u0152\u0155\5\64\33\2\u0153\u0155\5@!\2\u0154\u014d"+
		"\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\65\3\2\2\2\u0156\u015c\58\35\2\u0157\u0158\58\35"+
		"\2\u0158\u0159\t\4\2\2\u0159\u015a\5\66\34\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015c\67\3\2\2\2\u015d\u0163\5@!\2"+
		"\u015e\u015f\5@!\2\u015f\u0160\t\5\2\2\u0160\u0161\58\35\2\u0161\u0163"+
		"\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u01639\3\2\2\2\u0164"+
		"\u0165\5\66\34\2\u0165\u0166\5<\37\2\u0166\u0167\5\66\34\2\u0167;\3\2"+
		"\2\2\u0168\u0169\t\6\2\2\u0169=\3\2\2\2\u016a\u016b\7\n\2\2\u016b\u016c"+
		"\7)\2\2\u016c\u016d\5\64\33\2\u016d?\3\2\2\2\u016e\u0179\7\n\2\2\u016f"+
		"\u0179\5P)\2\u0170\u0179\7\13\2\2\u0171\u0179\7\34\2\2\u0172\u0179\7\35"+
		"\2\2\u0173\u0174\7+\2\2\u0174\u0175\5\64\33\2\u0175\u0176\7,\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0179\5B\"\2\u0178\u016e\3\2\2\2\u0178\u016f\3\2"+
		"\2\2\u0178\u0170\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178"+
		"\u0173\3\2\2\2\u0178\u0177\3\2\2\2\u0179A\3\2\2\2\u017a\u017b\7\n\2\2"+
		"\u017b\u017c\7+\2\2\u017c\u017d\5D#\2\u017d\u017e\7,\2\2\u017eC\3\2\2"+
		"\2\u017f\u0185\5\64\33\2\u0180\u0181\5\64\33\2\u0181\u0182\7\4\2\2\u0182"+
		"\u0183\5D#\2\u0183\u0185\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2"+
		"\2\u0185E\3\2\2\2\u0186\u0187\5J&\2\u0187\u0188\7\n\2\2\u0188\u0189\7"+
		"/\2\2\u0189\u018a\5L\'\2\u018a\u0197\7\60\2\2\u018b\u018c\7)\2\2\u018c"+
		"\u018d\7-\2\2\u018d\u0192\5H%\2\u018e\u018f\7\4\2\2\u018f\u0191\5H%\2"+
		"\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7.\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u018b\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\7\16\2\2\u019aG\3\2\2\2\u019b\u01a1\7\n\2\2\u019c\u01a1"+
		"\5L\'\2\u019d\u01a1\7\13\2\2\u019e\u01a1\7\34\2\2\u019f\u01a1\7\35\2\2"+
		"\u01a0\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1I\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3"+
		"K\3\2\2\2\u01a4\u01a6\7\f\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8M\3\2\2\2\u01a9\u01ab\7"+
		"\f\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\7\3\2\2\u01af\u01b1\7\f"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3O\3\2\2\2\u01b4\u01b7\5L\'\2\u01b5\u01b7\5N(\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7Q\3\2\2\2(U[af\u0083\u0086\u0091"+
		"\u0097\u00ae\u00be\u00c5\u00c9\u00d3\u00dd\u00e7\u00f8\u0104\u0111\u0115"+
		"\u0121\u0128\u012d\u0132\u0137\u013e\u0148\u0154\u015b\u0162\u0178\u0184"+
		"\u0192\u0197\u01a0\u01a7\u01ac\u01b2\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}