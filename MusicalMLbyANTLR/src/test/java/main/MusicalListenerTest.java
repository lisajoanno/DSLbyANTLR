package main;

import dsl.Musical;
import dsl.Note;
import dsl.enums.Alteration;
import dsl.enums.Color;
import dsl.enums.NoteName;
import grammar.RuleSetGrammarLexer;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Ignore;
import org.junit.Rule;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.rules.ExternalResource;

import static org.junit.Assert.*;

/**
 * Created by Lisa Joanno on 20/01/17.
 */
public class MusicalListenerTest {
    private MusicalListener musicalListenerOK;

    @org.junit.Before
    public void setUp() throws Exception {
        musicalListenerOK = initTests("resources/inputTest.txt");
    }

    @org.junit.Test
    public void enterInit() throws Exception {

    }

    @org.junit.Test
    public void enterScore() throws Exception {

    }

    @org.junit.Test
    public void exitDsl() throws Exception {
        assertEquals(musicalListenerOK.musical.getColor(), Color.BLUE);
        assertEquals(musicalListenerOK.musical.getBuzzerPin(), 9);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertEquals(musicalListenerOK.musical.getScreenPin(), 12);
        assertFalse(musicalListenerOK.musical.getMacros().isEmpty());
        assertTrue(musicalListenerOK.musical.getMacros().get(0).getMacroName().equals("refrain"));
        assertTrue(musicalListenerOK.musical.getMacros().get(1).getMacroName().equals("ending"));
        double d = (1.5*Math.pow(2,3));
        Note note = new Note(NoteName.DO, Alteration.FLAT, 6, d);
        assertEquals(musicalListenerOK.musical.getMacros().get(0).getNotes().get(0).toString(), note.toString());
    }

    @org.junit.Test
    public void enterMacro_def() throws Exception {

    }

    @org.junit.Test
    public void getRythmTest() throws Exception {

    }

    public MusicalListener initTests(String fileName) {
        try {
            String query = new String(Files.readAllBytes(Paths.get(fileName)));
            ANTLRInputStream input = new ANTLRInputStream(query);
            RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);
            RuleSetGrammarParser.DslContext tree = parser.dsl();
            MusicalListener musical = new MusicalListener();
            ParseTreeWalker.DEFAULT.walk(musical, tree);
            return musical;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}