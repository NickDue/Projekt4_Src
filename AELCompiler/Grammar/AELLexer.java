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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, ID=8, STRINGLITERTAL=9, 
		NORMALDIGIT=10, STARTDIGIT=11, SEMICOLON=12, WS=13, PLUSOP=14, SUBOP=15, 
		MULTOP=16, DIVOP=17, ANDOP=18, OROP=19, EQUALOP=20, NOTEQUALOP=21, LESSOP=22, 
		GREATEROP=23, LESSSEQUALSOP=24, GREATEREQUALSOP=25, TRUETERM=26, FALSETERM=27, 
		NUMBERTYPE=28, BOOLEANTYPE=29, VOIDTYPE=30, STRINGTYPE=31, CHARACTERTYPE=32, 
		ONFUNC=33, OFFFUNC=34, READFUNC=35, WRITEFUNC=36, ISONFUNC=37, ISOFFFUNC=38, 
		ASSIGN=39, COLON=40, LPAREN=41, RPAREN=42, LCURLY=43, RCURLY=44, LSQ=45, 
		RSQ=46, BUTTON=47, LED=48, PRINT=49, IF=50, ELIF=51, ELSE=52, DO=53, WHILE=54, 
		LOOP=55, TIMES=56, WHEN=57, WAIT=58, RETURN=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TYPE", "ID", "STRINGLITERTAL", 
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
			null, "';'", null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'equals'", 
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
			null, null, null, null, null, null, null, "TYPE", "ID", "STRINGLITERTAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u008c\n\b\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\n\3\n\7\n\u0097"+
		"\n\n\f\n\16\n\u009a\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00a5"+
		"\n\16\r\16\16\16\u00a6\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3\u0098\2=\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2\u017f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5"+
		"{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17"+
		"\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u0094\3\2\2\2\25\u009d\3\2\2\2\27\u009f"+
		"\3\2\2\2\31\u00a1\3\2\2\2\33\u00a4\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3"+
		"\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3\2\2\2\'\u00b6\3\2\2\2)\u00b9"+
		"\3\2\2\2+\u00c0\3\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67\u00da\3\2\2\29\u00e0\3\2\2\2;\u00e7"+
		"\3\2\2\2=\u00ec\3\2\2\2?\u00f1\3\2\2\2A\u00f8\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0108\3\2\2\2I\u010f\3\2\2\2K\u0117\3\2\2\2M\u011e\3\2"+
		"\2\2O\u0126\3\2\2\2Q\u0128\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u012e"+
		"\3\2\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0136\3\2\2\2a"+
		"\u013d\3\2\2\2c\u0141\3\2\2\2e\u0147\3\2\2\2g\u014a\3\2\2\2i\u014f\3\2"+
		"\2\2k\u0154\3\2\2\2m\u0157\3\2\2\2o\u015d\3\2\2\2q\u0162\3\2\2\2s\u0168"+
		"\3\2\2\2u\u016d\3\2\2\2w\u0172\3\2\2\2yz\7\60\2\2z\4\3\2\2\2{|\7.\2\2"+
		"|\6\3\2\2\2}~\7j\2\2~\b\3\2\2\2\177\u0080\7o\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\7u\2\2\u0082\f\3\2\2\2\u0083\u0084\7o\2\2\u0084\u0085\7u\2\2\u0085"+
		"\16\3\2\2\2\u0086\u008c\59\35\2\u0087\u008c\5;\36\2\u0088\u008c\5=\37"+
		"\2\u0089\u008c\5? \2\u008a\u008c\5A!\2\u008b\u0086\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\20\3\2\2\2\u008d\u0091\t\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\22"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7$\2\2\u0095\u0097\13\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7$\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\t\4\2\2\u009e\26\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2\32\3\2\2\2\u00a3\u00a5\t\6\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\16\2\2\u00a9\34\3\2\2\2\u00aa\u00ab"+
		"\7-\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad \3\2\2\2\u00ae\u00af"+
		"\7,\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1$\3\2\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5&\3\2\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7t\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7s\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7s\2"+
		"\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7"+
		"@\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1\62"+
		"\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9\66\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7"+
		"n\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df8\3\2\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7d\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7n\2\2\u00eb<\3\2\2\2\u00ec"+
		"\u00ed\7x\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7f\2\2"+
		"\u00f0>\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2"+
		"\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7@\3\2"+
		"\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
		"\7t\2\2\u00fcB\3\2\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100"+
		"\7*\2\2\u0100\u0101\7+\2\2\u0101D\3\2\2\2\u0102\u0103\7Q\2\2\u0103\u0104"+
		"\7h\2\2\u0104\u0105\7h\2\2\u0105\u0106\7*\2\2\u0106\u0107\7+\2\2\u0107"+
		"F\3\2\2\2\u0108\u0109\7T\2\2\u0109\u010a\7g\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7f\2\2\u010c\u010d\7*\2\2\u010d\u010e\7+\2\2\u010eH\3\2\2\2\u010f"+
		"\u0110\7Y\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112\u0113\7v\2\2"+
		"\u0113\u0114\7g\2\2\u0114\u0115\7*\2\2\u0115\u0116\7+\2\2\u0116J\3\2\2"+
		"\2\u0117\u0118\7k\2\2\u0118\u0119\7u\2\2\u0119\u011a\7Q\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7*\2\2\u011c\u011d\7+\2\2\u011dL\3\2\2\2\u011e\u011f"+
		"\7k\2\2\u011f\u0120\7u\2\2\u0120\u0121\7Q\2\2\u0121\u0122\7h\2\2\u0122"+
		"\u0123\7h\2\2\u0123\u0124\7*\2\2\u0124\u0125\7+\2\2\u0125N\3\2\2\2\u0126"+
		"\u0127\7?\2\2\u0127P\3\2\2\2\u0128\u0129\7<\2\2\u0129R\3\2\2\2\u012a\u012b"+
		"\7*\2\2\u012bT\3\2\2\2\u012c\u012d\7+\2\2\u012dV\3\2\2\2\u012e\u012f\7"+
		"}\2\2\u012fX\3\2\2\2\u0130\u0131\7\177\2\2\u0131Z\3\2\2\2\u0132\u0133"+
		"\7]\2\2\u0133\\\3\2\2\2\u0134\u0135\7_\2\2\u0135^\3\2\2\2\u0136\u0137"+
		"\7D\2\2\u0137\u0138\7W\2\2\u0138\u0139\7V\2\2\u0139\u013a\7V\2\2\u013a"+
		"\u013b\7Q\2\2\u013b\u013c\7P\2\2\u013c`\3\2\2\2\u013d\u013e\7N\2\2\u013e"+
		"\u013f\7G\2\2\u013f\u0140\7F\2\2\u0140b\3\2\2\2\u0141\u0142\7r\2\2\u0142"+
		"\u0143\7t\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7v\2\2"+
		"\u0146d\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149\7h\2\2\u0149f\3\2\2\2\u014a"+
		"\u014b\7g\2\2\u014b\u014c\7n\2\2\u014c\u014d\7k\2\2\u014d\u014e\7h\2\2"+
		"\u014eh\3\2\2\2\u014f\u0150\7g\2\2\u0150\u0151\7n\2\2\u0151\u0152\7u\2"+
		"\2\u0152\u0153\7g\2\2\u0153j\3\2\2\2\u0154\u0155\7f\2\2\u0155\u0156\7"+
		"q\2\2\u0156l\3\2\2\2\u0157\u0158\7y\2\2\u0158\u0159\7j\2\2\u0159\u015a"+
		"\7k\2\2\u015a\u015b\7n\2\2\u015b\u015c\7g\2\2\u015cn\3\2\2\2\u015d\u015e"+
		"\7n\2\2\u015e\u015f\7q\2\2\u015f\u0160\7q\2\2\u0160\u0161\7r\2\2\u0161"+
		"p\3\2\2\2\u0162\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164\u0165\7o\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7u\2\2\u0167r\3\2\2\2\u0168\u0169\7y\2\2\u0169"+
		"\u016a\7j\2\2\u016a\u016b\7g\2\2\u016b\u016c\7p\2\2\u016ct\3\2\2\2\u016d"+
		"\u016e\7y\2\2\u016e\u016f\7c\2\2\u016f\u0170\7k\2\2\u0170\u0171\7v\2\2"+
		"\u0171v\3\2\2\2\u0172\u0173\7t\2\2\u0173\u0174\7g\2\2\u0174\u0175\7v\2"+
		"\2\u0175\u0176\7w\2\2\u0176\u0177\7t\2\2\u0177\u0178\7p\2\2\u0178x\3\2"+
		"\2\2\7\2\u008b\u0091\u0098\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}