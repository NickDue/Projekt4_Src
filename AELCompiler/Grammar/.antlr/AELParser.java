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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OBJFUNCID=7, TYPE=8, ID=9, 
		STRINGLITERTAL=10, NORMALDIGIT=11, STARTDIGIT=12, SEMICOLON=13, WS=14, 
		PLUSOP=15, SUBOP=16, MULTOP=17, DIVOP=18, ANDOP=19, OROP=20, EQUALOP=21, 
		NOTEQUALOP=22, LESSOP=23, GREATEROP=24, LESSSEQUALSOP=25, GREATEREQUALSOP=26, 
		TRUETERM=27, FALSETERM=28, NUMBERTYPE=29, BOOLEANTYPE=30, VOIDTYPE=31, 
		STRINGTYPE=32, CHARACTERTYPE=33, ONFUNC=34, OFFFUNC=35, READFUNC=36, WRITEFUNC=37, 
		ISONFUNC=38, ISOFFFUNC=39, ASSIGN=40, COLON=41, LPAREN=42, RPAREN=43, 
		LCURLY=44, RCURLY=45, LSQ=46, RSQ=47, BUTTON=48, LED=49, PRINT=50, IF=51, 
		ELIF=52, ELSE=53, DO=54, WHILE=55, LOOP=56, TIMES=57, WHEN=58, WAIT=59, 
		RETURN=60;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_funcDecl = 3, 
		RULE_objDecl = 4, RULE_objFunccall = 5, RULE_objFunccallId = 6, RULE_fParams = 7, 
		RULE_fParamsDecl = 8, RULE_funcBody = 9, RULE_stmt = 10, RULE_printStmt = 11, 
		RULE_ifStmt = 12, RULE_elseIfStmt = 13, RULE_elseStmt = 14, RULE_doWhileStmt = 15, 
		RULE_whileStmt = 16, RULE_loopStmt = 17, RULE_whenStmt = 18, RULE_waitStmt = 19, 
		RULE_returnStmt = 20, RULE_time = 21, RULE_case_stmt = 22, RULE_default_stmt = 23, 
		RULE_exp = 24, RULE_addexpr = 25, RULE_multexpr = 26, RULE_logStmt = 27, 
		RULE_logOp = 28, RULE_assignExp = 29, RULE_term = 30, RULE_funccall = 31, 
		RULE_aParams = 32, RULE_array = 33, RULE_arrayval = 34, RULE_intLiteral = 35, 
		RULE_floatLiteral = 36, RULE_number = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "varDecl", "funcDecl", "objDecl", "objFunccall", "objFunccallId", 
			"fParams", "fParamsDecl", "funcBody", "stmt", "printStmt", "ifStmt", 
			"elseIfStmt", "elseStmt", "doWhileStmt", "whileStmt", "loopStmt", "whenStmt", 
			"waitStmt", "returnStmt", "time", "case_stmt", "default_stmt", "exp", 
			"addexpr", "multexpr", "logStmt", "logOp", "assignExp", "term", "funccall", 
			"aParams", "array", "arrayval", "intLiteral", "floatLiteral", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'h'", "'m'", "'s'", "'ms'", null, null, null, null, 
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
			null, null, null, null, null, null, null, "OBJFUNCID", "TYPE", "ID", 
			"STRINGLITERTAL", "NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "WS", "PLUSOP", 
			"SUBOP", "MULTOP", "DIVOP", "ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", 
			"LESSOP", "GREATEROP", "LESSSEQUALSOP", "GREATEREQUALSOP", "TRUETERM", 
			"FALSETERM", "NUMBERTYPE", "BOOLEANTYPE", "VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", 
			"ONFUNC", "OFFFUNC", "READFUNC", "WRITEFUNC", "ISONFUNC", "ISOFFFUNC", 
			"ASSIGN", "COLON", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LSQ", "RSQ", 
			"BUTTON", "LED", "PRINT", "IF", "ELIF", "ELSE", "DO", "WHILE", "LOOP", 
			"TIMES", "WHEN", "WAIT", "RETURN"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==ID) {
				{
				{
				setState(76);
				decl();
				}
				}
				setState(81);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
		public TerminalNode TYPE() { return getToken(AELParser.TYPE, 0); }
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(TYPE);
				setState(88);
				match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(89);
					match(ASSIGN);
					setState(90);
					exp();
					}
				}

				setState(93);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		public TerminalNode TYPE() { return getToken(AELParser.TYPE, 0); }
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
			setState(97);
			match(TYPE);
			setState(98);
			match(ID);
			setState(99);
			fParams();
			setState(100);
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
		public TerminalNode OBJFUNCID() { return getToken(AELParser.OBJFUNCID, 0); }
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
			setState(102);
			match(ID);
			setState(103);
			match(ASSIGN);
			setState(104);
			match(OBJFUNCID);
			setState(105);
			match(LPAREN);
			setState(106);
			intLiteral();
			setState(107);
			match(RPAREN);
			setState(108);
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
			setState(110);
			match(ID);
			setState(111);
			match(T__0);
			setState(112);
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
			setState(114);
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
		enterRule(_localctx, 14, RULE_fParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LPAREN);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(117);
				fParamsDecl();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(118);
					match(T__1);
					setState(119);
					fParamsDecl();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(127);
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
		public TerminalNode TYPE() { return getToken(AELParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public FParamsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParamsDecl; }
	}

	public final FParamsDeclContext fParamsDecl() throws RecognitionException {
		FParamsDeclContext _localctx = new FParamsDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fParamsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(TYPE);
			setState(130);
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
		enterRule(_localctx, 18, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LCURLY);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(133);
				varDecl();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(139);
				stmt();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				assignExp();
				setState(148);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				doWhileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				loopStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				whenStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				waitStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				returnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				funccall();
				setState(159);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				objFunccall();
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
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
		enterRule(_localctx, 22, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PRINT);
			setState(168);
			match(LPAREN);
			setState(169);
			exp();
			setState(170);
			match(RPAREN);
			setState(171);
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
		enterRule(_localctx, 24, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IF);
			setState(174);
			match(LPAREN);
			setState(175);
			logStmt();
			setState(176);
			match(RPAREN);
			setState(177);
			match(LCURLY);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(178);
				stmt();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RCURLY);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(185);
				elseIfStmt();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(191);
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
		enterRule(_localctx, 26, RULE_elseIfStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ELIF);
			setState(195);
			match(LPAREN);
			setState(196);
			logStmt();
			setState(197);
			match(RPAREN);
			setState(198);
			match(LCURLY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(199);
				stmt();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
		enterRule(_localctx, 28, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ELSE);
			setState(208);
			match(LCURLY);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(209);
				stmt();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
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
		enterRule(_localctx, 30, RULE_doWhileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DO);
			setState(218);
			match(LCURLY);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(219);
				stmt();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RCURLY);
			setState(226);
			match(WHILE);
			setState(227);
			match(LPAREN);
			setState(228);
			logStmt();
			setState(229);
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
		enterRule(_localctx, 32, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(WHILE);
			setState(232);
			match(LPAREN);
			setState(233);
			logStmt();
			setState(234);
			match(RPAREN);
			setState(235);
			match(LCURLY);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(236);
				stmt();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
		enterRule(_localctx, 34, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LOOP);
			setState(245);
			intLiteral();
			setState(246);
			match(TIMES);
			setState(247);
			match(LCURLY);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(248);
				stmt();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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
		enterRule(_localctx, 36, RULE_whenStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(WHEN);
			setState(257);
			match(LPAREN);
			setState(258);
			exp();
			setState(259);
			match(RPAREN);
			setState(260);
			match(LCURLY);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(261);
				case_stmt();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(267);
				default_stmt();
				}
			}

			setState(270);
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
		enterRule(_localctx, 38, RULE_waitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(WAIT);
			setState(273);
			match(LPAREN);
			setState(274);
			time();
			setState(275);
			match(RPAREN);
			setState(276);
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
		enterRule(_localctx, 40, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(RETURN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				setState(279);
				exp();
				}
			}

			setState(282);
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
		enterRule(_localctx, 42, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(284);
				intLiteral();
				setState(285);
				match(T__2);
				}
				break;
			}
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(289);
				intLiteral();
				setState(290);
				match(T__3);
				}
				break;
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(294);
				intLiteral();
				setState(295);
				match(T__4);
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NORMALDIGIT) {
				{
				setState(299);
				intLiteral();
				setState(300);
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
		enterRule(_localctx, 44, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			term();
			setState(305);
			match(COLON);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(306);
				stmt();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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
		enterRule(_localctx, 46, RULE_default_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ELSE);
			setState(315);
			match(COLON);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGLITERTAL) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN) | (1L << PRINT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << LOOP) | (1L << WHEN) | (1L << WAIT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(316);
				stmt();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
		enterRule(_localctx, 48, RULE_exp);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				assignExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				addexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
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
		enterRule(_localctx, 50, RULE_addexpr);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				multexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				multexpr();
				setState(331);
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
				setState(332);
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
		enterRule(_localctx, 52, RULE_multexpr);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				term();
				setState(338);
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
				setState(339);
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
		enterRule(_localctx, 54, RULE_logStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			addexpr();
			setState(344);
			logOp();
			setState(345);
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
		enterRule(_localctx, 56, RULE_logOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 58, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
			setState(350);
			match(ASSIGN);
			setState(351);
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
		enterRule(_localctx, 60, RULE_term);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(STRINGLITERTAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(TRUETERM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(FALSETERM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(LPAREN);
				setState(359);
				exp();
				setState(360);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(362);
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
		enterRule(_localctx, 62, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(366);
			match(LPAREN);
			setState(367);
			aParams();
			setState(368);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aParams; }
	}

	public final AParamsContext aParams() throws RecognitionException {
		AParamsContext _localctx = new AParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			exp();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(371);
				match(T__1);
				setState(372);
				exp();
				}
				}
				setState(377);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AELParser.TYPE, 0); }
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
		enterRule(_localctx, 66, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(TYPE);
			setState(379);
			match(ID);
			setState(380);
			match(LSQ);
			setState(381);
			intLiteral();
			setState(382);
			match(RSQ);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(383);
				match(ASSIGN);
				setState(384);
				match(LCURLY);
				setState(385);
				arrayval();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(386);
					match(T__1);
					setState(387);
					arrayval();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(RCURLY);
				}
			}

			setState(397);
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
		enterRule(_localctx, 68, RULE_arrayval);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(ID);
				}
				break;
			case NORMALDIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				intLiteral();
				}
				break;
			case STRINGLITERTAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(STRINGLITERTAL);
				}
				break;
			case TRUETERM:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(TRUETERM);
				}
				break;
			case FALSETERM:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
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
		enterRule(_localctx, 70, RULE_intLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(406);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(409); 
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
		enterRule(_localctx, 72, RULE_floatLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411);
				match(NORMALDIGIT);
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NORMALDIGIT );
			setState(416);
			match(T__0);
			setState(418); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(417);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420); 
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
		enterRule(_localctx, 74, RULE_number);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\5\4b\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\5\t\u0080\n\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\13\7\13\u008f"+
		"\n\13\f\13\16\13\u0092\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9"+
		"\13\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\16\5\16\u00c3"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u00d5\n\20\f\20\16\20\u00d8\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\7\21\u00df\n\21\f\21\16\21\u00e2\13\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f0\n\22"+
		"\f\22\16\22\u00f3\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00fc"+
		"\n\23\f\23\16\23\u00ff\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0109\n\24\f\24\16\24\u010c\13\24\3\24\5\24\u010f\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u011b\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\5\27\u0122\n\27\3\27\3\27\3\27\5\27\u0127\n\27\3\27\3\27\3"+
		"\27\5\27\u012c\n\27\3\27\3\27\3\27\5\27\u0131\n\27\3\30\3\30\3\30\7\30"+
		"\u0136\n\30\f\30\16\30\u0139\13\30\3\30\3\30\3\31\3\31\3\31\7\31\u0140"+
		"\n\31\f\31\16\31\u0143\13\31\3\31\3\31\3\32\3\32\3\32\5\32\u014a\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0151\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0158\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u016e\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u0178"+
		"\n\"\f\"\16\"\u017b\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0187\n#\f#"+
		"\16#\u018a\13#\3#\3#\5#\u018e\n#\3#\3#\3$\3$\3$\3$\3$\5$\u0197\n$\3%\6"+
		"%\u019a\n%\r%\16%\u019b\3&\6&\u019f\n&\r&\16&\u01a0\3&\3&\6&\u01a5\n&"+
		"\r&\16&\u01a6\3\'\3\'\5\'\u01ab\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3\2$)\3\2\21\22\3\2\23"+
		"\24\3\2\25\34\2\u01c0\2Q\3\2\2\2\4W\3\2\2\2\6a\3\2\2\2\bc\3\2\2\2\nh\3"+
		"\2\2\2\fp\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22\u0083\3\2\2\2\24\u0086\3"+
		"\2\2\2\26\u00a7\3\2\2\2\30\u00a9\3\2\2\2\32\u00af\3\2\2\2\34\u00c4\3\2"+
		"\2\2\36\u00d1\3\2\2\2 \u00db\3\2\2\2\"\u00e9\3\2\2\2$\u00f6\3\2\2\2&\u0102"+
		"\3\2\2\2(\u0112\3\2\2\2*\u0118\3\2\2\2,\u0121\3\2\2\2.\u0132\3\2\2\2\60"+
		"\u013c\3\2\2\2\62\u0149\3\2\2\2\64\u0150\3\2\2\2\66\u0157\3\2\2\28\u0159"+
		"\3\2\2\2:\u015d\3\2\2\2<\u015f\3\2\2\2>\u016d\3\2\2\2@\u016f\3\2\2\2B"+
		"\u0174\3\2\2\2D\u017c\3\2\2\2F\u0196\3\2\2\2H\u0199\3\2\2\2J\u019e\3\2"+
		"\2\2L\u01aa\3\2\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"R\3\3\2\2\2SQ\3\2\2\2TX\5\6\4\2UX\5\b\5\2VX\5\n\6\2WT\3\2\2\2WU\3\2\2"+
		"\2WV\3\2\2\2X\5\3\2\2\2YZ\7\n\2\2Z]\7\13\2\2[\\\7*\2\2\\^\5\62\32\2]["+
		"\3\2\2\2]^\3\2\2\2^_\3\2\2\2_b\7\17\2\2`b\5D#\2aY\3\2\2\2a`\3\2\2\2b\7"+
		"\3\2\2\2cd\7\n\2\2de\7\13\2\2ef\5\20\t\2fg\5\24\13\2g\t\3\2\2\2hi\7\13"+
		"\2\2ij\7*\2\2jk\7\t\2\2kl\7,\2\2lm\5H%\2mn\7-\2\2no\7\17\2\2o\13\3\2\2"+
		"\2pq\7\13\2\2qr\7\3\2\2rs\5\16\b\2s\r\3\2\2\2tu\t\2\2\2u\17\3\2\2\2v\177"+
		"\7,\2\2w|\5\22\n\2xy\7\4\2\2y{\5\22\n\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7-\2\2\u0082\21\3\2\2\2\u0083\u0084\7\n\2\2"+
		"\u0084\u0085\7\13\2\2\u0085\23\3\2\2\2\u0086\u008a\7.\2\2\u0087\u0089"+
		"\5\6\4\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5\26"+
		"\f\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7/"+
		"\2\2\u0094\25\3\2\2\2\u0095\u0096\5<\37\2\u0096\u0097\7\17\2\2\u0097\u00a8"+
		"\3\2\2\2\u0098\u00a8\5\30\r\2\u0099\u00a8\5\32\16\2\u009a\u00a8\5 \21"+
		"\2\u009b\u00a8\5\"\22\2\u009c\u00a8\5$\23\2\u009d\u00a8\5&\24\2\u009e"+
		"\u00a8\5(\25\2\u009f\u00a8\5*\26\2\u00a0\u00a1\5@!\2\u00a1\u00a2\7\17"+
		"\2\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a8\5\62\32\2\u00a7\u0095\3\2\2\2\u00a7\u0098\3"+
		"\2\2\2\u00a7\u0099\3\2\2\2\u00a7\u009a\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7"+
		"\u009c\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2"+
		"\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\27\3\2\2\2\u00a9\u00aa\7\64\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac\5\62\32"+
		"\2\u00ac\u00ad\7-\2\2\u00ad\u00ae\7\17\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7\65\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\58\35\2\u00b2\u00b3\7-\2\2\u00b3"+
		"\u00b7\7.\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00be\7/\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00bb\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\5\36\20\2\u00c2\u00c1\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\66\2\2\u00c5"+
		"\u00c6\7,\2\2\u00c6\u00c7\58\35\2\u00c7\u00c8\7-\2\2\u00c8\u00cc\7.\2"+
		"\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7/\2\2\u00d0\35\3\2\2\2\u00d1\u00d2\7\67\2\2\u00d2\u00d6"+
		"\7.\2\2\u00d3\u00d5\5\26\f\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\7/\2\2\u00da\37\3\2\2\2\u00db\u00dc\78\2\2\u00dc\u00e0"+
		"\7.\2\2\u00dd\u00df\5\26\f\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\79\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7"+
		"\58\35\2\u00e7\u00e8\7-\2\2\u00e8!\3\2\2\2\u00e9\u00ea\79\2\2\u00ea\u00eb"+
		"\7,\2\2\u00eb\u00ec\58\35\2\u00ec\u00ed\7-\2\2\u00ed\u00f1\7.\2\2\u00ee"+
		"\u00f0\5\26\f\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7/\2\2\u00f5#\3\2\2\2\u00f6\u00f7\7:\2\2\u00f7\u00f8\5H%\2\u00f8"+
		"\u00f9\7;\2\2\u00f9\u00fd\7.\2\2\u00fa\u00fc\5\26\f\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7/\2\2\u0101%\3\2\2\2\u0102"+
		"\u0103\7<\2\2\u0103\u0104\7,\2\2\u0104\u0105\5\62\32\2\u0105\u0106\7-"+
		"\2\2\u0106\u010a\7.\2\2\u0107\u0109\5.\30\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5\60\31\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7/\2\2\u0111\'\3\2\2\2"+
		"\u0112\u0113\7=\2\2\u0113\u0114\7,\2\2\u0114\u0115\5,\27\2\u0115\u0116"+
		"\7-\2\2\u0116\u0117\7\17\2\2\u0117)\3\2\2\2\u0118\u011a\7>\2\2\u0119\u011b"+
		"\5\62\32\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\7\17\2\2\u011d+\3\2\2\2\u011e\u011f\5H%\2\u011f\u0120\7\5"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0126\3\2\2\2\u0123\u0124\5H%\2\u0124\u0125\7\6\2\2\u0125\u0127\3\2\2"+
		"\2\u0126\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\3\2\2\2\u0128\u0129"+
		"\5H%\2\u0129\u012a\7\7\2\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u0130\3\2\2\2\u012d\u012e\5H%\2\u012e\u012f\7\b\2"+
		"\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131-"+
		"\3\2\2\2\u0132\u0133\5> \2\u0133\u0137\7+\2\2\u0134\u0136\5\26\f\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\17\2\2\u013b"+
		"/\3\2\2\2\u013c\u013d\7\67\2\2\u013d\u0141\7+\2\2\u013e\u0140\5\26\f\2"+
		"\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\17\2\2"+
		"\u0145\61\3\2\2\2\u0146\u014a\5<\37\2\u0147\u014a\5\64\33\2\u0148\u014a"+
		"\5> \2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\63\3\2\2\2\u014b\u0151\5\66\34\2\u014c\u014d\5\66\34\2\u014d\u014e\t"+
		"\3\2\2\u014e\u014f\5\64\33\2\u014f\u0151\3\2\2\2\u0150\u014b\3\2\2\2\u0150"+
		"\u014c\3\2\2\2\u0151\65\3\2\2\2\u0152\u0158\5> \2\u0153\u0154\5> \2\u0154"+
		"\u0155\t\4\2\2\u0155\u0156\5\66\34\2\u0156\u0158\3\2\2\2\u0157\u0152\3"+
		"\2\2\2\u0157\u0153\3\2\2\2\u0158\67\3\2\2\2\u0159\u015a\5\64\33\2\u015a"+
		"\u015b\5:\36\2\u015b\u015c\5\64\33\2\u015c9\3\2\2\2\u015d\u015e\t\5\2"+
		"\2\u015e;\3\2\2\2\u015f\u0160\7\13\2\2\u0160\u0161\7*\2\2\u0161\u0162"+
		"\5\62\32\2\u0162=\3\2\2\2\u0163\u016e\7\13\2\2\u0164\u016e\5L\'\2\u0165"+
		"\u016e\7\f\2\2\u0166\u016e\7\35\2\2\u0167\u016e\7\36\2\2\u0168\u0169\7"+
		",\2\2\u0169\u016a\5\62\32\2\u016a\u016b\7-\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016e\5@!\2\u016d\u0163\3\2\2\2\u016d\u0164\3\2\2\2\u016d\u0165\3\2\2"+
		"\2\u016d\u0166\3\2\2\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u016c"+
		"\3\2\2\2\u016e?\3\2\2\2\u016f\u0170\7\13\2\2\u0170\u0171\7,\2\2\u0171"+
		"\u0172\5B\"\2\u0172\u0173\7-\2\2\u0173A\3\2\2\2\u0174\u0179\5\62\32\2"+
		"\u0175\u0176\7\4\2\2\u0176\u0178\5\62\32\2\u0177\u0175\3\2\2\2\u0178\u017b"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017aC\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017d\7\n\2\2\u017d\u017e\7\13\2\2\u017e\u017f\7"+
		"\60\2\2\u017f\u0180\5H%\2\u0180\u018d\7\61\2\2\u0181\u0182\7*\2\2\u0182"+
		"\u0183\7.\2\2\u0183\u0188\5F$\2\u0184\u0185\7\4\2\2\u0185\u0187\5F$\2"+
		"\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7/\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\7\17\2\2\u0190E\3\2\2\2\u0191\u0197\7\13\2\2\u0192\u0197"+
		"\5H%\2\u0193\u0197\7\f\2\2\u0194\u0197\7\35\2\2\u0195\u0197\7\36\2\2\u0196"+
		"\u0191\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197G\3\2\2\2\u0198\u019a\7\r\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"I\3\2\2\2\u019d\u019f\7\r\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\7\3\2\2\u01a3\u01a5\7\r\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7K\3\2\2\2\u01a8\u01ab\5H%\2\u01a9"+
		"\u01ab\5J&\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01abM\3\2\2\2(Q"+
		"W]a|\177\u008a\u0090\u00a7\u00b7\u00be\u00c2\u00cc\u00d6\u00e0\u00f1\u00fd"+
		"\u010a\u010e\u011a\u0121\u0126\u012b\u0130\u0137\u0141\u0149\u0150\u0157"+
		"\u016d\u0179\u0188\u018d\u0196\u019b\u01a0\u01a6\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}