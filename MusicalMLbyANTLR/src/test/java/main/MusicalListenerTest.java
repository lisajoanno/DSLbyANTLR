package main;

import dsl.Macro;
import dsl.enums.Alteration;
import dsl.enums.Color;
import org.junit.Test;

import static dsl.enums.NoteName.*;
import static org.junit.Assert.*;

/**
 * Tests because tests
 *
 * Created by Lisa Joanno on 20/01/17.
 */
public class MusicalListenerTest {


    @Test
    public void testDSLOK() throws Exception {
        MusicalListener musicalListenerOK = Main.runListener("resources/inputTest.txt", false);
        assert musicalListenerOK != null;
        assertEquals(musicalListenerOK.musical.getColor(), Color.BLUE);
        assertEquals(musicalListenerOK.musical.getSpeakerPin(), 9);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertFalse(musicalListenerOK.musical.getMacros().isEmpty());
        assertTrue(musicalListenerOK.musical.getMacros().get(0).getMacroName().equals("refrain"));
        assertTrue(musicalListenerOK.musical.getMacros().get(1).getMacroName().equals("ending"));
        // First note is     #do6+++.
        //Note note = new Note(NoteName.DO, Alteration.SHARP, 6, (1.5 * Math.pow(2, 3)));
        //assertTrue(musicalListenerOK.musical.getMacros().get(0).getNotes().get(0) == note);
    }

    @Test
    public void testMacroDoesntExist() throws Exception {
        MusicalListener musicalListener = Main.runListener("resources/inputTestMacroDoesntExist.txt", false);
        boolean macroExists = false;
        assert musicalListener != null;
        for (Macro s : musicalListener.musical.getMacros()) {
            try {
                Macro m = s;
                if (m.getMacroName().equals("aaa")) macroExists = true;
            } catch (ClassCastException c) {
                // nthg
            }
        }
        assertFalse(macroExists);
    }

}