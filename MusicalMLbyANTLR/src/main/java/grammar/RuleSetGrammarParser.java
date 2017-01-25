package grammar;
// Generated from RuleSetGrammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, SYMBOL=12, NOTE=13, COLOR=14, NOTE_NAME=15, TEXT=16, 
		DIGIT=17, LETTER=18, WHITESPACE=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'- '", "'speaker '", "' '", "'screen '", "'score'", "'color '", 
		"'+'", "'{'", "'}'", "'-'", "'.'", "SYMBOL", "NOTE", "COLOR", "NOTE_NAME", 
		"TEXT", "DIGIT", "LETTER", "WHITESPACE"
	};
	public static final int
		RULE_dsl = 0, RULE_init = 1, RULE_macro_def = 2, RULE_note = 3, RULE_score = 4;
	public static final String[] ruleNames = {
		"dsl", "init", "macro_def", "note", "score"
	};

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleSetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DslContext extends ParserRuleContext {
		public List<Macro_defContext> macro_def() {
			return getRuleContexts(Macro_defContext.class);
		}
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Macro_defContext macro_def(int i) {
			return getRuleContext(Macro_defContext.class,i);
		}
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitDsl(this);
		}
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); init();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(11); macro_def();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17); match(T__6);
			setState(18); score();
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(RuleSetGrammarParser.COLOR, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(RuleSetGrammarParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(RuleSetGrammarParser.DIGIT); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(T__5);
			setState(21); match(COLOR);
			setState(22); match(T__9);
			setState(23); match(DIGIT);
			setState(24); match(T__7);
			setState(25); match(DIGIT);
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

	public static class Macro_defContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public Macro_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterMacro_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitMacro_def(this);
		}
	}

	public final Macro_defContext macro_def() throws RecognitionException {
		Macro_defContext _localctx = new Macro_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_macro_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(T__1);
			setState(28); match(TEXT);
			setState(29); match(T__10);
			setState(30); match(T__3);
			setState(32);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(31); match(T__8);
				}
			}

			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); note();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SYMBOL || _la==NOTE );
			setState(39); match(T__2);
			setState(41);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(40); match(T__8);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(RuleSetGrammarParser.NOTE, 0); }
		public TerminalNode DIGIT() { return getToken(RuleSetGrammarParser.DIGIT, 0); }
		public TerminalNode SYMBOL() { return getToken(RuleSetGrammarParser.SYMBOL, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if (_la==SYMBOL) {
				{
				setState(43); match(SYMBOL);
				}
			}

			setState(46); match(NOTE);
			setState(48);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(47); match(DIGIT);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(57);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(56); match(T__0);
				}
			}

			setState(60);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(59); match(T__8);
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

	public static class ScoreContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RuleSetGrammarParser.TEXT); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public List<Macro_defContext> macro_def() {
			return getRuleContexts(Macro_defContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public Macro_defContext macro_def(int i) {
			return getRuleContext(Macro_defContext.class,i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(RuleSetGrammarParser.TEXT, i);
		}
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitScore(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_score);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(67);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(62); note();
					}
					break;

				case 2:
					{
					setState(63); match(T__1);
					setState(64); match(TEXT);
					setState(65);
					_la = _input.LA(1);
					if ( !(_la==T__10 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;

				case 3:
					{
					setState(66); macro_def();
					}
					break;
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SYMBOL) | (1L << NOTE))) != 0) );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\4\6\4"+
		"&\n\4\r\4\16\4\'\3\4\3\4\5\4,\n\4\3\5\5\5/\n\5\3\5\3\5\5\5\63\n\5\3\5"+
		"\7\5\66\n\5\f\5\16\59\13\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\6\6F\n\6\r\6\16\6G\3\6\2\2\7\2\4\6\b\n\2\4\4\2\t\t\f\f\4\2\3\3\f\f"+
		"P\2\f\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b.\3\2\2\2\nE\3\2\2\2\f\20\5\4"+
		"\3\2\r\17\5\6\4\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2"+
		"\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\7\2\2\24\25\5\n\6\2\25\3\3\2\2"+
		"\2\26\27\7\b\2\2\27\30\7\20\2\2\30\31\7\4\2\2\31\32\7\23\2\2\32\33\7\6"+
		"\2\2\33\34\7\23\2\2\34\5\3\2\2\2\35\36\7\f\2\2\36\37\7\22\2\2\37 \7\3"+
		"\2\2 \"\7\n\2\2!#\7\5\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\5\b\5\2%$"+
		"\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\7\13\2\2*,\7\5\2"+
		"\2+*\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-/\7\16\2\2.-\3\2\2\2./\3\2\2\2/\60\3"+
		"\2\2\2\60\62\7\17\2\2\61\63\7\23\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\67"+
		"\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\2:<\7\r\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\7"+
		"\5\2\2>=\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@F\5\b\5\2AB\7\f\2\2BC\7\22\2\2C"+
		"F\t\3\2\2DF\5\6\4\2E@\3\2\2\2EA\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2H\13\3\2\2\2\r\20\"\'+.\62\67;>EG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}