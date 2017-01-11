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