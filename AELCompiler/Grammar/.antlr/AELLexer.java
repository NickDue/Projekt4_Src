// Generated from c:\Users\meerq\OneDrive\Skrivebord\Projekt4_Src\AELCompiler\Grammar\AEL.g4 by ANTLR 4.8
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, ID=55, NORMALDIGIT=56, STARTDIGIT=57, SEMICOLON=58, 
		WS=59;
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
			"T__49", "T__50", "T__51", "T__52", "T__53", "ID", "NORMALDIGIT", "STARTDIGIT", 
			"SEMICOLON", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'.'", "'On()'", "'Off()'", "'Read()'", "'Write()'", 
			"'isOn()'", "'isOff()'", "'BUTTON'", "'LED'", "','", "'{'", "'}'", "'print'", 
			"'if'", "'elif'", "'else'", "'do'", "'while'", "'loop'", "'TIMES'", "'when'", 
			"'wait'", "'return'", "'h'", "'m'", "'s'", "'ms'", "':'", "'NOT'", "'-'", 
			"'+'", "'*'", "'/'", "'and'", "'or'", "'equals'", "'not equals'", "'<'", 
			"'>'", "'<='", "'>='", "'\"'", "'true'", "'false'", "'['", "']'", "'number'", 
			"'bool'", "'void'", "'string'", "'char'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "NORMALDIGIT", "STARTDIGIT", 
			"SEMICOLON", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u016f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\78"+
		"\u015e\n8\f8\168\u0161\138\39\39\3:\3:\3;\3;\3<\6<\u016a\n<\r<\16<\u016b"+
		"\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2\63;\5\2\13"+
		"\f\17\17\"\"\2\u0170\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2"+
		"\2\r\u0086\3\2\2\2\17\u008c\3\2\2\2\21\u0093\3\2\2\2\23\u009b\3\2\2\2"+
		"\25\u00a2\3\2\2\2\27\u00aa\3\2\2\2\31\u00b1\3\2\2\2\33\u00b5\3\2\2\2\35"+
		"\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bb\3\2\2\2#\u00c1\3\2\2\2%\u00c4\3"+
		"\2\2\2\'\u00c9\3\2\2\2)\u00ce\3\2\2\2+\u00d1\3\2\2\2-\u00d7\3\2\2\2/\u00dc"+
		"\3\2\2\2\61\u00e2\3\2\2\2\63\u00e7\3\2\2\2\65\u00ec\3\2\2\2\67\u00f3\3"+
		"\2\2\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fc\3\2\2\2A\u00fe"+
		"\3\2\2\2C\u0102\3\2\2\2E\u0104\3\2\2\2G\u0106\3\2\2\2I\u0108\3\2\2\2K"+
		"\u010a\3\2\2\2M\u010e\3\2\2\2O\u0111\3\2\2\2Q\u0118\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0125\3\2\2\2W\u0127\3\2\2\2Y\u012a\3\2\2\2[\u012d\3\2\2\2]\u012f"+
		"\3\2\2\2_\u0134\3\2\2\2a\u013a\3\2\2\2c\u013c\3\2\2\2e\u013e\3\2\2\2g"+
		"\u0145\3\2\2\2i\u014a\3\2\2\2k\u014f\3\2\2\2m\u0156\3\2\2\2o\u015b\3\2"+
		"\2\2q\u0162\3\2\2\2s\u0164\3\2\2\2u\u0166\3\2\2\2w\u0169\3\2\2\2yz\7?"+
		"\2\2z\4\3\2\2\2{|\7*\2\2|\6\3\2\2\2}~\7+\2\2~\b\3\2\2\2\177\u0080\7\60"+
		"\2\2\u0080\n\3\2\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7*\2\2\u0084\u0085\7+\2\2\u0085\f\3\2\2\2\u0086\u0087\7Q\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7h\2\2\u0089\u008a\7*\2\2\u008a\u008b\7+\2\2\u008b"+
		"\16\3\2\2\2\u008c\u008d\7T\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7f\2\2\u0090\u0091\7*\2\2\u0091\u0092\7+\2\2\u0092\20\3\2\2\2\u0093"+
		"\u0094\7Y\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7g\2\2\u0098\u0099\7*\2\2\u0099\u009a\7+\2\2\u009a\22\3\2"+
		"\2\2\u009b\u009c\7k\2\2\u009c\u009d\7u\2\2\u009d\u009e\7Q\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\7+\2\2\u00a1\24\3\2\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7h\2\2\u00a6"+
		"\u00a7\7h\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\7+\2\2\u00a9\26\3\2\2\2\u00aa"+
		"\u00ab\7D\2\2\u00ab\u00ac\7W\2\2\u00ac\u00ad\7V\2\2\u00ad\u00ae\7V\2\2"+
		"\u00ae\u00af\7Q\2\2\u00af\u00b0\7P\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7"+
		"N\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7F\2\2\u00b4\32\3\2\2\2\u00b5\u00b6"+
		"\7.\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7\177\2\2\u00ba \3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\"\3\2\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8&\3\2\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd(\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7q\2\2\u00d0*\3\2\2\2\u00d1"+
		"\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7n\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7q\2"+
		"\2\u00d9\u00da\7q\2\2\u00da\u00db\7r\2\2\u00db.\3\2\2\2\u00dc\u00dd\7"+
		"V\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7O\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1"+
		"\7U\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7p\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7j\2\2\u00f4"+
		"8\3\2\2\2\u00f5\u00f6\7o\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8<"+
		"\3\2\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7u\2\2\u00fb>\3\2\2\2\u00fc\u00fd"+
		"\7<\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7Q\2\2\u0100\u0101"+
		"\7V\2\2\u0101B\3\2\2\2\u0102\u0103\7/\2\2\u0103D\3\2\2\2\u0104\u0105\7"+
		"-\2\2\u0105F\3\2\2\2\u0106\u0107\7,\2\2\u0107H\3\2\2\2\u0108\u0109\7\61"+
		"\2\2\u0109J\3\2\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u010d"+
		"\7f\2\2\u010dL\3\2\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110N\3"+
		"\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7s\2\2\u0113\u0114\7w\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117P\3\2\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7q\2\2\u011a\u011b\7v\2\2\u011b\u011c\7\"\2"+
		"\2\u011c\u011d\7g\2\2\u011d\u011e\7s\2\2\u011e\u011f\7w\2\2\u011f\u0120"+
		"\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122R\3\2\2\2\u0123\u0124"+
		"\7>\2\2\u0124T\3\2\2\2\u0125\u0126\7@\2\2\u0126V\3\2\2\2\u0127\u0128\7"+
		">\2\2\u0128\u0129\7?\2\2\u0129X\3\2\2\2\u012a\u012b\7@\2\2\u012b\u012c"+
		"\7?\2\2\u012cZ\3\2\2\2\u012d\u012e\7$\2\2\u012e\\\3\2\2\2\u012f\u0130"+
		"\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132\7w\2\2\u0132\u0133\7g\2\2\u0133"+
		"^\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7c\2\2\u0136\u0137\7n\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139`\3\2\2\2\u013a\u013b\7]\2\2\u013b"+
		"b\3\2\2\2\u013c\u013d\7_\2\2\u013dd\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7w\2\2\u0140\u0141\7o\2\2\u0141\u0142\7d\2\2\u0142\u0143\7g\2\2\u0143"+
		"\u0144\7t\2\2\u0144f\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7n\2\2\u0149h\3\2\2\2\u014a\u014b\7x\2\2\u014b"+
		"\u014c\7q\2\2\u014c\u014d\7k\2\2\u014d\u014e\7f\2\2\u014ej\3\2\2\2\u014f"+
		"\u0150\7u\2\2\u0150\u0151\7v\2\2\u0151\u0152\7t\2\2\u0152\u0153\7k\2\2"+
		"\u0153\u0154\7p\2\2\u0154\u0155\7i\2\2\u0155l\3\2\2\2\u0156\u0157\7e\2"+
		"\2\u0157\u0158\7j\2\2\u0158\u0159\7c\2\2\u0159\u015a\7t\2\2\u015an\3\2"+
		"\2\2\u015b\u015f\t\2\2\2\u015c\u015e\t\3\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160p\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0162\u0163\t\4\2\2\u0163r\3\2\2\2\u0164\u0165\t"+
		"\5\2\2\u0165t\3\2\2\2\u0166\u0167\7=\2\2\u0167v\3\2\2\2\u0168\u016a\t"+
		"\6\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b<\2\2\u016ex\3\2\2\2\5"+
		"\2\u015f\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}