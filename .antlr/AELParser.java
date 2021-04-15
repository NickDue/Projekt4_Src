// Generated from c:\Users\meerq\OneDrive\Skrivebord\Projekt4_Src\AEL.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, ID=52, NORMALDIGIT=53, 
		STARTDIGIT=54, SEMICOLON=55, WS=56;
	public static final int
		RULE_program = 0, RULE_declList = 1, RULE_decl = 2, RULE_varDecl = 3, 
		RULE_funcDecl = 4, RULE_objDecl = 5, RULE_objFuncId = 6, RULE_fParams = 7, 
		RULE_fParamsDecl = 8, RULE_funcBody = 9, RULE_stmt = 10, RULE_time = 11, 
		RULE_case_stmt = 12, RULE_default_stmt = 13, RULE_exp = 14, RULE_assignExp = 15, 
		RULE_operand = 16, RULE_term = 17, RULE_funccall = 18, RULE_aParams = 19, 
		RULE_array = 20, RULE_arrayval = 21, RULE_type = 22, RULE_loc = 23, RULE_intLiteral = 24, 
		RULE_floatLiteral = 25, RULE_number = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declList", "decl", "varDecl", "funcDecl", "objDecl", "objFuncId", 
			"fParams", "fParamsDecl", "funcBody", "stmt", "time", "case_stmt", "default_stmt", 
			"exp", "assignExp", "operand", "term", "funccall", "aParams", "array", 
			"arrayval", "type", "loc", "intLiteral", "floatLiteral", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'BUTTON'", "'LED'", "','", "'{'", "'}'", 
			"'print'", "'if'", "'elif'", "'else'", "'do'", "'while'", "'loop'", "'TIMES'", 
			"'when'", "'wait'", "'return'", "'h'", "'m'", "'s'", "'ms'", "'case'", 
			"':'", "'break'", "'default'", "'NOT'", "'-'", "'+'", "'*'", "'/'", "'and'", 
			"'or'", "'equals'", "'not equals'", "'<'", "'>'", "'<='", "'>='", "'\"'", 
			"'true'", "'false'", "'['", "']'", "'number'", "'bool'", "'void'", "'string'", 
			"'char'", "'.'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NORMALDIGIT", "STARTDIGIT", "SEMICOLON", 
			"WS"
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
		public TerminalNode EOF() { return getToken(AELParser.EOF, 0); }
		public List<DeclListContext> declList() {
			return getRuleContexts(DeclListContext.class);
		}
		public DeclListContext declList(int i) {
			return getRuleContext(DeclListContext.class,i);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << ID))) != 0)) {
				{
				{
				setState(54);
				declList();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
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

	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			type();
			setState(73);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(74);
				match(T__0);
				setState(75);
				exp(0);
				}
			}

			setState(78);
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
		enterRule(_localctx, 8, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			type();
			setState(81);
			match(ID);
			setState(82);
			fParams();
			setState(83);
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
		public ObjFuncIdContext objFuncId() {
			return getRuleContext(ObjFuncIdContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public ObjDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDecl; }
	}

	public final ObjDeclContext objDecl() throws RecognitionException {
		ObjDeclContext _localctx = new ObjDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(T__0);
			setState(87);
			objFuncId();
			setState(88);
			match(T__1);
			setState(89);
			intLiteral();
			setState(90);
			match(T__2);
			setState(91);
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

	public static class ObjFuncIdContext extends ParserRuleContext {
		public ObjFuncIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFuncId; }
	}

	public final ObjFuncIdContext objFuncId() throws RecognitionException {
		ObjFuncIdContext _localctx = new ObjFuncIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objFuncId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
			setState(95);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
				{
				setState(96);
				fParamsDecl();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(97);
					match(T__5);
					setState(98);
					fParamsDecl();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
			match(T__2);
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
		enterRule(_localctx, 16, RULE_fParamsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
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
			setState(111);
			match(T__6);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
				{
				{
				setState(112);
				varDecl();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
				{
				{
				setState(118);
				stmt();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__7);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				assignExp();
				setState(127);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__8);
				setState(130);
				match(T__1);
				setState(131);
				exp(0);
				setState(132);
				match(T__2);
				setState(133);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__9);
				setState(136);
				match(T__1);
				setState(137);
				exp(0);
				setState(138);
				match(T__2);
				setState(139);
				match(T__6);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
					{
					{
					setState(140);
					stmt();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__7);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(147);
					match(T__10);
					setState(148);
					match(T__6);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
						{
						{
						setState(149);
						stmt();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(155);
					match(T__7);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(161);
					match(T__11);
					setState(162);
					match(T__6);
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
						{
						{
						setState(163);
						stmt();
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(169);
					match(T__7);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__12);
				setState(173);
				match(T__6);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
					{
					{
					setState(174);
					stmt();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(T__7);
				setState(181);
				match(T__13);
				setState(182);
				match(T__1);
				setState(183);
				exp(0);
				setState(184);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(T__13);
				setState(187);
				match(T__1);
				setState(188);
				exp(0);
				setState(189);
				match(T__2);
				setState(190);
				match(T__6);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
					{
					{
					setState(191);
					stmt();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(T__14);
				setState(200);
				intLiteral();
				setState(201);
				match(T__15);
				setState(202);
				match(T__6);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
					{
					{
					setState(203);
					stmt();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__7);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(T__16);
				setState(212);
				match(T__1);
				setState(213);
				exp(0);
				setState(214);
				match(T__2);
				setState(215);
				match(T__6);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(216);
					case_stmt();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(222);
					default_stmt();
					}
				}

				setState(225);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				match(T__17);
				setState(228);
				match(T__1);
				setState(229);
				time();
				setState(230);
				match(T__2);
				setState(231);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				match(T__18);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
					{
					setState(234);
					exp(0);
					}
				}

				setState(237);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(238);
				funccall();
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(241);
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
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(244);
				intLiteral();
				setState(245);
				match(T__19);
				}
				break;
			}
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(249);
				intLiteral();
				setState(250);
				match(T__20);
				}
				break;
			}
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(254);
				intLiteral();
				setState(255);
				match(T__21);
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTDIGIT) {
				{
				setState(259);
				intLiteral();
				setState(260);
				match(T__22);
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
		enterRule(_localctx, 24, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__23);
			setState(265);
			term();
			setState(266);
			match(T__24);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
				{
				{
				setState(267);
				stmt();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__25);
			setState(274);
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
		enterRule(_localctx, 26, RULE_default_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__26);
			setState(277);
			match(T__24);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << STARTDIGIT))) != 0)) {
				{
				{
				setState(278);
				stmt();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(T__25);
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
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(288);
				assignExp();
				}
				break;
			case 2:
				{
				setState(289);
				match(T__27);
				setState(290);
				exp(3);
				}
				break;
			case 3:
				{
				setState(291);
				match(T__28);
				setState(292);
				exp(2);
				}
				break;
			case 4:
				{
				setState(293);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(296);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(297);
					operand();
					setState(298);
					exp(5);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 30, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ID);
			setState(306);
			match(T__0);
			setState(307);
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
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
		public List<TerminalNode> ID() { return getTokens(AELParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AELParser.ID, i);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				intLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(T__40);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(314);
					match(ID);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(T__41);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(T__42);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				match(T__1);
				setState(324);
				exp(0);
				setState(325);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
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
		public AParamsContext aParams() {
			return getRuleContext(AParamsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AELParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(330);
				match(ID);
				}
			}

			setState(333);
			match(T__1);
			setState(334);
			aParams();
			setState(335);
			match(T__2);
			setState(336);
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
		enterRule(_localctx, 38, RULE_aParams);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				exp(0);
				setState(340);
				match(T__5);
				setState(341);
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
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public List<ArrayvalContext> arrayval() {
			return getRuleContexts(ArrayvalContext.class);
		}
		public ArrayvalContext arrayval(int i) {
			return getRuleContext(ArrayvalContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			type();
			setState(346);
			match(ID);
			setState(347);
			match(T__43);
			setState(348);
			intLiteral();
			setState(349);
			match(T__44);
			setState(350);
			match(T__0);
			setState(351);
			match(T__6);
			setState(352);
			arrayval();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(353);
				match(T__5);
				setState(354);
				arrayval();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(T__7);
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
		public List<TerminalNode> ID() { return getTokens(AELParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AELParser.ID, i);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public ArrayvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayval; }
	}

	public final ArrayvalContext arrayval() throws RecognitionException {
		ArrayvalContext _localctx = new ArrayvalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayval);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(ID);
				}
				break;
			case STARTDIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				intLiteral();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(T__40);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(365);
					match(ID);
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(T__42);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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

	public static class LocContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AELParser.ID, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loc);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(ID);
				setState(380);
				match(T__50);
				setState(381);
				loc();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode STARTDIGIT() { return getToken(AELParser.STARTDIGIT, 0); }
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
		enterRule(_localctx, 48, RULE_intLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(STARTDIGIT);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(NORMALDIGIT);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode STARTDIGIT() { return getToken(AELParser.STARTDIGIT, 0); }
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
		enterRule(_localctx, 50, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTDIGIT) {
				{
				setState(391);
				match(STARTDIGIT);
				}
			}

			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394);
				match(NORMALDIGIT);
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NORMALDIGIT );
			setState(399);
			match(T__50);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				match(NORMALDIGIT);
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NORMALDIGIT );
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
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\6\3B\n\3\r\3\16\3C\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\7\tf\n\t\f\t\16\ti\13\t\5\tk\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\7\13t\n\13\f\13\16\13w\13\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0090\n\f\f\f\16\f\u0093\13\f\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f"+
		"\u009c\13\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f\3\f\3\f\7\f\u00a7"+
		"\n\f\f\f\16\f\u00aa\13\f\3\f\5\f\u00ad\n\f\3\f\3\f\3\f\7\f\u00b2\n\f\f"+
		"\f\16\f\u00b5\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00c3\n\f\f\f\16\f\u00c6\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cf\n"+
		"\f\f\f\16\f\u00d2\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00dc\n\f\f"+
		"\f\16\f\u00df\13\f\3\f\5\f\u00e2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00ee\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\r\3\r\3\r\5\r"+
		"\u00fa\n\r\3\r\3\r\3\r\5\r\u00ff\n\r\3\r\3\r\3\r\5\r\u0104\n\r\3\r\3\r"+
		"\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3\16\7\16\u010f\n\16\f\16\16\16\u0112"+
		"\13\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u011a\n\17\f\17\16\17\u011d"+
		"\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0129\n"+
		"\20\3\20\3\20\3\20\3\20\7\20\u012f\n\20\f\20\16\20\u0132\13\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u013e\n\23\f\23\16\23"+
		"\u0141\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014b\n\23\3"+
		"\24\5\24\u014e\n\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u015a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0166\n\26\f\26\16\26\u0169\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u0171\n\27\f\27\16\27\u0174\13\27\3\27\3\27\3\27\5\27\u0179\n\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\5\31\u0181\n\31\3\32\3\32\7\32\u0185\n\32\f"+
		"\32\16\32\u0188\13\32\3\33\5\33\u018b\n\33\3\33\6\33\u018e\n\33\r\33\16"+
		"\33\u018f\3\33\3\33\6\33\u0194\n\33\r\33\16\33\u0195\3\34\3\34\5\34\u019a"+
		"\n\34\3\34\2\3\36\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\5\3\2\6\7\3\2\37*\3\2\60\64\2\u01bd\2;\3\2\2\2\4A\3\2\2\2"+
		"\6H\3\2\2\2\bJ\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22"+
		"n\3\2\2\2\24q\3\2\2\2\26\u00f4\3\2\2\2\30\u00f9\3\2\2\2\32\u010a\3\2\2"+
		"\2\34\u0116\3\2\2\2\36\u0128\3\2\2\2 \u0133\3\2\2\2\"\u0137\3\2\2\2$\u014a"+
		"\3\2\2\2&\u014d\3\2\2\2(\u0159\3\2\2\2*\u015b\3\2\2\2,\u0178\3\2\2\2."+
		"\u017a\3\2\2\2\60\u0180\3\2\2\2\62\u0182\3\2\2\2\64\u018a\3\2\2\2\66\u0199"+
		"\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		";\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@B\5\6\4\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2D\5\3\2\2\2EI\5\b\5\2FI\5\n\6\2GI\5\f\7\2HE\3\2\2\2HF\3\2\2"+
		"\2HG\3\2\2\2I\7\3\2\2\2JK\5.\30\2KN\7\66\2\2LM\7\3\2\2MO\5\36\20\2NL\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\79\2\2Q\t\3\2\2\2RS\5.\30\2ST\7\66\2\2TU"+
		"\5\20\t\2UV\5\24\13\2V\13\3\2\2\2WX\7\66\2\2XY\7\3\2\2YZ\5\16\b\2Z[\7"+
		"\4\2\2[\\\5\62\32\2\\]\7\5\2\2]^\79\2\2^\r\3\2\2\2_`\t\2\2\2`\17\3\2\2"+
		"\2aj\7\4\2\2bg\5\22\n\2cd\7\b\2\2df\5\22\n\2ec\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\5"+
		"\2\2m\21\3\2\2\2no\5.\30\2op\7\66\2\2p\23\3\2\2\2qu\7\t\2\2rt\5\b\5\2"+
		"sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2\2\2wu\3\2\2\2xz\5\26\f"+
		"\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7"+
		"\n\2\2\177\25\3\2\2\2\u0080\u0081\5 \21\2\u0081\u0082\79\2\2\u0082\u00f5"+
		"\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\4\2\2\u0085\u0086\5\36\20"+
		"\2\u0086\u0087\7\5\2\2\u0087\u0088\79\2\2\u0088\u00f5\3\2\2\2\u0089\u008a"+
		"\7\f\2\2\u008a\u008b\7\4\2\2\u008b\u008c\5\36\20\2\u008c\u008d\7\5\2\2"+
		"\u008d\u0091\7\t\2\2\u008e\u0090\5\26\f\2\u008f\u008e\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u00a0\7\n\2\2\u0095\u0096\7\r\2\2\u0096\u009a\7\t"+
		"\2\2\u0097\u0099\5\26\f\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\7\n\2\2\u009e\u0095\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ac\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a8\7\t\2\2\u00a5\u00a7\5\26\f\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\n\2\2\u00ac"+
		"\u00a3\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00f5\3\2\2\2\u00ae\u00af\7\17"+
		"\2\2\u00af\u00b3\7\t\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7\20\2\2\u00b8"+
		"\u00b9\7\4\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\5\2\2\u00bb\u00f5\3"+
		"\2\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\5\36\20\2"+
		"\u00bf\u00c0\7\5\2\2\u00c0\u00c4\7\t\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00f5\3\2"+
		"\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc\7\22\2\2\u00cc"+
		"\u00d0\7\t\2\2\u00cd\u00cf\5\26\f\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00f5\3\2\2\2\u00d5\u00d6\7\23"+
		"\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\7\5\2\2\u00d9"+
		"\u00dd\7\t\2\2\u00da\u00dc\5\32\16\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\5\34\17\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\n\2\2\u00e4\u00f5\3\2\2\2\u00e5"+
		"\u00e6\7\24\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\7"+
		"\5\2\2\u00e9\u00ea\79\2\2\u00ea\u00f5\3\2\2\2\u00eb\u00ed\7\25\2\2\u00ec"+
		"\u00ee\5\36\20\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f5\79\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2\79\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f5\5\36\20\2\u00f4\u0080\3\2\2\2\u00f4\u0083\3"+
		"\2\2\2\u00f4\u0089\3\2\2\2\u00f4\u00ae\3\2\2\2\u00f4\u00bc\3\2\2\2\u00f4"+
		"\u00c9\3\2\2\2\u00f4\u00d5\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4\u00eb\3\2"+
		"\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f7"+
		"\5\62\32\2\u00f7\u00f8\7\26\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fc\5\62\32\2\u00fc"+
		"\u00fd\7\27\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0101\5\62\32\2\u0101\u0102\7\30\2\2"+
		"\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108"+
		"\3\2\2\2\u0105\u0106\5\62\32\2\u0106\u0107\7\31\2\2\u0107\u0109\3\2\2"+
		"\2\u0108\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109\31\3\2\2\2\u010a\u010b"+
		"\7\32\2\2\u010b\u010c\5$\23\2\u010c\u0110\7\33\2\2\u010d\u010f\5\26\f"+
		"\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\34\2\2"+
		"\u0114\u0115\79\2\2\u0115\33\3\2\2\2\u0116\u0117\7\35\2\2\u0117\u011b"+
		"\7\33\2\2\u0118\u011a\5\26\f\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u011f\7\34\2\2\u011f\u0120\79\2\2\u0120\35\3\2\2\2\u0121"+
		"\u0122\b\20\1\2\u0122\u0129\5 \21\2\u0123\u0124\7\36\2\2\u0124\u0129\5"+
		"\36\20\5\u0125\u0126\7\37\2\2\u0126\u0129\5\36\20\4\u0127\u0129\5$\23"+
		"\2\u0128\u0121\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u0130\3\2\2\2\u012a\u012b\f\6\2\2\u012b\u012c\5\"\22\2"+
		"\u012c\u012d\5\36\20\7\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\37\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7\66\2\2\u0134\u0135\7\3\2\2\u0135\u0136\5"+
		"\36\20\2\u0136!\3\2\2\2\u0137\u0138\t\3\2\2\u0138#\3\2\2\2\u0139\u014b"+
		"\7\66\2\2\u013a\u014b\5\62\32\2\u013b\u013f\7+\2\2\u013c\u013e\7\66\2"+
		"\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u014b\7+\2\2\u0143"+
		"\u014b\7,\2\2\u0144\u014b\7-\2\2\u0145\u0146\7\4\2\2\u0146\u0147\5\36"+
		"\20\2\u0147\u0148\7\5\2\2\u0148\u014b\3\2\2\2\u0149\u014b\5&\24\2\u014a"+
		"\u0139\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u013b\3\2\2\2\u014a\u0143\3\2"+
		"\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"%\3\2\2\2\u014c\u014e\7\66\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\7\4\2\2\u0150\u0151\5(\25\2\u0151\u0152"+
		"\7\5\2\2\u0152\u0153\79\2\2\u0153\'\3\2\2\2\u0154\u015a\5\36\20\2\u0155"+
		"\u0156\5\36\20\2\u0156\u0157\7\b\2\2\u0157\u0158\5(\25\2\u0158\u015a\3"+
		"\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u015a)\3\2\2\2\u015b\u015c"+
		"\5.\30\2\u015c\u015d\7\66\2\2\u015d\u015e\7.\2\2\u015e\u015f\5\62\32\2"+
		"\u015f\u0160\7/\2\2\u0160\u0161\7\3\2\2\u0161\u0162\7\t\2\2\u0162\u0167"+
		"\5,\27\2\u0163\u0164\7\b\2\2\u0164\u0166\5,\27\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\n\2\2\u016b+\3\2\2\2\u016c\u0179"+
		"\7\66\2\2\u016d\u0179\5\62\32\2\u016e\u0172\7+\2\2\u016f\u0171\7\66\2"+
		"\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0179\7+\2\2\u0176"+
		"\u0179\7,\2\2\u0177\u0179\7-\2\2\u0178\u016c\3\2\2\2\u0178\u016d\3\2\2"+
		"\2\u0178\u016e\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179-"+
		"\3\2\2\2\u017a\u017b\t\4\2\2\u017b/\3\2\2\2\u017c\u0181\7\66\2\2\u017d"+
		"\u017e\7\66\2\2\u017e\u017f\7\65\2\2\u017f\u0181\5\60\31\2\u0180\u017c"+
		"\3\2\2\2\u0180\u017d\3\2\2\2\u0181\61\3\2\2\2\u0182\u0186\78\2\2\u0183"+
		"\u0185\7\67\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\63\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018b\78\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018e\7\67\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\7\65"+
		"\2\2\u0192\u0194\7\67\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\65\3\2\2\2\u0197\u019a\5\62\32"+
		"\2\u0198\u019a\5\64\33\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\67\3\2\2\2+;CHNgju{\u0091\u009a\u00a0\u00a8\u00ac\u00b3\u00c4\u00d0\u00dd"+
		"\u00e1\u00ed\u00f4\u00f9\u00fe\u0103\u0108\u0110\u011b\u0128\u0130\u013f"+
		"\u014a\u014d\u0159\u0167\u0172\u0178\u0180\u0186\u018a\u018f\u0195\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}