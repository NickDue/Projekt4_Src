// Generated from AEL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AELLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OBJFUNCID=7, TYPE=8, STRINGLITERTAL=9, 
		NORMALDIGIT=10, STARTDIGIT=11, SEMICOLON=12, PLUSOP=13, SUBOP=14, MULTOP=15, 
		DIVOP=16, ANDOP=17, OROP=18, EQUALOP=19, NOTEQUALOP=20, LESSOP=21, GREATEROP=22, 
		LESSSEQUALSOP=23, GREATEREQUALSOP=24, TRUETERM=25, FALSETERM=26, NUMBERTYPE=27, 
		BOOLEANTYPE=28, VOIDTYPE=29, STRINGTYPE=30, CHARACTERTYPE=31, ONFUNC=32, 
		OFFFUNC=33, ISONFUNC=34, ISOFFFUNC=35, ASSIGN=36, COLON=37, LPAREN=38, 
		RPAREN=39, LCURLY=40, RCURLY=41, LSQ=42, RSQ=43, BUTTON=44, LED=45, PRINT=46, 
		IF=47, ELIF=48, ELSE=49, DO=50, WHILE=51, LOOP=52, TIMES=53, WHEN=54, 
		WAIT=55, RETURN=56, ID=57, WS=58, COMMENT1=59, COMMENT2=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OBJFUNCID", "TYPE", 
			"STRINGLITERTAL", "NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "PLUSOP", 
			"SUBOP", "MULTOP", "DIVOP", "ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", 
			"LESSOP", "GREATEROP", "LESSSEQUALSOP", "GREATEREQUALSOP", "TRUETERM", 
			"FALSETERM", "NUMBERTYPE", "BOOLEANTYPE", "VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", 
			"ONFUNC", "OFFFUNC", "ISONFUNC", "ISOFFFUNC", "ASSIGN", "COLON", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "LSQ", "RSQ", "BUTTON", "LED", "PRINT", 
			"IF", "ELIF", "ELSE", "DO", "WHILE", "LOOP", "TIMES", "WHEN", "WAIT", 
			"RETURN", "ID", "WS", "COMMENT1", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'h'", "'m'", "'s'", "'ms'", null, null, null, null, 
			null, "';'", "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'equals'", 
			"'not equals'", "'<'", "'>'", "'<='", "'>='", "'true'", "'false'", "'number'", 
			"'bool'", "'void'", "'string'", "'char'", "'On()'", "'Off()'", "'isOn()'", 
			"'isOff()'", "'='", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'BUTTON'", "'LED'", "'print'", "'if'", "'elif'", "'else'", "'do'", "'while'", 
			"'loop'", "'times'", "'when'", "'wait'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "OBJFUNCID", "TYPE", "STRINGLITERTAL", 
			"NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "PLUSOP", "SUBOP", "MULTOP", 
			"DIVOP", "ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", "LESSOP", "GREATEROP", 
			"LESSSEQUALSOP", "GREATEREQUALSOP", "TRUETERM", "FALSETERM", "NUMBERTYPE", 
			"BOOLEANTYPE", "VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", "ONFUNC", "OFFFUNC", 
			"ISONFUNC", "ISOFFFUNC", "ASSIGN", "COLON", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "LSQ", "RSQ", "BUTTON", "LED", "PRINT", "IF", "ELIF", "ELSE", 
			"DO", "WHILE", "LOOP", "TIMES", "WHEN", "WAIT", "RETURN", "ID", "WS", 
			"COMMENT1", "COMMENT2"
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


	public AELLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AEL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u018b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u008b"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\n\3\n\7\n\u0098\n\n\f"+
		"\n\16\n\u009b\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\3:\3:\7:\u0167\n:\f:\16:\u016a\13:\3;"+
		"\6;\u016d\n;\r;\16;\u016e\3;\3;\3<\3<\3<\3<\7<\u0177\n<\f<\16<\u017a\13"+
		"<\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u0185\n=\f=\16=\u0188\13=\3=\3=\3\u0178"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>\3\2\t\t\2\"#%(*<>AC_aac|\3\2\62;\3\2\63;\6\2//C\\aac|\7"+
		"\2//\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0195\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3"+
		"\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2"+
		"\17\u008a\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u009e\3\2\2\2\27"+
		"\u00a0\3\2\2\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8"+
		"\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00b0\3\2\2\2\'\u00b3\3\2\2\2"+
		")\u00ba\3\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00cc"+
		"\3\2\2\2\63\u00cf\3\2\2\2\65\u00d4\3\2\2\2\67\u00da\3\2\2\29\u00e1\3\2"+
		"\2\2;\u00e6\3\2\2\2=\u00eb\3\2\2\2?\u00f2\3\2\2\2A\u00f7\3\2\2\2C\u00fc"+
		"\3\2\2\2E\u0102\3\2\2\2G\u0109\3\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M"+
		"\u0115\3\2\2\2O\u0117\3\2\2\2Q\u0119\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2"+
		"\2\2W\u011f\3\2\2\2Y\u0121\3\2\2\2[\u0128\3\2\2\2]\u012c\3\2\2\2_\u0132"+
		"\3\2\2\2a\u0135\3\2\2\2c\u013a\3\2\2\2e\u013f\3\2\2\2g\u0142\3\2\2\2i"+
		"\u0148\3\2\2\2k\u014d\3\2\2\2m\u0153\3\2\2\2o\u0158\3\2\2\2q\u015d\3\2"+
		"\2\2s\u0164\3\2\2\2u\u016c\3\2\2\2w\u0172\3\2\2\2y\u0180\3\2\2\2{|\7\60"+
		"\2\2|\4\3\2\2\2}~\7.\2\2~\6\3\2\2\2\177\u0080\7j\2\2\u0080\b\3\2\2\2\u0081"+
		"\u0082\7o\2\2\u0082\n\3\2\2\2\u0083\u0084\7u\2\2\u0084\f\3\2\2\2\u0085"+
		"\u0086\7o\2\2\u0086\u0087\7u\2\2\u0087\16\3\2\2\2\u0088\u008b\5Y-\2\u0089"+
		"\u008b\5[.\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\20\3\2\2\2"+
		"\u008c\u0092\5\67\34\2\u008d\u0092\59\35\2\u008e\u0092\5;\36\2\u008f\u0092"+
		"\5=\37\2\u0090\u0092\5? \2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\22\3\2\2"+
		"\2\u0093\u0099\7$\2\2\u0094\u0098\t\2\2\2\u0095\u0096\7^\2\2\u0096\u0098"+
		"\7$\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7$\2\2\u009d\24\3\2\2\2\u009e\u009f\t\3\2\2\u009f\26"+
		"\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7=\2\2\u00a3"+
		"\32\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af"+
		"$\3\2\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7s\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\7g\2"+
		"\2\u00bf\u00c0\7s\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7u\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6,\3"+
		"\2\2\2\u00c7\u00c8\7@\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\60\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ce\62"+
		"\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\66\3\2\2\2\u00da"+
		"\u00db\7p\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7d\2\2"+
		"\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e08\3\2\2\2\u00e1\u00e2\7d\2"+
		"\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7n\2\2\u00e5:\3\2"+
		"\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7f\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7i\2\2\u00f1"+
		">\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7c\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7*\2\2\u00fa\u00fb\7+\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7Q\2\2\u00fd"+
		"\u00fe\7h\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7*\2\2\u0100\u0101\7+\2\2"+
		"\u0101D\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104\u0105\7Q\2"+
		"\2\u0105\u0106\7p\2\2\u0106\u0107\7*\2\2\u0107\u0108\7+\2\2\u0108F\3\2"+
		"\2\2\u0109\u010a\7k\2\2\u010a\u010b\7u\2\2\u010b\u010c\7Q\2\2\u010c\u010d"+
		"\7h\2\2\u010d\u010e\7h\2\2\u010e\u010f\7*\2\2\u010f\u0110\7+\2\2\u0110"+
		"H\3\2\2\2\u0111\u0112\7?\2\2\u0112J\3\2\2\2\u0113\u0114\7<\2\2\u0114L"+
		"\3\2\2\2\u0115\u0116\7*\2\2\u0116N\3\2\2\2\u0117\u0118\7+\2\2\u0118P\3"+
		"\2\2\2\u0119\u011a\7}\2\2\u011aR\3\2\2\2\u011b\u011c\7\177\2\2\u011cT"+
		"\3\2\2\2\u011d\u011e\7]\2\2\u011eV\3\2\2\2\u011f\u0120\7_\2\2\u0120X\3"+
		"\2\2\2\u0121\u0122\7D\2\2\u0122\u0123\7W\2\2\u0123\u0124\7V\2\2\u0124"+
		"\u0125\7V\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7P\2\2\u0127Z\3\2\2\2\u0128"+
		"\u0129\7N\2\2\u0129\u012a\7G\2\2\u012a\u012b\7F\2\2\u012b\\\3\2\2\2\u012c"+
		"\u012d\7r\2\2\u012d\u012e\7t\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2"+
		"\u0130\u0131\7v\2\2\u0131^\3\2\2\2\u0132\u0133\7k\2\2\u0133\u0134\7h\2"+
		"\2\u0134`\3\2\2\2\u0135\u0136\7g\2\2\u0136\u0137\7n\2\2\u0137\u0138\7"+
		"k\2\2\u0138\u0139\7h\2\2\u0139b\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c"+
		"\7n\2\2\u013c\u013d\7u\2\2\u013d\u013e\7g\2\2\u013ed\3\2\2\2\u013f\u0140"+
		"\7f\2\2\u0140\u0141\7q\2\2\u0141f\3\2\2\2\u0142\u0143\7y\2\2\u0143\u0144"+
		"\7j\2\2\u0144\u0145\7k\2\2\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147"+
		"h\3\2\2\2\u0148\u0149\7n\2\2\u0149\u014a\7q\2\2\u014a\u014b\7q\2\2\u014b"+
		"\u014c\7r\2\2\u014cj\3\2\2\2\u014d\u014e\7v\2\2\u014e\u014f\7k\2\2\u014f"+
		"\u0150\7o\2\2\u0150\u0151\7g\2\2\u0151\u0152\7u\2\2\u0152l\3\2\2\2\u0153"+
		"\u0154\7y\2\2\u0154\u0155\7j\2\2\u0155\u0156\7g\2\2\u0156\u0157\7p\2\2"+
		"\u0157n\3\2\2\2\u0158\u0159\7y\2\2\u0159\u015a\7c\2\2\u015a\u015b\7k\2"+
		"\2\u015b\u015c\7v\2\2\u015cp\3\2\2\2\u015d\u015e\7t\2\2\u015e\u015f\7"+
		"g\2\2\u015f\u0160\7v\2\2\u0160\u0161\7w\2\2\u0161\u0162\7t\2\2\u0162\u0163"+
		"\7p\2\2\u0163r\3\2\2\2\u0164\u0168\t\5\2\2\u0165\u0167\t\6\2\2\u0166\u0165"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"t\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\t\7\2\2\u016c\u016b\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0171\b;\2\2\u0171v\3\2\2\2\u0172\u0173\7\61\2\2\u0173"+
		"\u0174\7,\2\2\u0174\u0178\3\2\2\2\u0175\u0177\13\2\2\2\u0176\u0175\3\2"+
		"\2\2\u0177\u017a\3\2\2\2\u0178\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\7\61"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b<\2\2\u017fx\3\2\2\2\u0180\u0181"+
		"\7\61\2\2\u0181\u0182\7\61\2\2\u0182\u0186\3\2\2\2\u0183\u0185\n\b\2\2"+
		"\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\b=\2\2\u018a"+
		"z\3\2\2\2\13\2\u008a\u0091\u0097\u0099\u0168\u016e\u0178\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}