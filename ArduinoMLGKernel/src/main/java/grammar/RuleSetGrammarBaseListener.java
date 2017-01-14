// Generated from RuleSetGrammar.g4 by ANTLR 4.3

package grammar;


import dsl.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.logging.SocketHandler;

/**
 * This class provides an empty implementation of {@link RuleSetGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class RuleSetGrammarBaseListener implements RuleSetGrammarListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInit(@NotNull RuleSetGrammarParser.InitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInit(@NotNull RuleSetGrammarParser.InitContext ctx) { }

	@Override
	public void enterActuator(@NotNull RuleSetGrammarParser.ActuatorContext ctx) {

	}

	@Override
	public void exitActuator(@NotNull RuleSetGrammarParser.ActuatorContext ctx) {

	}

	@Override
	public void enterCondition(@NotNull RuleSetGrammarParser.ConditionContext ctx) {

	}

	@Override
	public void exitCondition(@NotNull RuleSetGrammarParser.ConditionContext ctx) {

	}

	@Override
	public void enterAction(@NotNull RuleSetGrammarParser.ActionContext ctx) {

	}

	@Override
	public void exitAction(@NotNull RuleSetGrammarParser.ActionContext ctx) {

	}


	@Override
	public void enterSensor(@NotNull RuleSetGrammarParser.SensorContext ctx) {

	}

	@Override
	public void exitSensor(@NotNull RuleSetGrammarParser.SensorContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterState(@NotNull RuleSetGrammarParser.StateContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitState(@NotNull RuleSetGrammarParser.StateContext ctx) { }

	private DSL dsl;

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
		dsl = new DSL();

		for(RuleSetGrammarParser.SensorContext sc : ctx.sensor()){
			Sensor s = new Sensor();
			s.setName(sc.TEXT().toString());
			s.setPin(Integer.parseInt(sc.DIGIT().getText()));
			dsl.addBrick(s);
			System.out.println("SENSOR "+sc.TEXT()+" DETECTED ON "+sc.DIGIT() );
		}

		for(RuleSetGrammarParser.ActuatorContext ac : ctx.actuator()){
			Actuator a = new Actuator();
			a.setName(ac.TEXT().toString());
			a.setPin(Integer.parseInt(ac.DIGIT().getText()));
			dsl.addBrick(a);
			System.out.println("ACTUATOR "+ac.TEXT()+" DETECTED ON "+ac.DIGIT() );
		}
		for(RuleSetGrammarParser.StateContext sc : ctx.state()) {
			State s = new State(sc.TEXT().toString());
			dsl.addState(s);
		}
		for(RuleSetGrammarParser.StateContext sc : ctx.state()){
			State s = dsl.getState(sc.TEXT().toString());
			System.out.println("STATE "+sc.TEXT());
			for(RuleSetGrammarParser.ActionContext ac : sc.action()){
				Action action = new Action();
				action.setActuator((Actuator)dsl.getBrick(ac.TEXT().get(0).toString()));
				action.setBinaryState(BinaryState.valueOf(ac.TEXT(1).toString().toUpperCase()));
				s.addAction(action);
				System.out.println("\tACTION "+ac.TEXT().get(0)+" <= "+ac.TEXT().get(1));
			}

			for(RuleSetGrammarParser.TransitionContext tc : sc.transition()){
				Transition transition = new Transition();
				transition.setTarget(dsl.getState(tc.TEXT().toString()));
				System.out.println("\tTRANSITION TO STATE "+tc.TEXT());
				for(RuleSetGrammarParser.ConditionContext cc : tc.condition()){
					System.out.println("\t\t"+ cc.TEXT(0)+" IS " +cc.TEXT(1));
					Condition condition = new Condition();
					condition.setSensor((Sensor)dsl.getBrick(cc.TEXT(0).toString()));
					condition.setBinaryState(BinaryState.HIGH);
					transition.addCondition(condition);
				}
				s.addTransition(transition);
			}

		}

		for(RuleSetGrammarParser.InitContext ic : ctx.init()){
			System.out.println("INITIAL STATE:"+ic.TEXT());
			//TODO set the initial state
			dsl.setInitState(ic.TEXT().toString());
		}
		System.out.println(dsl.toString());


	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx) { }

	@Override
	public void enterTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx) {

	}

	@Override
	public void exitTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}