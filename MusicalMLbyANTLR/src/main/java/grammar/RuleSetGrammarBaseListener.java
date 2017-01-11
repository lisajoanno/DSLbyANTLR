package grammar;
// Generated from RuleSetGrammar.g4 by ANTLR 4.3

import dsl.Macro;
import dsl.Musical;
import dsl.Note;
import dsl.enums.Color;
import dsl.enums.NoteDuration;
import dsl.enums.NoteName;
import dsl.exceptions.ColorDoesntExistException;
import dsl.exceptions.MacroDoesntExistException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link RuleSetGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class RuleSetGrammarBaseListener implements RuleSetGrammarListener {

	Musical musical = new Musical();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterInit(@NotNull RuleSetGrammarParser.InitContext ctx) {

	    try {
            musical.setColor(Color.getTheColor(ctx.COLOR().getText()));
        } catch (ColorDoesntExistException c) {
	        //Problem with the color
            System.err.println("Your color doesn't exist !");
            //Default : blue
            musical.setColor(Color.BLUE);
        }

		musical.setBuzzerPin(Integer.parseInt(ctx.PIN(0).toString()));
		musical.setScreenPin(Integer.parseInt(ctx.PIN(1).toString()));
	}

	@Override
	public void exitInit(@NotNull RuleSetGrammarParser.InitContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterNote(@NotNull RuleSetGrammarParser.NoteContext ctx) { }

	@Override
	public void exitNote(@NotNull RuleSetGrammarParser.NoteContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterScore(@NotNull RuleSetGrammarParser.ScoreContext ctx) {
		for (int i = 0 ; i < ctx.getChildCount() ; i++) {
			try {
				RuleSetGrammarParser.NoteContext nc = (RuleSetGrammarParser.NoteContext) (ctx.getChild(i));
                musical.getMainScore().add(getNoteFromNoteContext(nc));
                continue;
			} catch (ClassCastException e) {
                //The cast did not succeed -> it's not a note ! so it must be a macro
                String macroName = (ctx.getChild(i).getText().trim());
                if (!macroName.equals("-")) {
                    try {
                        musical.getMainScore().add(musical.getMacroFromMacrosList(macroName));
                    } catch (MacroDoesntExistException m) {
                        //The macro used did not exist
                        System.err.println("You tried to use a macro you did not define : ignored.");
                    }
                }
			}
        }

	}

	@Override
	public void exitScore(@NotNull RuleSetGrammarParser.ScoreContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx) { }

	@Override
	public void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
        System.err.println(musical);
    }


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterMacro_def(@NotNull RuleSetGrammarParser.Macro_defContext ctx) {
		Macro macro = new Macro();
		macro.setMacroName(ctx.TEXT().getText());

		List<Note> notes = new ArrayList<>();
		for (RuleSetGrammarParser.NoteContext nc : ctx.note()) {
			notes.add(getNoteFromNoteContext(nc));
		}
		macro.setNotes(notes);

		musical.getMacros().add(macro);
	}

	@Override
	public void exitMacro_def(@NotNull RuleSetGrammarParser.Macro_defContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void visitErrorNode(@NotNull ErrorNode node) { }



    private Note getNoteFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
        Note note = new Note();
        System.err.println(nc.SYMBOL());
        NoteDuration duration = NoteDuration.getNoteDurationFromSymbol(nc.SYMBOL());
        note.setNoteName(NoteName.getTheNoteName(nc.NOTE().getText()));
        note.setDuration(duration);
        return note;
    }
}