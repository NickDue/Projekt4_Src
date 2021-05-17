package ANTLR;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, STRINGLITERTAL=8, 
		NORMALDIGIT=9, STARTDIGIT=10, SEMICOLON=11, WS=12, PLUSOP=13, SUBOP=14, 
		MULTOP=15, DIVOP=16, ANDOP=17, OROP=18, EQUALOP=19, NOTEQUALOP=20, LESSOP=21, 
		GREATEROP=22, LESSSEQUALSOP=23, GREATEREQUALSOP=24, TRUETERM=25, FALSETERM=26, 
		NUMBERTYPE=27, BOOLEANTYPE=28, VOIDTYPE=29, STRINGTYPE=30, CHARACTERTYPE=31, 
		ONFUNC=32, OFFFUNC=33, READFUNC=34, WRITEFUNC=35, ISONFUNC=36, ISOFFFUNC=37, 
		ASSIGN=38, COLON=39, LPAREN=40, RPAREN=41, LCURLY=42, RCURLY=43, LSQ=44, 
		RSQ=45, BUTTON=46, LED=47, PRINT=48, IF=49, ELIF=50, ELSE=51, DO=52, WHILE=53, 
		LOOP=54, TIMES=55, WHEN=56, WAIT=57, RETURN=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "STRINGLITERTAL", 
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
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'h'", "'m'", "'s'", "'ms'", null, null, null, null, 
			"';'", null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'equals'", 
			"'not equals'", "'<'", "'>'", "'<='", "'>='", "'true'", "'false'", "'number'", 
			"'bool'", "'void'", "'string'", "'char'", "'On()'", "'Off()'", "'Read()'", 
			"'Write()'", "'isOn()'", "'isOff()'", "'='", "':'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'BUTTON'", "'LED'", "'print'", "'if'", "'elif'", 
			"'else'", "'do'", "'while'", "'loop'", "'times'", "'when'", "'wait'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "STRINGLITERTAL", "NORMALDIGIT", 
			"STARTDIGIT", "SEMICOLON", "WS", "PLUSOP", "SUBOP", "MULTOP", "DIVOP", 
			"ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", "LESSOP", "GREATEROP", "LESSSEQUALSOP", 
			"GREATEREQUALSOP", "TRUETERM", "FALSETERM", "NUMBERTYPE", "BOOLEANTYPE", 
			"VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", "ONFUNC", "OFFFUNC", "READFUNC", 
			"WRITEFUNC", "ISONFUNC", "ISOFFFUNC", "ASSIGN", "COLON", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LSQ", "RSQ", "BUTTON", "LED", "PRINT", "IF", "ELIF", 
			"ELSE", "DO", "WHILE", "LOOP", "TIMES", "WHEN", "WAIT", "RETURN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\u0087\n\b\f\b\16"+
		"\b\u008a\13\b\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091\13\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\6\r\u009c\n\r\r\r\16\r\u009d\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3\u008f\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2\63"+
		";\5\2\13\f\17\17\"\"\2\u0172\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u0084\3\2\2\2\21\u008b\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3"+
		"\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2"+
		"\2\2\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ad\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61"+
		"\u00c9\3\2\2\2\63\u00cc\3\2\2\2\65\u00d1\3\2\2\2\67\u00d7\3\2\2\29\u00de"+
		"\3\2\2\2;\u00e3\3\2\2\2=\u00e8\3\2\2\2?\u00ef\3\2\2\2A\u00f4\3\2\2\2C"+
		"\u00f9\3\2\2\2E\u00ff\3\2\2\2G\u0106\3\2\2\2I\u010e\3\2\2\2K\u0115\3\2"+
		"\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S\u0123\3\2\2\2U\u0125"+
		"\3\2\2\2W\u0127\3\2\2\2Y\u0129\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_"+
		"\u0134\3\2\2\2a\u0138\3\2\2\2c\u013e\3\2\2\2e\u0141\3\2\2\2g\u0146\3\2"+
		"\2\2i\u014b\3\2\2\2k\u014e\3\2\2\2m\u0154\3\2\2\2o\u0159\3\2\2\2q\u015f"+
		"\3\2\2\2s\u0164\3\2\2\2u\u0169\3\2\2\2wx\7\60\2\2x\4\3\2\2\2yz\7.\2\2"+
		"z\6\3\2\2\2{|\7j\2\2|\b\3\2\2\2}~\7o\2\2~\n\3\2\2\2\177\u0080\7u\2\2\u0080"+
		"\f\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083\7u\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0088\t\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\20\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008f\7$\2\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\t\4\2\2\u0095\24\3\2\2\2\u0096\u0097\t\5\2\2\u0097\26\3\2\2\2\u0098\u0099"+
		"\7=\2\2\u0099\30\3\2\2\2\u009a\u009c\t\6\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\b\r\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\34"+
		"\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6"+
		" \3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7t\2\2\u00af&\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7s\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2"+
		"\u00b6(\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7v\2"+
		"\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7s\2\2\u00bd\u00be"+
		"\7w\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"*\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5."+
		"\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7?\2\2\u00c8\60\3\2\2\2\u00c9"+
		"\u00ca\7@\2\2\u00ca\u00cb\7?\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0\64\3\2\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7"+
		"w\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd8\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1\u00e2\7n\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7x\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7f\2\2\u00e7<\3\2\2\2\u00e8\u00e9"+
		"\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0"+
		"\u00f1\7j\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3@\3\2\2\2\u00f4"+
		"\u00f5\7Q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7*\2\2\u00f7\u00f8\7+\2\2"+
		"\u00f8B\3\2\2\2\u00f9\u00fa\7Q\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7h\2"+
		"\2\u00fc\u00fd\7*\2\2\u00fd\u00fe\7+\2\2\u00feD\3\2\2\2\u00ff\u0100\7"+
		"T\2\2\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7f\2\2\u0103\u0104"+
		"\7*\2\2\u0104\u0105\7+\2\2\u0105F\3\2\2\2\u0106\u0107\7Y\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7*\2\2\u010c\u010d\7+\2\2\u010dH\3\2\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7p\2\2\u0112\u0113\7*\2\2"+
		"\u0113\u0114\7+\2\2\u0114J\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7u\2"+
		"\2\u0117\u0118\7Q\2\2\u0118\u0119\7h\2\2\u0119\u011a\7h\2\2\u011a\u011b"+
		"\7*\2\2\u011b\u011c\7+\2\2\u011cL\3\2\2\2\u011d\u011e\7?\2\2\u011eN\3"+
		"\2\2\2\u011f\u0120\7<\2\2\u0120P\3\2\2\2\u0121\u0122\7*\2\2\u0122R\3\2"+
		"\2\2\u0123\u0124\7+\2\2\u0124T\3\2\2\2\u0125\u0126\7}\2\2\u0126V\3\2\2"+
		"\2\u0127\u0128\7\177\2\2\u0128X\3\2\2\2\u0129\u012a\7]\2\2\u012aZ\3\2"+
		"\2\2\u012b\u012c\7_\2\2\u012c\\\3\2\2\2\u012d\u012e\7D\2\2\u012e\u012f"+
		"\7W\2\2\u012f\u0130\7V\2\2\u0130\u0131\7V\2\2\u0131\u0132\7Q\2\2\u0132"+
		"\u0133\7P\2\2\u0133^\3\2\2\2\u0134\u0135\7N\2\2\u0135\u0136\7G\2\2\u0136"+
		"\u0137\7F\2\2\u0137`\3\2\2\2\u0138\u0139\7r\2\2\u0139\u013a\7t\2\2\u013a"+
		"\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7v\2\2\u013db\3\2\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7h\2\2\u0140d\3\2\2\2\u0141\u0142\7g\2\2\u0142"+
		"\u0143\7n\2\2\u0143\u0144\7k\2\2\u0144\u0145\7h\2\2\u0145f\3\2\2\2\u0146"+
		"\u0147\7g\2\2\u0147\u0148\7n\2\2\u0148\u0149\7u\2\2\u0149\u014a\7g\2\2"+
		"\u014ah\3\2\2\2\u014b\u014c\7f\2\2\u014c\u014d\7q\2\2\u014dj\3\2\2\2\u014e"+
		"\u014f\7y\2\2\u014f\u0150\7j\2\2\u0150\u0151\7k\2\2\u0151\u0152\7n\2\2"+
		"\u0152\u0153\7g\2\2\u0153l\3\2\2\2\u0154\u0155\7n\2\2\u0155\u0156\7q\2"+
		"\2\u0156\u0157\7q\2\2\u0157\u0158\7r\2\2\u0158n\3\2\2\2\u0159\u015a\7"+
		"v\2\2\u015a\u015b\7k\2\2\u015b\u015c\7o\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7u\2\2\u015ep\3\2\2\2\u015f\u0160\7y\2\2\u0160\u0161\7j\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7p\2\2\u0163r\3\2\2\2\u0164\u0165\7y\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7k\2\2\u0167\u0168\7v\2\2\u0168t\3\2\2\2\u0169\u016a"+
		"\7t\2\2\u016a\u016b\7g\2\2\u016b\u016c\7v\2\2\u016c\u016d\7w\2\2\u016d"+
		"\u016e\7t\2\2\u016e\u016f\7p\2\2\u016fv\3\2\2\2\6\2\u0088\u008f\u009d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}