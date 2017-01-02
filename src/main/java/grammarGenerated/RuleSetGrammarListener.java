// Generated from RuleSetGrammar.g4 by ANTLR 4.3

package grammarGenerated;

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
}