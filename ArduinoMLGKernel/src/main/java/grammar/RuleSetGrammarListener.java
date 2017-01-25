package grammar;
// Generated from RuleSetGrammar.g4 by ANTLR 4.3


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleSetGrammarParser}.
 */
public interface RuleSetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull RuleSetGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull RuleSetGrammarParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#tone}.
	 * @param ctx the parse tree
	 */
	void enterTone(@NotNull RuleSetGrammarParser.ToneContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#tone}.
	 * @param ctx the parse tree
	 */
	void exitTone(@NotNull RuleSetGrammarParser.ToneContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#logicalCondition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalCondition(@NotNull RuleSetGrammarParser.LogicalConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#logicalCondition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalCondition(@NotNull RuleSetGrammarParser.LogicalConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#logicalAction}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAction(@NotNull RuleSetGrammarParser.LogicalActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#logicalAction}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAction(@NotNull RuleSetGrammarParser.LogicalActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#actuator}.
	 * @param ctx the parse tree
	 */
	void enterActuator(@NotNull RuleSetGrammarParser.ActuatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#actuator}.
	 * @param ctx the parse tree
	 */
	void exitActuator(@NotNull RuleSetGrammarParser.ActuatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull RuleSetGrammarParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#serial}.
	 * @param ctx the parse tree
	 */
	void enterSerial(@NotNull RuleSetGrammarParser.SerialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#serial}.
	 * @param ctx the parse tree
	 */
	void exitSerial(@NotNull RuleSetGrammarParser.SerialContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#serialPrint}.
	 * @param ctx the parse tree
	 */
	void enterSerialPrint(@NotNull RuleSetGrammarParser.SerialPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#serialPrint}.
	 * @param ctx the parse tree
	 */
	void exitSerialPrint(@NotNull RuleSetGrammarParser.SerialPrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#speaker}.
	 * @param ctx the parse tree
	 */
	void enterSpeaker(@NotNull RuleSetGrammarParser.SpeakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#speaker}.
	 * @param ctx the parse tree
	 */
	void exitSpeaker(@NotNull RuleSetGrammarParser.SpeakerContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull RuleSetGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull RuleSetGrammarParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(@NotNull RuleSetGrammarParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(@NotNull RuleSetGrammarParser.SensorContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull RuleSetGrammarParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull RuleSetGrammarParser.StateContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#timeCondition}.
	 * @param ctx the parse tree
	 */
	void enterTimeCondition(@NotNull RuleSetGrammarParser.TimeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#timeCondition}.
	 * @param ctx the parse tree
	 */
	void exitTimeCondition(@NotNull RuleSetGrammarParser.TimeConditionContext ctx);
}