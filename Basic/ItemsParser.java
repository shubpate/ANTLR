// Generated from Items.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ItemsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ML_COMMENT=37, SL_COMMENT=38, 
		IDENTIFIER=39, BOOLEAN=40, NUMBER=41, STRING=42, NEWLINE=43, CR=44, LF=45, 
		WHITESPACE=46, ANY_OTHER=47;
	public static final int
		RULE_itemmodel = 0, RULE_modelitem = 1, RULE_modelgroupitem = 2, RULE_basemodelitem = 3, 
		RULE_modelgroupfunction = 4, RULE_modelbinding = 5, RULE_modelproperty = 6, 
		RULE_valuetype = 7;
	public static final String[] ruleNames = {
		"itemmodel", "modelitem", "modelgroupitem", "basemodelitem", "modelgroupfunction", 
		"modelbinding", "modelproperty", "valuetype"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", "'Group'", 
		"':'", "'Switch'", "'Rollershutter'", "'String'", "'Dimmer'", "'Contact'", 
		"'DateTime'", "'Color'", "'Player'", "'Location'", "'Call'", "'Image'", 
		"'Number'", "'EQUAL'", "'AND'", "'OR'", "'NAND'", "'NOR'", "'AVG'", "'SUM'", 
		"'MAX'", "'MIN'", "'COUNT'", "'LATEST'", "'EARLIEST'", "'='", null, null, 
		null, null, null, null, null, "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ML_COMMENT", "SL_COMMENT", "IDENTIFIER", "BOOLEAN", "NUMBER", "STRING", 
		"NEWLINE", "CR", "LF", "WHITESPACE", "ANY_OTHER"
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
	public String getGrammarFileName() { return "Items.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ItemsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ItemmodelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ItemsParser.EOF, 0); }
		public List<ModelitemContext> modelitem() {
			return getRuleContexts(ModelitemContext.class);
		}
		public ModelitemContext modelitem(int i) {
			return getRuleContext(ModelitemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ItemsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ItemsParser.NEWLINE, i);
		}
		public ItemmodelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemmodel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterItemmodel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitItemmodel(this);
		}
	}

	public final ItemmodelContext itemmodel() throws RecognitionException {
		ItemmodelContext _localctx = new ItemmodelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_itemmodel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(16);
				match(NEWLINE);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(22);
			modelitem();
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE))) != 0)) {
				{
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(23);
					match(NEWLINE);
					}
					break;
				case T__9:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(24);
					modelitem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(30);
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

	public static class ModelitemContext extends ParserRuleContext {
		public BasemodelitemContext basemodelitem() {
			return getRuleContext(BasemodelitemContext.class,0);
		}
		public ModelgroupitemContext modelgroupitem() {
			return getRuleContext(ModelgroupitemContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ItemsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ItemsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ItemsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ItemsParser.STRING, i);
		}
		public List<ModelbindingContext> modelbinding() {
			return getRuleContexts(ModelbindingContext.class);
		}
		public ModelbindingContext modelbinding(int i) {
			return getRuleContext(ModelbindingContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ItemsParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ItemsParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ItemsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ItemsParser.NEWLINE, i);
		}
		public ModelitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterModelitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitModelitem(this);
		}
	}

	public final ModelitemContext modelitem() throws RecognitionException {
		ModelitemContext _localctx = new ModelitemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelitem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(32);
				basemodelitem();
				}
				break;
			case T__9:
				{
				setState(33);
				modelgroupitem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE || _la==WHITESPACE );
			setState(41);
			match(IDENTIFIER);
			}
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE || _la==WHITESPACE );
				setState(48);
				match(STRING);
				}
				break;
			}
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE || _la==WHITESPACE );
				setState(56);
				match(T__0);
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				match(T__1);
				}
				break;
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE || _la==WHITESPACE );
				setState(66);
				match(T__2);
				setState(67);
				match(IDENTIFIER);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(68);
					match(T__3);
					setState(69);
					match(IDENTIFIER);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__4);
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE || _la==WHITESPACE );
				setState(83);
				match(T__5);
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(85);
					match(T__3);
					setState(86);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__6);
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE || _la==WHITESPACE );
				setState(100);
				match(T__7);
				setState(101);
				modelbinding();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(102);
					match(T__3);
					setState(103);
					modelbinding();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__8);
				}
				break;
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

	public static class ModelgroupitemContext extends ParserRuleContext {
		public BasemodelitemContext basemodelitem() {
			return getRuleContext(BasemodelitemContext.class,0);
		}
		public ModelgroupfunctionContext modelgroupfunction() {
			return getRuleContext(ModelgroupfunctionContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ItemsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ItemsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ItemsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ItemsParser.STRING, i);
		}
		public ModelgroupitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelgroupitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterModelgroupitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitModelgroupitem(this);
		}
	}

	public final ModelgroupitemContext modelgroupitem() throws RecognitionException {
		ModelgroupitemContext _localctx = new ModelgroupitemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelgroupitem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__9);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(114);
				match(T__10);
				setState(115);
				basemodelitem();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(116);
					match(T__10);
					setState(117);
					modelgroupfunction();
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(118);
						match(T__2);
						setState(119);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(120);
							match(T__3);
							setState(121);
							_la = _input.LA(1);
							if ( !(_la==IDENTIFIER || _la==STRING) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(126);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(127);
						match(T__4);
						}
					}

					}
				}

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

	public static class BasemodelitemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItemsParser.IDENTIFIER, 0); }
		public BasemodelitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basemodelitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterBasemodelitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitBasemodelitem(this);
		}
	}

	public final BasemodelitemContext basemodelitem() throws RecognitionException {
		BasemodelitemContext _localctx = new BasemodelitemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basemodelitem);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(145);
				match(T__22);
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(146);
					match(T__10);
					setState(147);
					match(IDENTIFIER);
					}
					break;
				}
				}
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

	public static class ModelgroupfunctionContext extends ParserRuleContext {
		public List<ValuetypeContext> valuetype() {
			return getRuleContexts(ValuetypeContext.class);
		}
		public ValuetypeContext valuetype(int i) {
			return getRuleContext(ValuetypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ItemsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ItemsParser.IDENTIFIER, i);
		}
		public ModelgroupfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelgroupfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterModelgroupfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitModelgroupfunction(this);
		}
	}

	public final ModelgroupfunctionContext modelgroupfunction() throws RecognitionException {
		ModelgroupfunctionContext _localctx = new ModelgroupfunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modelgroupfunction);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__24);
				setState(154);
				match(T__2);
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(155);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(156);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				match(T__3);
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(160);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(161);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164);
				match(T__4);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(T__25);
				setState(166);
				match(T__2);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(167);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(168);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				match(T__3);
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(172);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(173);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176);
				match(T__4);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__26);
				setState(178);
				match(T__2);
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(179);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(180);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183);
				match(T__3);
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(184);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(185);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188);
				match(T__4);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__27);
				setState(190);
				match(T__2);
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(191);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(192);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				match(T__3);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case STRING:
					{
					setState(196);
					valuetype();
					}
					break;
				case IDENTIFIER:
					{
					setState(197);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				match(T__4);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 12);
				{
				setState(207);
				match(T__34);
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

	public static class ModelbindingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItemsParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(ItemsParser.STRING, 0); }
		public List<ModelpropertyContext> modelproperty() {
			return getRuleContexts(ModelpropertyContext.class);
		}
		public ModelpropertyContext modelproperty(int i) {
			return getRuleContext(ModelpropertyContext.class,i);
		}
		public ModelbindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelbinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterModelbinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitModelbinding(this);
		}
	}

	public final ModelbindingContext modelbinding() throws RecognitionException {
		ModelbindingContext _localctx = new ModelbindingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelbinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENTIFIER);
			setState(211);
			match(T__35);
			setState(212);
			match(STRING);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(213);
				match(T__5);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(214);
					modelproperty();
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(217);
					match(T__3);
					setState(218);
					modelproperty();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(T__6);
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

	public static class ModelpropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItemsParser.IDENTIFIER, 0); }
		public ValuetypeContext valuetype() {
			return getRuleContext(ValuetypeContext.class,0);
		}
		public ModelpropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelproperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterModelproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitModelproperty(this);
		}
	}

	public final ModelpropertyContext modelproperty() throws RecognitionException {
		ModelpropertyContext _localctx = new ModelpropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modelproperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTIFIER);
			setState(228);
			match(T__35);
			setState(229);
			valuetype();
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

	public static class ValuetypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ItemsParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ItemsParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(ItemsParser.BOOLEAN, 0); }
		public ValuetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).enterValuetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItemsListener ) ((ItemsListener)listener).exitValuetype(this);
		}
	}

	public final ValuetypeContext valuetype() throws RecognitionException {
		ValuetypeContext _localctx = new ValuetypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valuetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00ec\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3"+
		"\3\3\3\5\3%\n\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60"+
		"\3\3\5\3\64\n\3\3\3\6\3\67\n\3\r\3\16\38\3\3\3\3\3\3\5\3>\n\3\3\3\6\3"+
		"A\n\3\r\3\16\3B\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\5\3O\n\3\3"+
		"\3\6\3R\n\3\r\3\16\3S\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\5\3"+
		"`\n\3\3\3\6\3c\n\3\r\3\16\3d\3\3\3\3\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3"+
		"\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4"+
		"\u0080\13\4\3\4\5\4\u0083\n\4\5\4\u0085\n\4\5\4\u0087\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0097\n\5\5\5\u0099\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\3\6\5\6\u00a5\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00b8\n\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c4"+
		"\n\6\3\6\3\6\3\6\5\6\u00c9\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\7\7\u00de\n\7\f\7\16\7"+
		"\u00e1\13\7\3\7\5\7\u00e4\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6"+
		"\b\n\f\16\20\2\5\4\2--\60\60\4\2)),,\3\2*,\2\u011b\2\25\3\2\2\2\4$\3\2"+
		"\2\2\6s\3\2\2\2\b\u0098\3\2\2\2\n\u00d2\3\2\2\2\f\u00d4\3\2\2\2\16\u00e5"+
		"\3\2\2\2\20\u00e9\3\2\2\2\22\24\7-\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\35\5\4\3\2\31"+
		"\34\7-\2\2\32\34\5\4\3\2\33\31\3\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2"+
		"\2\"%\5\b\5\2#%\5\6\4\2$\"\3\2\2\2$#\3\2\2\2%\'\3\2\2\2&(\t\2\2\2\'&\3"+
		"\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7)\2\2,\63\3\2\2\2-"+
		"/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2"+
		"\2\62\64\7,\2\2\63.\3\2\2\2\63\64\3\2\2\2\64=\3\2\2\2\65\67\t\2\2\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\3\2\2;<\t"+
		"\3\2\2<>\7\4\2\2=\66\3\2\2\2=>\3\2\2\2>N\3\2\2\2?A\t\2\2\2@?\3\2\2\2A"+
		"B\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\5\2\2EJ\7)\2\2FG\7\6\2\2G"+
		"I\7)\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2M"+
		"O\7\7\2\2N@\3\2\2\2NO\3\2\2\2O_\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\b\2\2V[\t\3\2\2WX\7\6\2\2XZ\t\3\2\2"+
		"YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^`\7\t\2"+
		"\2_Q\3\2\2\2_`\3\2\2\2`q\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fg\7\n\2\2gl\5\f\7\2hi\7\6\2\2ik\5\f\7\2jh\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\13\2\2pr\3\2"+
		"\2\2qb\3\2\2\2qr\3\2\2\2r\5\3\2\2\2s\u0086\7\f\2\2tu\7\r\2\2u\u0084\5"+
		"\b\5\2vw\7\r\2\2w\u0082\5\n\6\2xy\7\5\2\2y~\t\3\2\2z{\7\6\2\2{}\t\3\2"+
		"\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0083\7\7\2\2\u0082x\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084v\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2"+
		"\u0086t\3\2\2\2\u0086\u0087\3\2\2\2\u0087\7\3\2\2\2\u0088\u0099\7\16\2"+
		"\2\u0089\u0099\7\17\2\2\u008a\u0099\7\20\2\2\u008b\u0099\7\21\2\2\u008c"+
		"\u0099\7\22\2\2\u008d\u0099\7\23\2\2\u008e\u0099\7\24\2\2\u008f\u0099"+
		"\7\25\2\2\u0090\u0099\7\26\2\2\u0091\u0099\7\27\2\2\u0092\u0099\7\30\2"+
		"\2\u0093\u0096\7\31\2\2\u0094\u0095\7\r\2\2\u0095\u0097\7)\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0088\3\2\2\2\u0098"+
		"\u0089\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008b\3\2\2\2\u0098\u008c\3\2"+
		"\2\2\u0098\u008d\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2"+
		"\2\2\u0099\t\3\2\2\2\u009a\u00d3\7\32\2\2\u009b\u009c\7\33\2\2\u009c\u009f"+
		"\7\5\2\2\u009d\u00a0\5\20\t\2\u009e\u00a0\7)\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\7\6\2\2\u00a2\u00a5\5\20"+
		"\t\2\u00a3\u00a5\7)\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00d3\7\7\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00ab\7"+
		"\5\2\2\u00a9\u00ac\5\20\t\2\u00aa\u00ac\7)\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\7\6\2\2\u00ae\u00b1\5\20"+
		"\t\2\u00af\u00b1\7)\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00d3\7\7\2\2\u00b3\u00b4\7\35\2\2\u00b4\u00b7\7"+
		"\5\2\2\u00b5\u00b8\5\20\t\2\u00b6\u00b8\7)\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\7\6\2\2\u00ba\u00bd\5\20"+
		"\t\2\u00bb\u00bd\7)\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00d3\7\7\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c3\7"+
		"\5\2\2\u00c1\u00c4\5\20\t\2\u00c2\u00c4\7)\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7\6\2\2\u00c6\u00c9\5\20"+
		"\t\2\u00c7\u00c9\7)\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d3\7\7\2\2\u00cb\u00d3\7\37\2\2\u00cc\u00d3\7"+
		" \2\2\u00cd\u00d3\7!\2\2\u00ce\u00d3\7\"\2\2\u00cf\u00d3\7#\2\2\u00d0"+
		"\u00d3\7$\2\2\u00d1\u00d3\7%\2\2\u00d2\u009a\3\2\2\2\u00d2\u009b\3\2\2"+
		"\2\u00d2\u00a7\3\2\2\2\u00d2\u00b3\3\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00cb"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\13\3\2\2"+
		"\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\7&\2\2\u00d6\u00e3\7,\2\2\u00d7\u00d9"+
		"\7\b\2\2\u00d8\u00da\5\16\b\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00df\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\u00de\5\16\b\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\t\2\2\u00e3\u00d7\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\r\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7"+
		"\7&\2\2\u00e7\u00e8\5\20\t\2\u00e8\17\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea"+
		"\21\3\2\2\2&\25\33\35$)\60\638=BJNS[_dlq~\u0082\u0084\u0086\u0096\u0098"+
		"\u009f\u00a4\u00ab\u00b0\u00b7\u00bc\u00c3\u00c8\u00d2\u00d9\u00df\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}