package main;

import dsl.Macro;
import dsl.Musical;
import dsl.Note;
import dsl.ScoreItem;
import dsl.enums.Alteration;
import dsl.enums.Color;
import dsl.enums.NoteName;
import dsl.exceptions.ColorDoesntExistException;
import dsl.exceptions.MacroDoesntExistException;
import grammar.RuleSetGrammarLexer;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.rules.ExternalResource;

import javax.crypto.Mac;

import static org.junit.Assert.*;

/**
 * Created by Lisa Joanno on 20/01/17.
 */
public class MusicalListenerTest {

    @Test
    public void testDSLOK() throws Exception {
        MusicalListener musicalListenerOK = (new Main()).runListener("resources/inputTest.txt");
        assertEquals(musicalListenerOK.musical.getColor(), Color.BLUE);
        assertEquals(musicalListenerOK.musical.getBuzzerPin(), 9);
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
        MusicalListener musicalListener = (new Main()).runListener("resources/inputTestMacroDoesntExist.txt");
        boolean macroExists = false;
        for (ScoreItem s : musicalListener.musical.getMacros()) {
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
        MusicalListener musicalListener = (new Main()).runListener("resources/inputTestWrongColor.txt");
        assertEquals(musicalListener.musical.getColor(), Color.BLUE);
    }


    @Test/*(expected = java.nio.file.NoSuchFileException.class)*/
    public void testFileDoesntExist() throws Exception {
        //MusicalListener musicalListener = (new Main()).runListener("resources/no.txt");
        //assertNull(musicalListener);
    }

}