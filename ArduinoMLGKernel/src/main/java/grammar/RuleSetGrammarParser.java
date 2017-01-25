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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, DIGIT=21, WHITESPACE=22, TEXT=23, 
		LETTER=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'speaker'", "'actuator'", "'state'", "'hz'", "'Hz'", "'init:'", 
		"'elapsed'", "'serialprint'", "':'", "'{'", "'}'", "'sensor'", "'for'", 
		"'=>'", "'tone'", "'<='", "'when'", "'ms'", "'is'", "'and'", "DIGIT", 
		"WHITESPACE", "TEXT", "LETTER"
	};
	public static final int
		RULE_dsl = 0, RULE_sensor = 1, RULE_actuator = 2, RULE_speaker = 3, RULE_serial = 4, 
		RULE_init = 5, RULE_action = 6, RULE_logicalAction = 7, RULE_tone = 8, 
		RULE_serialPrint = 9, RULE_condition = 10, RULE_timeCondition = 11, RULE_logicalCondition = 12, 
		RULE_transition = 13, RULE_state = 14;
	public static final String[] ruleNames = {
		"dsl", "sensor", "actuator", "speaker", "serial", "init", "action", "logicalAction", 
		"tone", "serialPrint", "condition", "timeCondition", "logicalCondition", 
		"transition", "state"
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
		public SpeakerContext speaker(int i) {
			return getRuleContext(SpeakerContext.class,i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public List<SpeakerContext> speaker() {
			return getRuleContexts(SpeakerContext.class);
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(30); actuator();
					}
					break;
				case T__8:
					{
					setState(31); sensor();
					}
					break;
				case T__19:
					{
					setState(32); speaker();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__8))) != 0) );
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37); init();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(42); state();
				}
				}
				setState(47);
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
			setState(48); match(T__8);
			setState(49); match(TEXT);
			setState(50); match(T__11);
			setState(51); match(DIGIT);
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
			setState(53); match(T__18);
			setState(54); match(TEXT);
			setState(55); match(T__11);
			setState(56); match(DIGIT);
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

	public static class SpeakerContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public TerminalNode DIGIT() { return getToken(RuleSetGrammarParser.DIGIT, 0); }
		public SpeakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSpeaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSpeaker(this);
		}
	}

	public final SpeakerContext speaker() throws RecognitionException {
		SpeakerContext _localctx = new SpeakerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_speaker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(T__19);
			setState(59); match(TEXT);
			setState(60); match(T__11);
			setState(61); match(DIGIT);
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

	public static class SerialContext extends ParserRuleContext {
		public SerialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSerial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSerial(this);
		}
	}

	public final SerialContext serial() throws RecognitionException {
		SerialContext _localctx = new SerialContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_serial);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(T__14);
			setState(66); match(TEXT);
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
		public SerialPrintContext serialPrint() {
			return getRuleContext(SerialPrintContext.class,0);
		}
		public ToneContext tone() {
			return getRuleContext(ToneContext.class,0);
		}
		public LogicalActionContext logicalAction() {
			return getRuleContext(LogicalActionContext.class,0);
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
		enterRule(_localctx, 12, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(68); logicalAction();
				}
				break;
			case T__5:
				{
				setState(69); tone();
				}
				break;
			case T__12:
				{
				setState(70); serialPrint();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LogicalActionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RuleSetGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(RuleSetGrammarParser.TEXT, i);
		}
		public LogicalActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalAction(this);
		}
	}

	public final LogicalActionContext logicalAction() throws RecognitionException {
		LogicalActionContext _localctx = new LogicalActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(TEXT);
			setState(74); match(T__4);
			setState(75); match(TEXT);
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

	public static class ToneContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(RuleSetGrammarParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(RuleSetGrammarParser.DIGIT); }
		public ToneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterTone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitTone(this);
		}
	}

	public final ToneContext tone() throws RecognitionException {
		ToneContext _localctx = new ToneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__5);
			setState(78); match(TEXT);
			setState(79); match(T__4);
			setState(80); match(DIGIT);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(82); match(T__7);
			setState(83); match(DIGIT);
			setState(84); match(T__2);
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

	public static class SerialPrintContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleSetGrammarParser.TEXT, 0); }
		public SerialPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serialPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSerialPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSerialPrint(this);
		}
	}

	public final SerialPrintContext serialPrint() throws RecognitionException {
		SerialPrintContext _localctx = new SerialPrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_serialPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__12);
			setState(87); match(TEXT);
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
		public TimeConditionContext timeCondition() {
			return getRuleContext(TimeConditionContext.class,0);
		}
		public LogicalConditionContext logicalCondition() {
			return getRuleContext(LogicalConditionContext.class,0);
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(89); timeCondition();
				}
				break;
			case TEXT:
				{
				setState(90); logicalCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TimeConditionContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RuleSetGrammarParser.DIGIT, 0); }
		public TimeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterTimeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitTimeCondition(this);
		}
	}

	public final TimeConditionContext timeCondition() throws RecognitionException {
		TimeConditionContext _localctx = new TimeConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_timeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(DIGIT);
			setState(94); match(T__2);
			setState(95); match(T__13);
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

	public static class LogicalConditionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RuleSetGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(RuleSetGrammarParser.TEXT, i);
		}
		public LogicalConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalCondition(this);
		}
	}

	public final LogicalConditionContext logicalCondition() throws RecognitionException {
		LogicalConditionContext _localctx = new LogicalConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(TEXT);
			setState(98); match(T__1);
			setState(99); match(TEXT);
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
		enterRule(_localctx, 26, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(T__3);
			setState(102); condition();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(103); match(T__0);
				setState(104); condition();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(T__6);
			setState(111); match(TEXT);
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
		enterRule(_localctx, 28, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__17);
			setState(114); match(TEXT);
			setState(115); match(T__10);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__5) | (1L << TEXT))) != 0)) {
				{
				{
				setState(116); action();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122); transition();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(127); match(T__9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\6\2)\n\2\r\2\16\2*\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17l\n\17\f\17\16\17o\13\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\20\6\20~\n\20\r"+
		"\20\16\20\177\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\3\3\2\6\7\177\2#\3\2\2\2\4\62\3\2\2\2\6\67\3\2\2\2\b<\3\2\2\2\n"+
		"A\3\2\2\2\fC\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22O\3\2\2\2\24X\3\2\2\2\26"+
		"]\3\2\2\2\30_\3\2\2\2\32c\3\2\2\2\34g\3\2\2\2\36s\3\2\2\2 $\5\6\4\2!$"+
		"\5\4\3\2\"$\5\b\5\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2"+
		"%&\3\2\2\2&(\3\2\2\2\')\5\f\7\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+/\3\2\2\2,.\5\36\20\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\3\3\2\2\2\61/\3\2\2\2\62\63\7\16\2\2\63\64\7\31\2\2\64\65\7\13\2\2\65"+
		"\66\7\27\2\2\66\5\3\2\2\2\678\7\4\2\289\7\31\2\29:\7\13\2\2:;\7\27\2\2"+
		";\7\3\2\2\2<=\7\3\2\2=>\7\31\2\2>?\7\13\2\2?@\7\27\2\2@\t\3\2\2\2AB\3"+
		"\2\2\2B\13\3\2\2\2CD\7\b\2\2DE\7\31\2\2E\r\3\2\2\2FJ\5\20\t\2GJ\5\22\n"+
		"\2HJ\5\24\13\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\17\3\2\2\2KL\7\31\2\2LM"+
		"\7\22\2\2MN\7\31\2\2N\21\3\2\2\2OP\7\21\2\2PQ\7\31\2\2QR\7\22\2\2RS\7"+
		"\27\2\2ST\t\2\2\2TU\7\17\2\2UV\7\27\2\2VW\7\24\2\2W\23\3\2\2\2XY\7\n\2"+
		"\2YZ\7\31\2\2Z\25\3\2\2\2[^\5\30\r\2\\^\5\32\16\2][\3\2\2\2]\\\3\2\2\2"+
		"^\27\3\2\2\2_`\7\27\2\2`a\7\24\2\2ab\7\t\2\2b\31\3\2\2\2cd\7\31\2\2de"+
		"\7\25\2\2ef\7\31\2\2f\33\3\2\2\2gh\7\23\2\2hm\5\26\f\2ij\7\26\2\2jl\5"+
		"\26\f\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq"+
		"\7\20\2\2qr\7\31\2\2r\35\3\2\2\2st\7\5\2\2tu\7\31\2\2uy\7\f\2\2vx\5\16"+
		"\b\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|~\5\34"+
		"\17\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\r\2\2\u0082\37\3\2\2\2\13#%*/I]my\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}