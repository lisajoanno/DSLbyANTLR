// Generated from RuleSetGrammar.g4 by ANTLR 4.3

   package grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleSetGrammarParser}.
 */
public interface RuleSetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_screen}.
	 * @param ctx the parse tree
	 */
	void enterInit_screen(@NotNull RuleSetGrammarParser.Init_screenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_screen}.
	 * @param ctx the parse tree
	 */
	void exitInit_screen(@NotNull RuleSetGrammarParser.Init_screenContext ctx);

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
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(@NotNull RuleSetGrammarParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(@NotNull RuleSetGrammarParser.NoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(@NotNull RuleSetGrammarParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(@NotNull RuleSetGrammarParser.ScoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_serial}.
	 * @param ctx the parse tree
	 */
	void enterInit_serial(@NotNull RuleSetGrammarParser.Init_serialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_serial}.
	 * @param ctx the parse tree
	 */
	void exitInit_serial(@NotNull RuleSetGrammarParser.Init_serialContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_bpm}.
	 * @param ctx the parse tree
	 */
	void enterInit_bpm(@NotNull RuleSetGrammarParser.Init_bpmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_bpm}.
	 * @param ctx the parse tree
	 */
	void exitInit_bpm(@NotNull RuleSetGrammarParser.Init_bpmContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_key}.
	 * @param ctx the parse tree
	 */
	void enterInit_key(@NotNull RuleSetGrammarParser.Init_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_key}.
	 * @param ctx the parse tree
	 */
	void exitInit_key(@NotNull RuleSetGrammarParser.Init_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_speaker}.
	 * @param ctx the parse tree
	 */
	void enterInit_speaker(@NotNull RuleSetGrammarParser.Init_speakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_speaker}.
	 * @param ctx the parse tree
	 */
	void exitInit_speaker(@NotNull RuleSetGrammarParser.Init_speakerContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#init_color}.
	 * @param ctx the parse tree
	 */
	void enterInit_color(@NotNull RuleSetGrammarParser.Init_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#init_color}.
	 * @param ctx the parse tree
	 */
	void exitInit_color(@NotNull RuleSetGrammarParser.Init_colorContext ctx);

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
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#macro_def}.
	 * @param ctx the parse tree
	 */
	void enterMacro_def(@NotNull RuleSetGrammarParser.Macro_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#macro_def}.
	 * @param ctx the parse tree
	 */
	void exitMacro_def(@NotNull RuleSetGrammarParser.Macro_defContext ctx);
}