// Generated from Openhab.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpenhabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SingleRule=1, Rule=2, When=3, Then=4, End=5, NormalLiteral=6, RuleLiteral=7, 
		WS=8, NEWLINE=9, CR=10, LF=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SingleRule", "Rule", "When", "Then", "End", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "Underscores", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "NormalLiteral", 
		"RuleLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "ZeroToThree", "UnicodeEscape", "WS", "NEWLINE", "CR", 
		"LF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'rule '", "'when'", "'then'", "'end'", null, null, null, 
		null, "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SingleRule", "Rule", "When", "Then", "End", "NormalLiteral", "RuleLiteral", 
		"WS", "NEWLINE", "CR", "LF"
	};
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


	public OpenhabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Openhab.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00c1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\6\2>\n\2\r\2\16\2?\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\6\b[\n\b\r\b\16\b\\\3\t\3\t\5\ta\n\t\3\n\6\n"+
		"d\n\n\r\n\16\ne\3\13\3\13\5\13j\n\13\3\13\3\13\3\f\3\f\5\fp\n\f\3\f\5"+
		"\fs\n\f\3\r\3\r\3\16\6\16x\n\16\r\16\16\16y\3\17\3\17\5\17~\n\17\3\20"+
		"\5\20\u0081\n\20\3\21\3\21\5\21\u0085\n\21\3\21\3\21\3\22\6\22\u008a\n"+
		"\22\r\22\16\22\u008b\3\23\3\23\5\23\u0090\n\23\3\24\3\24\3\24\3\24\5\24"+
		"\u0096\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00a3\n\25\3\26\3\26\3\27\3\27\6\27\u00a9\n\27\r\27\16\27\u00aa\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\6\30\u00b3\n\30\r\30\16\30\u00b4\3\30\3\30\3"+
		"\31\5\31\u00ba\n\31\3\31\3\31\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t"+
		"\6\13\7\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\b!\t#\2%\2\'\2"+
		")\2+\2-\2/\n\61\13\63\f\65\r\3\2\b\5\2\62;CHch\3\2\629\6\2\f\f\17\17$"+
		"$^^\n\2$$))^^ddhhppttvv\3\2\62\65\5\2\13\f\16\17\"\"\2\u00c5\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\5C\3\2\2\2\7I\3\2\2\2\tN\3\2\2\2\13S\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21"+
		"`\3\2\2\2\23c\3\2\2\2\25g\3\2\2\2\27m\3\2\2\2\31t\3\2\2\2\33w\3\2\2\2"+
		"\35}\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0089\3\2\2\2%\u008f\3\2"+
		"\2\2\'\u0095\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2/\u00b2"+
		"\3\2\2\2\61\u00b9\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\678\5\5\3"+
		"\289\5!\21\29:\5\7\4\2:;\5\37\20\2;=\5\t\5\2<>\5\37\20\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\13\6\2B\4\3\2\2\2CD\7t\2\2DE"+
		"\7w\2\2EF\7n\2\2FG\7g\2\2GH\7\"\2\2H\6\3\2\2\2IJ\7y\2\2JK\7j\2\2KL\7g"+
		"\2\2LM\7p\2\2M\b\3\2\2\2NO\7v\2\2OP\7j\2\2PQ\7g\2\2QR\7p\2\2R\n\3\2\2"+
		"\2ST\7g\2\2TU\7p\2\2UV\7f\2\2V\f\3\2\2\2WX\t\2\2\2X\16\3\2\2\2Y[\5\21"+
		"\t\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\20\3\2\2\2^a\5\r\7\2"+
		"_a\7a\2\2`^\3\2\2\2`_\3\2\2\2a\22\3\2\2\2bd\7a\2\2cb\3\2\2\2de\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2f\24\3\2\2\2gi\7\62\2\2hj\5\23\n\2ih\3\2\2\2ij\3\2"+
		"\2\2jk\3\2\2\2kl\5\27\f\2l\26\3\2\2\2mr\5\31\r\2np\5\33\16\2on\3\2\2\2"+
		"op\3\2\2\2pq\3\2\2\2qs\5\31\r\2ro\3\2\2\2rs\3\2\2\2s\30\3\2\2\2tu\t\3"+
		"\2\2u\32\3\2\2\2vx\5\35\17\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z"+
		"\34\3\2\2\2{~\5\31\r\2|~\7a\2\2}{\3\2\2\2}|\3\2\2\2~\36\3\2\2\2\177\u0081"+
		"\5#\22\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081 \3\2\2\2\u0082\u0084"+
		"\7$\2\2\u0083\u0085\5#\22\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7$\2\2\u0087\"\3\2\2\2\u0088\u008a\5%\23\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c$\3\2\2\2\u008d\u0090\n\4\2\2\u008e\u0090\5\'\24\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090&\3\2\2\2\u0091\u0092\7^\2\2\u0092"+
		"\u0096\t\5\2\2\u0093\u0096\5)\25\2\u0094\u0096\5-\27\2\u0095\u0091\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096(\3\2\2\2\u0097\u0098"+
		"\7^\2\2\u0098\u00a3\5\31\r\2\u0099\u009a\7^\2\2\u009a\u009b\5\31\r\2\u009b"+
		"\u009c\5\31\r\2\u009c\u00a3\3\2\2\2\u009d\u009e\7^\2\2\u009e\u009f\5+"+
		"\26\2\u009f\u00a0\5\31\r\2\u00a0\u00a1\5\31\r\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u0097\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3*\3\2\2\2"+
		"\u00a4\u00a5\t\6\2\2\u00a5,\3\2\2\2\u00a6\u00a8\7^\2\2\u00a7\u00a9\7w"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\r\7\2\u00ad\u00ae\5\r"+
		"\7\2\u00ae\u00af\5\r\7\2\u00af\u00b0\5\r\7\2\u00b0.\3\2\2\2\u00b1\u00b3"+
		"\t\7\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\30\2\2\u00b7\60\3\2\2"+
		"\2\u00b8\u00ba\5\63\32\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\5\65\33\2\u00bc\62\3\2\2\2\u00bd\u00be\7\17"+
		"\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\66\3\2\2\2\25\2?\\`ei"+
		"ory}\u0080\u0084\u008b\u008f\u0095\u00a2\u00aa\u00b4\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}