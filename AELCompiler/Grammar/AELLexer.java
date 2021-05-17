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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OBJFUNCID", "TYPE", 
			"ID", "STRINGLITERTAL", "NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "WS", 
			"PLUSOP", "SUBOP", "MULTOP", "DIVOP", "ANDOP", "OROP", "EQUALOP", "NOTEQUALOP", 
			"LESSOP", "GREATEROP", "LESSSEQUALSOP", "GREATEREQUALSOP", "TRUETERM", 
			"FALSETERM", "NUMBERTYPE", "BOOLEANTYPE", "VOIDTYPE", "STRINGTYPE", "CHARACTERTYPE", 
			"ONFUNC", "OFFFUNC", "READFUNC", "WRITEFUNC", "ISONFUNC", "ISOFFFUNC", 
			"ASSIGN", "COLON", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LSQ", "RSQ", 
			"BUTTON", "LED", "PRINT", "IF", "ELIF", "ELSE", "DO", "WHILE", "LOOP", 
			"TIMES", "WHEN", "WAIT", "RETURN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u008b"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\7\n\u0096\n\n\f\n\16\n"+
		"\u0099\13\n\3\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17\u00ab\n\17\r\17\16\17\u00ac\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\38\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		"=\3=\3=\3\u009e\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2"+
		"\63;\5\2\13\f\17\17\"\"\2\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081"+
		"\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2\21\u0091\3"+
		"\2\2\2\23\u0093\3\2\2\2\25\u009a\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2"+
		"\2\2\33\u00a7\3\2\2\2\35\u00aa\3\2\2\2\37\u00b0\3\2\2\2!\u00b2\3\2\2\2"+
		"#\u00b4\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3\2\2\2)\u00bc\3\2\2\2+\u00bf\3"+
		"\2\2\2-\u00c6\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d8\3\2\2\2\67\u00db\3\2\2\29\u00e0\3\2\2\2;\u00e6\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00f2\3\2\2\2A\u00f7\3\2\2\2C\u00fe\3\2\2\2E\u0103\3\2\2\2G"+
		"\u0108\3\2\2\2I\u010e\3\2\2\2K\u0115\3\2\2\2M\u011d\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u012c\3\2\2\2S\u012e\3\2\2\2U\u0130\3\2\2\2W\u0132\3\2\2\2Y\u0134"+
		"\3\2\2\2[\u0136\3\2\2\2]\u0138\3\2\2\2_\u013a\3\2\2\2a\u013c\3\2\2\2c"+
		"\u0143\3\2\2\2e\u0147\3\2\2\2g\u014d\3\2\2\2i\u0150\3\2\2\2k\u0155\3\2"+
		"\2\2m\u015a\3\2\2\2o\u015d\3\2\2\2q\u0163\3\2\2\2s\u0168\3\2\2\2u\u016e"+
		"\3\2\2\2w\u0173\3\2\2\2y\u0178\3\2\2\2{|\7\60\2\2|\4\3\2\2\2}~\7.\2\2"+
		"~\6\3\2\2\2\177\u0080\7j\2\2\u0080\b\3\2\2\2\u0081\u0082\7o\2\2\u0082"+
		"\n\3\2\2\2\u0083\u0084\7u\2\2\u0084\f\3\2\2\2\u0085\u0086\7o\2\2\u0086"+
		"\u0087\7u\2\2\u0087\16\3\2\2\2\u0088\u008b\5a\61\2\u0089\u008b\5c\62\2"+
		"\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\20\3\2\2\2\u008c\u0092"+
		"\5;\36\2\u008d\u0092\5=\37\2\u008e\u0092\5? \2\u008f\u0092\5A!\2\u0090"+
		"\u0092\5C\"\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\22\3\2\2\2\u0093\u0097"+
		"\t\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\24\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009e\7$\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\t\4\2\2"+
		"\u00a4\30\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7="+
		"\2\2\u00a8\34\3\2\2\2\u00a9\u00ab\t\6\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\b\17\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1 \3\2\2\2\u00b2"+
		"\u00b3\7/\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5$\3\2\2\2\u00b6"+
		"\u00b7\7\61\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be"+
		"*\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7s\2\2\u00c1\u00c2\7w\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5,\3\2\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7\"\2"+
		"\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7s\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0.\3\2\2\2\u00d1\u00d2"+
		"\7>\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4\62\3\2\2\2\u00d5\u00d6"+
		"\7>\2\2\u00d6\u00d7\7?\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da"+
		"\7?\2\2\u00da\66\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de"+
		"\7w\2\2\u00de\u00df\7g\2\2\u00df8\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		":\3\2\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7o\2\2\u00e9"+
		"\u00ea\7d\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec<\3\2\2\2\u00ed"+
		"\u00ee\7d\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7n\2\2"+
		"\u00f1>\3\2\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7k\2"+
		"\2\u00f5\u00f6\7f\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7"+
		"v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd"+
		"\7i\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7j\2\2\u0100\u0101"+
		"\7c\2\2\u0101\u0102\7t\2\2\u0102D\3\2\2\2\u0103\u0104\7Q\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7*\2\2\u0106\u0107\7+\2\2\u0107F\3\2\2\2\u0108\u0109"+
		"\7Q\2\2\u0109\u010a\7h\2\2\u010a\u010b\7h\2\2\u010b\u010c\7*\2\2\u010c"+
		"\u010d\7+\2\2\u010dH\3\2\2\2\u010e\u010f\7T\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7c\2\2\u0111\u0112\7f\2\2\u0112\u0113\7*\2\2\u0113\u0114\7+\2\2"+
		"\u0114J\3\2\2\2\u0115\u0116\7Y\2\2\u0116\u0117\7t\2\2\u0117\u0118\7k\2"+
		"\2\u0118\u0119\7v\2\2\u0119\u011a\7g\2\2\u011a\u011b\7*\2\2\u011b\u011c"+
		"\7+\2\2\u011cL\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7u\2\2\u011f\u0120"+
		"\7Q\2\2\u0120\u0121\7p\2\2\u0121\u0122\7*\2\2\u0122\u0123\7+\2\2\u0123"+
		"N\3\2\2\2\u0124\u0125\7k\2\2\u0125\u0126\7u\2\2\u0126\u0127\7Q\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7h\2\2\u0129\u012a\7*\2\2\u012a\u012b\7+\2\2"+
		"\u012bP\3\2\2\2\u012c\u012d\7?\2\2\u012dR\3\2\2\2\u012e\u012f\7<\2\2\u012f"+
		"T\3\2\2\2\u0130\u0131\7*\2\2\u0131V\3\2\2\2\u0132\u0133\7+\2\2\u0133X"+
		"\3\2\2\2\u0134\u0135\7}\2\2\u0135Z\3\2\2\2\u0136\u0137\7\177\2\2\u0137"+
		"\\\3\2\2\2\u0138\u0139\7]\2\2\u0139^\3\2\2\2\u013a\u013b\7_\2\2\u013b"+
		"`\3\2\2\2\u013c\u013d\7D\2\2\u013d\u013e\7W\2\2\u013e\u013f\7V\2\2\u013f"+
		"\u0140\7V\2\2\u0140\u0141\7Q\2\2\u0141\u0142\7P\2\2\u0142b\3\2\2\2\u0143"+
		"\u0144\7N\2\2\u0144\u0145\7G\2\2\u0145\u0146\7F\2\2\u0146d\3\2\2\2\u0147"+
		"\u0148\7r\2\2\u0148\u0149\7t\2\2\u0149\u014a\7k\2\2\u014a\u014b\7p\2\2"+
		"\u014b\u014c\7v\2\2\u014cf\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f\7h\2"+
		"\2\u014fh\3\2\2\2\u0150\u0151\7g\2\2\u0151\u0152\7n\2\2\u0152\u0153\7"+
		"k\2\2\u0153\u0154\7h\2\2\u0154j\3\2\2\2\u0155\u0156\7g\2\2\u0156\u0157"+
		"\7n\2\2\u0157\u0158\7u\2\2\u0158\u0159\7g\2\2\u0159l\3\2\2\2\u015a\u015b"+
		"\7f\2\2\u015b\u015c\7q\2\2\u015cn\3\2\2\2\u015d\u015e\7y\2\2\u015e\u015f"+
		"\7j\2\2\u015f\u0160\7k\2\2\u0160\u0161\7n\2\2\u0161\u0162\7g\2\2\u0162"+
		"p\3\2\2\2\u0163\u0164\7n\2\2\u0164\u0165\7q\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7r\2\2\u0167r\3\2\2\2\u0168\u0169\7v\2\2\u0169\u016a\7k\2\2\u016a"+
		"\u016b\7o\2\2\u016b\u016c\7g\2\2\u016c\u016d\7u\2\2\u016dt\3\2\2\2\u016e"+
		"\u016f\7y\2\2\u016f\u0170\7j\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2"+
		"\u0172v\3\2\2\2\u0173\u0174\7y\2\2\u0174\u0175\7c\2\2\u0175\u0176\7k\2"+
		"\2\u0176\u0177\7v\2\2\u0177x\3\2\2\2\u0178\u0179\7t\2\2\u0179\u017a\7"+
		"g\2\2\u017a\u017b\7v\2\2\u017b\u017c\7w\2\2\u017c\u017d\7t\2\2\u017d\u017e"+
		"\7p\2\2\u017ez\3\2\2\2\b\2\u008a\u0091\u0097\u009e\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}