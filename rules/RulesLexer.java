// Generated from Rules.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ML_COMMENT=5, SL_COMMENT=6, IDENTIFIER=7, 
		BOOLEAN=8, NUMBER=9, STRING=10, NEWLINE=11, CR=12, LF=13, WHITESPACE=14, 
		ANY_OTHER=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ML_COMMENT", "SL_COMMENT", "IDENTIFIER", 
		"BOOLEAN", "NUMBER", "STRING", "NEWLINE", "CR", "LF", "WHITESPACE", "ANY_OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'rule'", "'when'", "'then'", "'end'", null, null, null, null, null, 
		null, null, "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ML_COMMENT", "SL_COMMENT", "IDENTIFIER", 
		"BOOLEAN", "NUMBER", "STRING", "NEWLINE", "CR", "LF", "WHITESPACE", "ANY_OTHER"
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


	public RulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7D\n\7\3\7\3"+
		"\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3\b\5\bV\n"+
		"\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\th\n\t\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\3\13\7\13s\n\13\f\13\16"+
		"\13v\13\13\3\13\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13"+
		"\3\13\5\13\u0083\n\13\3\f\5\f\u0086\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\4:K\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21\3\2\b\6\2\62;C\\aac|\7\2//\62;C\\aac|\n"+
		"\2$$))^^ddhhppttvw\4\2$$^^\4\2))^^\5\2\13\13\16\16\"\"\2\u009e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5&\3\2\2\2\7+\3"+
		"\2\2\2\t\60\3\2\2\2\13\64\3\2\2\2\rC\3\2\2\2\17U\3\2\2\2\21g\3\2\2\2\23"+
		"i\3\2\2\2\25\u0082\3\2\2\2\27\u0085\3\2\2\2\31\u0089\3\2\2\2\33\u008b"+
		"\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\"\7t\2\2\"#\7w\2\2#$\7n\2"+
		"\2$%\7g\2\2%\4\3\2\2\2&\'\7y\2\2\'(\7j\2\2()\7g\2\2)*\7p\2\2*\6\3\2\2"+
		"\2+,\7v\2\2,-\7j\2\2-.\7g\2\2./\7p\2\2/\b\3\2\2\2\60\61\7g\2\2\61\62\7"+
		"p\2\2\62\63\7f\2\2\63\n\3\2\2\2\64\65\7\61\2\2\65\66\7,\2\2\66:\3\2\2"+
		"\2\679\13\2\2\28\67\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<:"+
		"\3\2\2\2=>\7,\2\2>?\7\61\2\2?@\3\2\2\2@A\b\6\2\2A\f\3\2\2\2BD\5\35\17"+
		"\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3\2\2\2HJ\13"+
		"\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LP\3\2\2\2MK\3\2\2\2NQ\5"+
		"\27\f\2OQ\7\2\2\3PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\b\7\2\2S\16\3\2\2\2"+
		"TV\7`\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\t\2\2\2XZ\t\3\2\2YX\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\20\3\2\2\2][\3\2\2\2^_\7v\2\2_`\7t\2"+
		"\2`a\7w\2\2ah\7g\2\2bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7u\2\2fh\7g\2\2g^\3"+
		"\2\2\2gb\3\2\2\2h\22\3\2\2\2il\5\17\b\2jk\7\60\2\2km\5\17\b\2lj\3\2\2"+
		"\2lm\3\2\2\2m\24\3\2\2\2nt\7$\2\2op\7^\2\2ps\t\4\2\2qs\n\5\2\2ro\3\2\2"+
		"\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w\u0083"+
		"\7$\2\2x~\7)\2\2yz\7^\2\2z}\t\4\2\2{}\n\6\2\2|y\3\2\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0083\7)\2\2\u0082n\3\2\2\2\u0082x\3\2\2\2\u0083\26\3\2\2\2\u0084\u0086"+
		"\5\31\r\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0088\5\33\16\2\u0088\30\3\2\2\2\u0089\u008a\7\17\2\2\u008a\32"+
		"\3\2\2\2\u008b\u008c\7\f\2\2\u008c\34\3\2\2\2\u008d\u008e\t\7\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\13\2\2\2\u0090 \3\2\2\2\21\2:CKPU[glrt|~\u0082"+
		"\u0085\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}