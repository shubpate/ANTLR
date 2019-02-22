// Generated from Openhab.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpenhabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SingleRule=1, Rule=2, When=3, Then=4, End=5, NormalLiteral=6, RuleLiteral=7, 
		WS=8, NEWLINE=9, CR=10, LF=11;
	public static final int
		RULE_start = 0;
	public static final String[] ruleNames = {
		"start"
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

	@Override
	public String getGrammarFileName() { return "Openhab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpenhabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OpenhabParser.EOF, 0); }
		public List<TerminalNode> SingleRule() { return getTokens(OpenhabParser.SingleRule); }
		public TerminalNode SingleRule(int i) {
			return getToken(OpenhabParser.SingleRule, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(OpenhabParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenhabParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenhabListener ) ((OpenhabListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenhabListener ) ((OpenhabListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(2);
				match(NEWLINE);
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(8);
			match(SingleRule);
			}
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SingleRule || _la==NEWLINE) {
				{
				{
				setState(9);
				_la = _input.LA(1);
				if ( !(_la==SingleRule || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(15);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\24\4\2\t\2\3\2"+
		"\7\2\6\n\2\f\2\16\2\t\13\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2"+
		"\3\2\2\2\3\2\2\3\4\2\3\3\13\13\2\24\2\7\3\2\2\2\4\6\7\13\2\2\5\4\3\2\2"+
		"\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\n\3\2\2\2\t\7\3\2\2\2\n\16\7"+
		"\3\2\2\13\r\t\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\4\7\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}