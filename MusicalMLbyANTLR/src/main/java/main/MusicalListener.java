package main;

// Generated from RuleSetGrammar.g4 by ANTLR 4.3

import dsl.Macro;
import dsl.Musical;
import dsl.Note;
import dsl.enums.Alteration;
import dsl.enums.Color;
import dsl.enums.NoteDuration;
import dsl.enums.NoteName;
import dsl.exceptions.ColorDoesntExistException;
import dsl.exceptions.MacroDoesntExistException;
import grammar.RuleSetGrammarBaseListener;
import grammar.RuleSetGrammarListener;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link RuleSetGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MusicalListener extends RuleSetGrammarBaseListener {

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

		musical.setBuzzerPin(Integer.parseInt(ctx.DIGIT(0).toString()));
		musical.setScreenPin(Integer.parseInt(ctx.DIGIT(1).toString()));
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


    /**
     * When the DSL is over, prints the Musical object created.
     * @param ctx
     */
	@Override
	public void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
		//System.err.println(musical);
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



	/****************************** utils ******************************/

	/**
	 * //TODO doc
	 * @param nc
	 * @return
	 */
	private Note getNoteFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
		Note note = new Note();
        Alteration alt = getAlterationFromSymbol();
        double rythm = getRythmFromSymbol();
        int oct = getOctaveFromSymbol();

		note.setNoteName(NoteName.getTheNoteName(nc.NOTE().getText()));
		note.setAlteration(alt);
		note.setOctave(oct);
		note.setRythm(rythm);
		return note;
	}

	private Alteration getAlterationFromSymbol() {
        return Alteration.FLAT;
    }

    private double getRythmFromSymbol() {
        return -1;
    }

    private int getOctaveFromSymbol() {
        return -1;
    }
}