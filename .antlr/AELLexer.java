// Generated from c:\Users\meerq\OneDrive\Skrivebord\Projekt4_Src\AEL.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "ID", "NORMALDIGIT", "STARTDIGIT", "SEMICOLON", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0151\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\65\6\65\u0141\n\65\r\65\16\65\u0142\3\66\3\66\3\67\3\67\38\38\39\6"+
		"9\u014c\n9\r9\169\u014d\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\6\4\2C\\c|\3\2\62;\3\2\63"+
		";\5\2\13\f\17\17\"\"\2\u0152\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2"+
		"\2\2\7w\3\2\2\2\ty\3\2\2\2\13\u0080\3\2\2\2\r\u0084\3\2\2\2\17\u0086\3"+
		"\2\2\2\21\u0088\3\2\2\2\23\u008a\3\2\2\2\25\u0090\3\2\2\2\27\u0093\3\2"+
		"\2\2\31\u0098\3\2\2\2\33\u009d\3\2\2\2\35\u00a0\3\2\2\2\37\u00a6\3\2\2"+
		"\2!\u00ab\3\2\2\2#\u00b1\3\2\2\2%\u00b6\3\2\2\2\'\u00bb\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00c4\3\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00cb\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d8\3\2\2\29\u00e0\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E"+
		"\u00f0\3\2\2\2G\u00f3\3\2\2\2I\u00fa\3\2\2\2K\u0105\3\2\2\2M\u0107\3\2"+
		"\2\2O\u0109\3\2\2\2Q\u010c\3\2\2\2S\u010f\3\2\2\2U\u0111\3\2\2\2W\u0116"+
		"\3\2\2\2Y\u011c\3\2\2\2[\u011e\3\2\2\2]\u0120\3\2\2\2_\u0127\3\2\2\2a"+
		"\u012c\3\2\2\2c\u0131\3\2\2\2e\u0138\3\2\2\2g\u013d\3\2\2\2i\u0140\3\2"+
		"\2\2k\u0144\3\2\2\2m\u0146\3\2\2\2o\u0148\3\2\2\2q\u014b\3\2\2\2st\7?"+
		"\2\2t\4\3\2\2\2uv\7*\2\2v\6\3\2\2\2wx\7+\2\2x\b\3\2\2\2yz\7D\2\2z{\7W"+
		"\2\2{|\7V\2\2|}\7V\2\2}~\7Q\2\2~\177\7P\2\2\177\n\3\2\2\2\u0080\u0081"+
		"\7N\2\2\u0081\u0082\7G\2\2\u0082\u0083\7F\2\2\u0083\f\3\2\2\2\u0084\u0085"+
		"\7.\2\2\u0085\16\3\2\2\2\u0086\u0087\7}\2\2\u0087\20\3\2\2\2\u0088\u0089"+
		"\7\177\2\2\u0089\22\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\24\3\2\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\26\3\2\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\30\3\2\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2"+
		"\u009c\32\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7q\2\2\u009f\34\3\2\2"+
		"\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7q\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7r\2\2\u00aa \3\2\2\2\u00ab\u00ac"+
		"\7V\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7O\2\2\u00ae\u00af\7G\2\2\u00af"+
		"\u00b0\7U\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7w\2\2"+
		"\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7j\2"+
		"\2\u00c3*\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7u\2\2"+
		"\u00c7.\3\2\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7u\2\2\u00ca\60\3\2\2\2"+
		"\u00cb\u00cc\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1\64\3\2\2\2\u00d2\u00d3"+
		"\7d\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7m\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7n\2\2"+
		"\u00de\u00df\7v\2\2\u00df8\3\2\2\2\u00e0\u00e1\7P\2\2\u00e1\u00e2\7Q\2"+
		"\2\u00e2\u00e3\7V\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5<\3\2\2\2"+
		"\u00e6\u00e7\7-\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9@\3\2\2\2\u00ea"+
		"\u00eb\7\61\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7f\2\2\u00efD\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"F\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7s\2\2\u00f5\u00f6\7w\2\2\u00f6"+
		"\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9H\3\2\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7\"\2"+
		"\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7s\2\2\u0100\u0101\7w\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104J\3\2\2\2\u0105\u0106"+
		"\7>\2\2\u0106L\3\2\2\2\u0107\u0108\7@\2\2\u0108N\3\2\2\2\u0109\u010a\7"+
		">\2\2\u010a\u010b\7?\2\2\u010bP\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e"+
		"\7?\2\2\u010eR\3\2\2\2\u010f\u0110\7$\2\2\u0110T\3\2\2\2\u0111\u0112\7"+
		"v\2\2\u0112\u0113\7t\2\2\u0113\u0114\7w\2\2\u0114\u0115\7g\2\2\u0115V"+
		"\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2\u0119"+
		"\u011a\7u\2\2\u011a\u011b\7g\2\2\u011bX\3\2\2\2\u011c\u011d\7]\2\2\u011d"+
		"Z\3\2\2\2\u011e\u011f\7_\2\2\u011f\\\3\2\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7w\2\2\u0122\u0123\7o\2\2\u0123\u0124\7d\2\2\u0124\u0125\7g\2\2"+
		"\u0125\u0126\7t\2\2\u0126^\3\2\2\2\u0127\u0128\7d\2\2\u0128\u0129\7q\2"+
		"\2\u0129\u012a\7q\2\2\u012a\u012b\7n\2\2\u012b`\3\2\2\2\u012c\u012d\7"+
		"x\2\2\u012d\u012e\7q\2\2\u012e\u012f\7k\2\2\u012f\u0130\7f\2\2\u0130b"+
		"\3\2\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7t\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136\u0137\7i\2\2\u0137d\3\2\2\2\u0138"+
		"\u0139\7e\2\2\u0139\u013a\7j\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2"+
		"\u013cf\3\2\2\2\u013d\u013e\7\60\2\2\u013eh\3\2\2\2\u013f\u0141\t\2\2"+
		"\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143j\3\2\2\2\u0144\u0145\t\3\2\2\u0145l\3\2\2\2\u0146\u0147"+
		"\t\4\2\2\u0147n\3\2\2\2\u0148\u0149\7=\2\2\u0149p\3\2\2\2\u014a\u014c"+
		"\t\5\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b9\2\2\u0150r\3\2\2\2\5"+
		"\2\u0142\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}