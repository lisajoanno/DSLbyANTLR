package main;

// Generated from RuleSetGrammar.g4 by ANTLR 4.3

import dsl.*;
import dsl.enums.Alteration;
import dsl.enums.Color;
import dsl.enums.NoteName;
import generation.StateName;
import grammar.RuleSetGrammarBaseListener;
import grammar.RuleSetGrammarListener;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link RuleSetGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MusicalListener extends RuleSetGrammarBaseListener {

	Musical musical = new Musical();

	private boolean shouldPrint = false;
	MusicalListener(boolean shouldPrint) {
		this.shouldPrint = shouldPrint;
	}


	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterInit(@NotNull RuleSetGrammarParser.InitContext ctx) {

//		try {
//			if (ctx.COLOR() == null) throw new ColorDoesntExistException();
//
//		} catch (ColorDoesntExistException c) {
//			//Problem with the color
//			System.err.println("Your color doesn't exist !");
//			//Default : blue
//			musical.setColor(Color.BLUE);
//		}

        musical.setColor(Color.valueOf(ctx.init_color().COLOR().getText().toUpperCase()));
		musical.setSpeakerPin(Integer.parseInt(ctx.init_speaker().DIGIT().toString()));
		musical.setScreenPin(Integer.parseInt(ctx.init_screen().DIGIT().toString()));
        musical.setBpm(Integer.parseInt(ctx.init_bpm().DIGIT().toString()));
        musical.setKeyAlt(ctx.init_key().KEY_ALT().toString());
		musical.setSerial(ctx.init_serial().CHOICE().toString());
	}


	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void enterScore(@NotNull RuleSetGrammarParser.ScoreContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			try {
				RuleSetGrammarParser.NoteContext nc = (RuleSetGrammarParser.NoteContext) (ctx.getChild(i));
				Note note = getNoteFromNoteContext(nc);
				musical.getMainScore().add(note);
			} catch (ClassCastException e) {
				try {
					RuleSetGrammarParser.Macro_defContext nc = (RuleSetGrammarParser.Macro_defContext) (ctx.getChild(i));
					MacroName nameOfMacro = new MacroName(nc.TEXT().toString()) ;
					musical.getMainScore().add(nameOfMacro);
				} catch (Exception exc) {
					//The cast did not succeed -> it's not a note ! so it must be a macro
					String macroName = (ctx.getChild(i).getText().trim());
					if (!macroName.equals("-")) {
						try {
							MacroName nameOfMacro = new MacroName(macroName);
							musical.getMainScore().add(nameOfMacro);
						} catch (Exception m) {
							//The macro used did not exist
							System.err.println("You tried to use a macro you did not define : ignored.");
						}
					}
				}
			}
		}

	}


	/**
	 * When the DSL is over, prints the Musical object created.
	 *
	 */
	@Override
	public void exitDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
		if (shouldPrint) {
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("output.txt"), "utf-8"))) {
				writer.write(musical.toString());
				if (StateName.currentState <= 140) {
				    System.err.println("WARNING : you used more than 140 states. The generated code may not fit your arduino.");
                }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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

	private Note getNoteFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
		Note note;
        Alteration alt = getAlterationFromNoteContext(nc);
        double rythm = getRythmFromNoteContext(nc);
        int oct = getOctaveFromNoteContext(nc);

		if (nc.NOTE().getText().equals("$")) {
			note = new Silence(rythm);
		} else {
			note = new Note(musical.getKeyAlt());
			note.setNoteName(NoteName.valueOf(nc.NOTE().getText().toUpperCase()));
			note.setAlteration(alt);
			note.setOctave(oct);
			note.setRythm(rythm);
		}
		return note;
	}

	private Alteration getAlterationFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
		if (nc.SYMBOL() != null) {
			return Alteration.valueOf(nc.SYMBOL().getText().charAt(0));
		}
		return Alteration.ORIGINAL;
    }

    private int lastOctave = -1;
    private int getOctaveFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
		// si c'est la première note
    	if (lastOctave < 0) {
			lastOctave = Integer.valueOf(nc.DIGIT().toString());
		}
    	// si pas de nouvelle octave, on prend la dernière
		if (nc.DIGIT() == null) {
			return lastOctave;
		}
		lastOctave = Integer.valueOf(nc.DIGIT().toString());
		return Integer.valueOf(nc.DIGIT().toString());
    }

    private double getRythmFromNoteContext(RuleSetGrammarParser.NoteContext nc) {
		int start = 0,
				end = nc.getChildCount()-1 /* on parle d'index */ ;
		if (nc.getChild(end).toString().equals(" ")) {
			end--;
		}
		if (nc.SYMBOL() != null) {
			start++;
		}
		if (nc.DIGIT() != null) {
			start++;
		}

		int size = end - start;
		boolean isSemi = (nc.getChild(end).toString().equals("."));
        size = (size > 0 ? size : 0);
        // if isPlus, it's '+', if isPlus is false, then it's '-' character
        boolean isPlus = true;

        if (size > 0) isPlus = (nc.getChild(start+1).toString().equals("+"));

        double res = (isSemi ? 1.5 : 1);
		size = (isSemi ? size-1 : size);
        if (isPlus) {
			res *= (Math.pow(2, size));
		} else {
			res /= (Math.pow(2, size));
		}

		double whole = 60000/musical.getBpm();
		return res * whole;
    }

    /*private void print(Object s) {
		if (shouldPrint) {
			System.out.println(s);
		}
    }*/
}