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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, DIGIT=13, WHITESPACE=14, TEXT=15, LETTER=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'actuator'", "'state'", "'=>'", "'<='", "'when'", "'init:'", 
		"'is'", "'and'", "':'", "'{'", "'}'", "'sensor'", "DIGIT", "WHITESPACE", 
		"TEXT", "LETTER"
	};
	public static final int
		RULE_dsl = 0, RULE_sensor = 1, RULE_actuator = 2, RULE_init = 3, RULE_action = 4, 
		RULE_condition = 5, RULE_transition = 6, RULE_state = 7;
	public static final String[] ruleNames = {
		"dsl", "sensor", "actuator", "init", "action", "condition", "transition", 
		"state"
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
		public List<SensorContext> sensor() {
			return getRuleContexts(SensorContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public ActuatorContext actuator(int i) {
			return getRuleContext(ActuatorContext.class,i);
		}
		public SensorContext sensor(int i) {
			return getRuleContext(SensorContext.class,i);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<ActuatorContext> actuator() {
			return getRuleContexts(ActuatorContext.class);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
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
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(18);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(16); actuator();
					}
					break;
				case T__0:
					{
					setState(17); sensor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==T__0 );
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22); init();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(27); state();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SensorContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public TerminalNode DIGIT() { return getToken(RuleSetGrammarParser.DIGIT, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSensor(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(T__0);
			setState(34); match(TEXT);
			setState(35); match(T__3);
			setState(36); match(DIGIT);
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

	public static class ActuatorContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public TerminalNode DIGIT() { return getToken(RuleSetGrammarParser.DIGIT, 0); }
		public ActuatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterActuator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitActuator(this);
		}
	}

	public final ActuatorContext actuator() throws RecognitionException {
		ActuatorContext _localctx = new ActuatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actuator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(T__11);
			setState(39); match(TEXT);
			setState(40); match(T__3);
			setState(41); match(DIGIT);
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
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
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
		enterRule(_localctx, 6, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__6);
			setState(44); match(TEXT);
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

	public static class ActionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RuleSetGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(RuleSetGrammarParser.TEXT, i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(TEXT);
			setState(47); match(T__8);
			setState(48); match(TEXT);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RuleSetGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(RuleSetGrammarParser.TEXT, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(TEXT);
			setState(51); match(T__5);
			setState(52); match(TEXT);
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(T__7);
			setState(55); condition();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(56); match(T__4);
				setState(57); condition();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(T__9);
			setState(64); match(TEXT);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(T__10);
			setState(67); match(TEXT);
			setState(68); match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(69); action();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); transition();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(80); match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\2\6\2\32\n\2\r\2\16\2\33\3\2\7\2\37\n\2\f\2\16\2\"\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\7\tI\n\t\f\t\16\tL\13\t\3\t\6\tO\n\t\r\t\16\tP\3\t\3\t\3"+
		"\t\2\2\n\2\4\6\b\n\f\16\20\2\2S\2\24\3\2\2\2\4#\3\2\2\2\6(\3\2\2\2\b-"+
		"\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2\2\168\3\2\2\2\20D\3\2\2\2\22\25\5\6\4"+
		"\2\23\25\5\4\3\2\24\22\3\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2"+
		"\2\26\27\3\2\2\2\27\31\3\2\2\2\30\32\5\b\5\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34 \3\2\2\2\35\37\5\20\t\2\36\35\3\2\2"+
		"\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#$\7\16\2\2"+
		"$%\7\21\2\2%&\7\13\2\2&\'\7\17\2\2\'\5\3\2\2\2()\7\3\2\2)*\7\21\2\2*+"+
		"\7\13\2\2+,\7\17\2\2,\7\3\2\2\2-.\7\b\2\2./\7\21\2\2/\t\3\2\2\2\60\61"+
		"\7\21\2\2\61\62\7\6\2\2\62\63\7\21\2\2\63\13\3\2\2\2\64\65\7\21\2\2\65"+
		"\66\7\t\2\2\66\67\7\21\2\2\67\r\3\2\2\289\7\7\2\29>\5\f\7\2:;\7\n\2\2"+
		";=\5\f\7\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AB\7\5\2\2BC\7\21\2\2C\17\3\2\2\2DE\7\4\2\2EF\7\21\2\2FJ\7\f\2\2GI\5\n"+
		"\6\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\5\16"+
		"\b\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\r\2\2S\21\3"+
		"\2\2\2\t\24\26\33 >JP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}