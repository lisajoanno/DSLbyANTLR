// Generated from RuleSetGrammar.g4 by ANTLR 4.3

package grammar;


import dsl.Action;
import dsl.DSL;
import dsl.Item;
import dsl.State;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

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

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterState(@NotNull RuleSetGrammarParser.StateContext ctx) { }
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


		// Initialisation
		for (RuleSetGrammarParser.InitContext ic : ctx.init()) {
			// set of the list of items (a name and a State)
			String itemName = ic.TEXT().get(0).toString();
			String stateName = ic.TEXT().get(1).toString();

			State s = (stateName.equals("on") ? State.ON : State.OFF);
			dsl.getItems().add(new Item(s, itemName));
		}

		Action action;
		// States
		for (RuleSetGrammarParser.StateContext sc : ctx.state()) {
			//source item and state
			Item t = dsl.getItemFromName(sc.TEXT().get(0).toString());
			State s = ((sc.TEXT().get(1).toString()).equals("on") ? State.ON : State.OFF);

			//dest item and state
			Item t2 = dsl.getItemFromName(sc.TEXT().get(2).toString());
			State s2 = ((sc.TEXT().get(3).toString()).equals("on") ? State.ON : State.OFF);
			action = new Action(t, s, t2, s2);
			dsl.getActions().add(action);
		}

		System.out.println("dsl : ");
		System.out.println(dsl);

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx) { }

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