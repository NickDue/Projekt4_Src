package ANTLR;
// Generated from AEL.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, NORMALDIGIT=21, STARTDIGIT=22, SEMICOLON=23, 
		WS=24, PLUSOP=25, SUBOP=26, MULTOP=27, DIVOP=28, ANDOP=29, OROP=30, EQUALOP=31, 
		NOTEQUALOP=32, LESSOP=33, GREATEROP=34, LESSSEQUALSOP=35, GREATEREQUALSOP=36, 
		TRUETERM=37, FALSETERM=38, NUMBERTYPE=39, BOOLEANTYPE=40, VOIDTYPE=41, 
		STRINGTYPE=42, CHARACTERTYPE=43, ONFUNC=44, OFFFUNC=45, READFUNC=46, WRITEFUNC=47, 
		ISONFUNC=48, ISOFFFUNC=49, ASSIGN=50, COLON=51, LPAREN=52, RPAREN=53, 
		LCURLY=54, RCURLY=55, LSQ=56, RSQ=57, BUTTON=58, LED=59;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_funcDecl = 3, 
		RULE_objDecl = 4, RULE_objFunccall = 5, RULE_objFunccallId = 6, RULE_objFuncId = 7, 
		RULE_fParams = 8, RULE_fParamsDecl = 9, RULE_funcBody = 10, RULE_stmt = 11, 
		RULE_time = 12, RULE_case_stmt = 13, RULE_default_stmt = 14, RULE_exp = 15, 
		RULE_assignExp = 16, RULE_operand = 17, RULE_term = 18, RULE_funccall = 19, 
		RULE_aParams = 20, RULE_array = 21, RULE_arrayval = 22, RULE_type = 23, 
		RULE_intLiteral = 24, RULE_floatLiteral = 25, RULE_number = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "varDecl", "funcDecl", "objDecl", "objFunccall", "objFunccallId", 
			"objFuncId", "fParams", "fParamsDecl", "funcBody", "stmt", "time", "case_stmt", 
			"default_stmt", "exp", "assignExp", "operand", "term", "funccall", "aParams", 
			"array", "arrayval", "type", "intLiteral", "floatLiteral", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'print'", "'if'", "'elif'", "'else'", "'do'", "'while'", 
			"'loop'", "'TIMES'", "'when'", "'wait'", "'return'", "'h'", "'m'", "'s'", 
			"'ms'", "'NOT'", "'\"'", null, null, null, "';'", null, "'+'", "'-'", 
			"'*'", "'/'", "'and'", "'or'", "'equals'", "'not equals'", "'<'", "'>'", 
			"'<='", "'>='", "'true'", "'false'", "'number'", "'bool'", "'void'", 
			"'string'", "'char'", "'On()'", "'Off()'", "'Read()'", "'Write()'", "'isOn()'", 
			"'isOff()'", "'='", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'BUTTON'", "'LED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "NORMALDIGIT", 
			"STARTDIGIT", "SEMICOLON", "WS", "PLUSOP", "SUBOP", "MULTOP", "DIVOP", 
			"ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", "LESSOP", "GREATEROP", "LESSSEQUALSOP", 
			"GREATEREQUALSOP", "TRUETERM", "FALSETERM", "NUMBERTYPE", "BOOLEANTYPE", 
			"VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", "ONFUNC", "OFFFUNC", "READFUNC", 
			"WRITEFUNC", "ISONFUNC", "ISOFFFUNC", "ASSIGN", "COLON", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LSQ", "RSQ", "BUTTON", "LED"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				{
				setState(54);
				decl();
				}
				}
				setState(59);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				type();
				setState(66);
				match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(67);
					match(ASSIGN);
					setState(68);
					exp(0);
					}
				}

				setState(71);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(ID);
			setState(78);
			fParams();
			setState(79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitObjDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDeclContext objDecl() throws RecognitionException {
		ObjDeclContext _localctx = new ObjDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(ASSIGN);
			setState(83);
			objFuncId();
			setState(84);
			match(LPAREN);
			setState(85);
			intLiteral();
			setState(86);
			match(RPAREN);
			setState(87);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitObjFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFunccallContext objFunccall() throws RecognitionException {
		ObjFunccallContext _localctx = new ObjFunccallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objFunccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(T__0);
			setState(91);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitObjFunccallId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFunccallIdContext objFunccallId() throws RecognitionException {
		ObjFunccallIdContext _localctx = new ObjFunccallIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objFunccallId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitObjFuncId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFuncIdContext objFuncId() throws RecognitionException {
		ObjFuncIdContext _localctx = new ObjFuncIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objFuncId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FParamsContext fParams() throws RecognitionException {
		FParamsContext _localctx = new FParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				setState(98);
				fParamsDecl();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(99);
					match(T__1);
					setState(100);
					fParamsDecl();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFParamsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FParamsDeclContext fParamsDecl() throws RecognitionException {
		FParamsDeclContext _localctx = new FParamsDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fParamsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			type();
			setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LCURLY);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERTYPE) | (1L << BOOLEANTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE) | (1L << CHARACTERTYPE))) != 0)) {
				{
				{
				setState(114);
				varDecl();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(120);
				stmt();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
		public List<TerminalNode> LPAREN() { return getTokens(AELParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AELParser.LPAREN, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AELParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AELParser.RPAREN, i);
		}
		public List<TerminalNode> LCURLY() { return getTokens(AELParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(AELParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AELParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(AELParser.RCURLY, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public Default_stmtContext default_stmt() {
			return getRuleContext(Default_stmtContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public ObjFunccallContext objFunccall() {
			return getRuleContext(ObjFunccallContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				assignExp();
				setState(129);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__2);
				setState(132);
				match(LPAREN);
				setState(133);
				exp(0);
				setState(134);
				match(RPAREN);
				setState(135);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__3);
				setState(138);
				match(LPAREN);
				setState(139);
				exp(0);
				setState(140);
				match(RPAREN);
				setState(141);
				match(LCURLY);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(142);
					stmt();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(RCURLY);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(149);
					match(T__4);
					setState(150);
					match(LPAREN);
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
						{
						{
						setState(151);
						stmt();
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(157);
					match(RPAREN);
					setState(158);
					match(LCURLY);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
						{
						{
						setState(159);
						stmt();
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(165);
					match(RCURLY);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(171);
					match(T__5);
					setState(172);
					match(LCURLY);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
						{
						{
						setState(173);
						stmt();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(RCURLY);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__6);
				setState(183);
				match(LCURLY);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(184);
					stmt();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RCURLY);
				setState(191);
				match(T__7);
				setState(192);
				match(LPAREN);
				setState(193);
				exp(0);
				setState(194);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__7);
				setState(197);
				match(LPAREN);
				setState(198);
				exp(0);
				setState(199);
				match(RPAREN);
				setState(200);
				match(LCURLY);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(201);
					stmt();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(RCURLY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(T__8);
				setState(210);
				intLiteral();
				setState(211);
				match(T__9);
				setState(212);
				match(LCURLY);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(213);
					stmt();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(RCURLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				match(T__10);
				setState(222);
				match(LPAREN);
				setState(223);
				exp(0);
				setState(224);
				match(RPAREN);
				setState(225);
				match(LCURLY);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(226);
					case_stmt();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(232);
					default_stmt();
					}
				}

				setState(235);
				match(RCURLY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(T__11);
				setState(238);
				match(LPAREN);
				setState(239);
				time();
				setState(240);
				match(RPAREN);
				setState(241);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
				match(T__12);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
					{
					setState(244);
					exp(0);
					}
				}

				setState(247);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				funccall();
				setState(249);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				objFunccall();
				setState(252);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(254);
				exp(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(257);
				intLiteral();
				setState(258);
				match(T__13);
				}
				break;
			}
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(262);
				intLiteral();
				setState(263);
				match(T__14);
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(267);
				intLiteral();
				setState(268);
				match(T__15);
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NORMALDIGIT) {
				{
				setState(272);
				intLiteral();
				setState(273);
				match(T__16);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			term();
			setState(278);
			match(COLON);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(279);
				stmt();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitDefault_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_stmtContext default_stmt() throws RecognitionException {
		Default_stmtContext _localctx = new Default_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_default_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__5);
			setState(288);
			match(COLON);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << NORMALDIGIT) | (1L << SUBOP) | (1L << TRUETERM) | (1L << FALSETERM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(289);
				stmt();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUBOP() { return getToken(AELParser.SUBOP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(298);
				assignExp();
				}
				break;
			case 2:
				{
				setState(299);
				match(T__17);
				setState(300);
				exp(3);
				}
				break;
			case 3:
				{
				setState(301);
				match(SUBOP);
				setState(302);
				exp(2);
				}
				break;
			case 4:
				{
				setState(303);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(306);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(307);
					operand();
					setState(308);
					exp(5);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpContext assignExp() throws RecognitionException {
		AssignExpContext _localctx = new AssignExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(ASSIGN);
			setState(317);
			exp(0);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode PLUSOP() { return getToken(AELParser.PLUSOP, 0); }
		public TerminalNode SUBOP() { return getToken(AELParser.SUBOP, 0); }
		public TerminalNode MULTOP() { return getToken(AELParser.MULTOP, 0); }
		public TerminalNode DIVOP() { return getToken(AELParser.DIVOP, 0); }
		public TerminalNode ANDOP() { return getToken(AELParser.ANDOP, 0); }
		public TerminalNode OROP() { return getToken(AELParser.OROP, 0); }
		public TerminalNode EQUALOP() { return getToken(AELParser.EQUALOP, 0); }
		public TerminalNode NOTEQUALOP() { return getToken(AELParser.NOTEQUALOP, 0); }
		public TerminalNode LESSOP() { return getToken(AELParser.LESSOP, 0); }
		public TerminalNode GREATEROP() { return getToken(AELParser.GREATEROP, 0); }
		public TerminalNode LESSSEQUALSOP() { return getToken(AELParser.LESSSEQUALSOP, 0); }
		public TerminalNode GREATEREQUALSOP() { return getToken(AELParser.GREATEREQUALSOP, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSOP) | (1L << SUBOP) | (1L << MULTOP) | (1L << DIVOP) | (1L << ANDOP) | (1L << OROP) | (1L << EQUALOP) | (1L << NOTEQUALOP) | (1L << LESSOP) | (1L << GREATEROP) | (1L << LESSSEQUALSOP) | (1L << GREATEREQUALSOP))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			int _alt;
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__18);
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(324);
						matchWildcard();
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(330);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(TRUETERM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(FALSETERM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(LPAREN);
				setState(334);
				exp(0);
				setState(335);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
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
		public TerminalNode LPAREN() { return getToken(AELParser.LPAREN, 0); }
		public AParamsContext aParams() {
			return getRuleContext(AParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AELParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(340);
				match(ID);
				}
			}

			setState(343);
			match(LPAREN);
			setState(344);
			aParams();
			setState(345);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitAParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AParamsContext aParams() throws RecognitionException {
		AParamsContext _localctx = new AParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aParams);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				exp(0);
				setState(349);
				match(T__1);
				setState(350);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			type();
			setState(355);
			match(ID);
			setState(356);
			match(LSQ);
			setState(357);
			intLiteral();
			setState(358);
			match(RSQ);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(359);
				match(ASSIGN);
				setState(360);
				match(LCURLY);
				setState(361);
				arrayval();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(362);
					match(T__1);
					setState(363);
					arrayval();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(RCURLY);
				}
			}

			setState(373);
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
		public TerminalNode TRUETERM() { return getToken(AELParser.TRUETERM, 0); }
		public TerminalNode FALSETERM() { return getToken(AELParser.FALSETERM, 0); }
		public ArrayvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitArrayval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayvalContext arrayval() throws RecognitionException {
		ArrayvalContext _localctx = new ArrayvalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayval);
		try {
			int _alt;
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(ID);
				}
				break;
			case NORMALDIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				intLiteral();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(T__18);
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(378);
						matchWildcard();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(384);
				match(T__18);
				}
				break;
			case TRUETERM:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(TRUETERM);
				}
				break;
			case FALSETERM:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(391);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floatLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(396);
				match(NORMALDIGIT);
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NORMALDIGIT );
			setState(401);
			match(T__0);
			setState(403); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(402);
					match(NORMALDIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(405); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AELVisitor ) return ((AELVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u019e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3"+
		"\5\3B\n\3\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\5\nm\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0092"+
		"\n\r\f\r\16\r\u0095\13\r\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e"+
		"\13\r\3\r\3\r\3\r\7\r\u00a3\n\r\f\r\16\r\u00a6\13\r\3\r\7\r\u00a9\n\r"+
		"\f\r\16\r\u00ac\13\r\3\r\3\r\3\r\7\r\u00b1\n\r\f\r\16\r\u00b4\13\r\3\r"+
		"\5\r\u00b7\n\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13\r\3\r\5\r\u00ec"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\16\3\16\3\16\5\16\u0107\n\16\3\16"+
		"\3\16\3\16\5\16\u010c\n\16\3\16\3\16\3\16\5\16\u0111\n\16\3\16\3\16\3"+
		"\16\5\16\u0116\n\16\3\17\3\17\3\17\7\17\u011b\n\17\f\17\16\17\u011e\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u0125\n\20\f\20\16\20\u0128\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0133\n\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0148\n\24\f\24\16\24\u014b\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0155\n\24\3\25\5\25\u0158"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0163\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u016f\n\27\f\27\16"+
		"\27\u0172\13\27\3\27\3\27\5\27\u0176\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\7\30\u017e\n\30\f\30\16\30\u0181\13\30\3\30\3\30\3\30\5\30\u0186\n\30"+
		"\3\31\3\31\3\32\6\32\u018b\n\32\r\32\16\32\u018c\3\33\6\33\u0190\n\33"+
		"\r\33\16\33\u0191\3\33\3\33\6\33\u0196\n\33\r\33\16\33\u0197\3\34\3\34"+
		"\5\34\u019c\n\34\3\34\4\u0149\u017f\3 \35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2.\63\3\2<=\3\2\33&\3\2)-\2\u01c0"+
		"\2;\3\2\2\2\4A\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\f[\3\2\2\2\16"+
		"_\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24p\3\2\2\2\26s\3\2\2\2\30\u0101\3\2"+
		"\2\2\32\u0106\3\2\2\2\34\u0117\3\2\2\2\36\u0121\3\2\2\2 \u0132\3\2\2\2"+
		"\"\u013d\3\2\2\2$\u0141\3\2\2\2&\u0154\3\2\2\2(\u0157\3\2\2\2*\u0162\3"+
		"\2\2\2,\u0164\3\2\2\2.\u0185\3\2\2\2\60\u0187\3\2\2\2\62\u018a\3\2\2\2"+
		"\64\u018f\3\2\2\2\66\u019b\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>B\5\6\4\2?B\5\b\5\2@B\5\n\6\2A>\3"+
		"\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\5\60\31\2DG\7\26\2\2EF\7\64\2"+
		"\2FH\5 \21\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\31\2\2JM\3\2\2\2KM\5,\27"+
		"\2LC\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\5\60\31\2OP\7\26\2\2PQ\5\22\n\2QR"+
		"\5\26\f\2R\t\3\2\2\2ST\7\26\2\2TU\7\64\2\2UV\5\20\t\2VW\7\66\2\2WX\5\62"+
		"\32\2XY\7\67\2\2YZ\7\31\2\2Z\13\3\2\2\2[\\\7\26\2\2\\]\7\3\2\2]^\5\16"+
		"\b\2^\r\3\2\2\2_`\t\2\2\2`\17\3\2\2\2ab\t\3\2\2b\21\3\2\2\2cl\7\66\2\2"+
		"di\5\24\13\2ef\7\4\2\2fh\5\24\13\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\67\2\2o\23"+
		"\3\2\2\2pq\5\60\31\2qr\7\26\2\2r\25\3\2\2\2sw\78\2\2tv\5\6\4\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z|\5\30\r\2{z\3\2"+
		"\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\79\2\2\u0081\27\3\2\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\31\2"+
		"\2\u0084\u0102\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0087\7\66\2\2\u0087"+
		"\u0088\5 \21\2\u0088\u0089\7\67\2\2\u0089\u008a\7\31\2\2\u008a\u0102\3"+
		"\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7\66\2\2\u008d\u008e\5 \21\2\u008e"+
		"\u008f\7\67\2\2\u008f\u0093\78\2\2\u0090\u0092\5\30\r\2\u0091\u0090\3"+
		"\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u00aa\79\2\2\u0097\u0098\7\7"+
		"\2\2\u0098\u009c\7\66\2\2\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\67\2\2\u00a0\u00a4\78\2\2\u00a1"+
		"\u00a3\5\30\r\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\79\2\2\u00a8\u0097\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\b\2\2\u00ae\u00b2\78\2\2\u00af\u00b1\5\30\r\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\79\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u0102\3\2\2\2\u00b8\u00b9\7\t\2\2\u00b9"+
		"\u00bd\78\2\2\u00ba\u00bc\5\30\r\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\79\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\7\66"+
		"\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\67\2\2\u00c5\u0102\3\2\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00c8\7\66\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7"+
		"\67\2\2\u00ca\u00ce\78\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\79\2\2\u00d2\u0102\3\2\2\2\u00d3"+
		"\u00d4\7\13\2\2\u00d4\u00d5\5\62\32\2\u00d5\u00d6\7\f\2\2\u00d6\u00da"+
		"\78\2\2\u00d7\u00d9\5\30\r\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\79\2\2\u00de\u0102\3\2\2\2\u00df\u00e0\7\r\2\2\u00e0"+
		"\u00e1\7\66\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\67\2\2\u00e3\u00e7\7"+
		"8\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00ec\5\36\20\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\79\2\2\u00ee\u0102\3\2\2\2\u00ef\u00f0\7\16"+
		"\2\2\u00f0\u00f1\7\66\2\2\u00f1\u00f2\5\32\16\2\u00f2\u00f3\7\67\2\2\u00f3"+
		"\u00f4\7\31\2\2\u00f4\u0102\3\2\2\2\u00f5\u00f7\7\17\2\2\u00f6\u00f8\5"+
		" \21\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u0102\7\31\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\31\2\2\u00fc\u0102\3"+
		"\2\2\2\u00fd\u00fe\5\f\7\2\u00fe\u00ff\7\31\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u0102\5 \21\2\u0101\u0082\3\2\2\2\u0101\u0085\3\2\2\2\u0101\u008b\3\2"+
		"\2\2\u0101\u00b8\3\2\2\2\u0101\u00c6\3\2\2\2\u0101\u00d3\3\2\2\2\u0101"+
		"\u00df\3\2\2\2\u0101\u00ef\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00fa\3\2"+
		"\2\2\u0101\u00fd\3\2\2\2\u0101\u0100\3\2\2\2\u0102\31\3\2\2\2\u0103\u0104"+
		"\5\62\32\2\u0104\u0105\7\20\2\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u010b\3\2\2\2\u0108\u0109\5\62\32\2\u0109"+
		"\u010a\7\21\2\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u0110\3\2\2\2\u010d\u010e\5\62\32\2\u010e\u010f\7\22\2\2"+
		"\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0115"+
		"\3\2\2\2\u0112\u0113\5\62\32\2\u0113\u0114\7\23\2\2\u0114\u0116\3\2\2"+
		"\2\u0115\u0112\3\2\2\2\u0115\u0116\3\2\2\2\u0116\33\3\2\2\2\u0117\u0118"+
		"\5&\24\2\u0118\u011c\7\65\2\2\u0119\u011b\5\30\r\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\31\2\2\u0120\35\3\2\2\2\u0121"+
		"\u0122\7\b\2\2\u0122\u0126\7\65\2\2\u0123\u0125\5\30\r\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\31\2\2\u012a\37\3\2\2"+
		"\2\u012b\u012c\b\21\1\2\u012c\u0133\5\"\22\2\u012d\u012e\7\24\2\2\u012e"+
		"\u0133\5 \21\5\u012f\u0130\7\34\2\2\u0130\u0133\5 \21\4\u0131\u0133\5"+
		"&\24\2\u0132\u012b\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012f\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u013a\3\2\2\2\u0134\u0135\f\6\2\2\u0135\u0136\5$"+
		"\23\2\u0136\u0137\5 \21\7\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b!\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u013e\7\26\2\2\u013e\u013f\7\64\2\2\u013f\u0140"+
		"\5 \21\2\u0140#\3\2\2\2\u0141\u0142\t\4\2\2\u0142%\3\2\2\2\u0143\u0155"+
		"\7\26\2\2\u0144\u0155\5\66\34\2\u0145\u0149\7\25\2\2\u0146\u0148\13\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0155\7\25"+
		"\2\2\u014d\u0155\7\'\2\2\u014e\u0155\7(\2\2\u014f\u0150\7\66\2\2\u0150"+
		"\u0151\5 \21\2\u0151\u0152\7\67\2\2\u0152\u0155\3\2\2\2\u0153\u0155\5"+
		"(\25\2\u0154\u0143\3\2\2\2\u0154\u0144\3\2\2\2\u0154\u0145\3\2\2\2\u0154"+
		"\u014d\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2\2\u0154\u0153\3\2"+
		"\2\2\u0155\'\3\2\2\2\u0156\u0158\7\26\2\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\66\2\2\u015a\u015b\5*\26\2"+
		"\u015b\u015c\7\67\2\2\u015c)\3\2\2\2\u015d\u0163\5 \21\2\u015e\u015f\5"+
		" \21\2\u015f\u0160\7\4\2\2\u0160\u0161\5*\26\2\u0161\u0163\3\2\2\2\u0162"+
		"\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0163+\3\2\2\2\u0164\u0165\5\60\31"+
		"\2\u0165\u0166\7\26\2\2\u0166\u0167\7:\2\2\u0167\u0168\5\62\32\2\u0168"+
		"\u0175\7;\2\2\u0169\u016a\7\64\2\2\u016a\u016b\78\2\2\u016b\u0170\5.\30"+
		"\2\u016c\u016d\7\4\2\2\u016d\u016f\5.\30\2\u016e\u016c\3\2\2\2\u016f\u0172"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\79\2\2\u0174\u0176\3\2\2\2\u0175\u0169\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\31\2\2\u0178"+
		"-\3\2\2\2\u0179\u0186\7\26\2\2\u017a\u0186\5\62\32\2\u017b\u017f\7\25"+
		"\2\2\u017c\u017e\13\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0186\7\25\2\2\u0183\u0186\7\'\2\2\u0184\u0186\7(\2\2\u0185"+
		"\u0179\3\2\2\2\u0185\u017a\3\2\2\2\u0185\u017b\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0184\3\2\2\2\u0186/\3\2\2\2\u0187\u0188\t\5\2\2\u0188\61\3"+
		"\2\2\2\u0189\u018b\7\27\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\63\3\2\2\2\u018e\u0190\7\27\2"+
		"\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\3\2\2\u0194\u0196\7\27\2\2"+
		"\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\65\3\2\2\2\u0199\u019c\5\62\32\2\u019a\u019c\5\64\33\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\67\3\2\2\2+;AGLilw}\u0093"+
		"\u009c\u00a4\u00aa\u00b2\u00b6\u00bd\u00ce\u00da\u00e7\u00eb\u00f7\u0101"+
		"\u0106\u010b\u0110\u0115\u011c\u0126\u0132\u013a\u0149\u0154\u0157\u0162"+
		"\u0170\u0175\u017f\u0185\u018c\u0191\u0197\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}