package main;

import dsl.*;
import dsl.enums.Alteration;
import dsl.enums.Color;
import dsl.enums.NoteName;
import org.junit.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Lisa Joanno on 20/01/17.
 */
public class MusicalListenerTest {

    @Test
    public void testDSLOK() throws Exception {
        MusicalListener musicalListenerOK = (new Main()).runListener("resources/inputTest.txt", false);
        assertEquals(musicalListenerOK.musical.getColor(), Color.BLUE);
        assertEquals(musicalListenerOK.musical.getSpeakerPin(), 9);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertFalse(musicalListenerOK.musical.getMacros().isEmpty());
        assertTrue(musicalListenerOK.musical.getMacros().get(0).getMacroName().equals("refrain"));
        assertTrue(musicalListenerOK.musical.getMacros().get(1).getMacroName().equals("ending"));
        Note note = new Note(NoteName.DO, Alteration.SHARP, 6, (double) (1.5 * Math.pow(2, 3)));
        assertEquals(musicalListenerOK.musical.getMacros().get(0).getNotes().get(0).toString(), note.toString());
    }

    @Test
    public void testMacroDoesntExist() throws Exception {
        MusicalListener musicalListener = (new Main()).runListener("resources/inputTestMacroDoesntExist.txt", false);
        boolean macroExists = false;
        for (Macro s : musicalListener.musical.getMacros()) {
            try {
                Macro m = (Macro) s;
                if (m.getMacroName().equals("aaa")) macroExists = true;
            } catch (ClassCastException c) {
                // nthg
            }
        }
        assertFalse(macroExists);
    }

    @Test
    public void testColorDoesntExist() throws Exception {
        MusicalListener musicalListener = (new Main()).runListener("resources/inputTestWrongColor.txt", false);
        assertEquals(musicalListener.musical.getColor(), Color.BLUE);
    }
}