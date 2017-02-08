package main;

import dsl.Note;
import dsl.Silence;
import dsl.enums.Alteration;
import dsl.enums.NoteName;
import org.junit.Test;

import static dsl.enums.NoteName.LA;
import static org.junit.Assert.*;

/**
 * Tests on musical classes (notes, macros...)
 *
 * Created by Lisa Joanno on 07/02/17.
 */
public class MusicalTest {


    @Test
    public void testFrq() throws Exception {
        assertEquals(LA.getFrq(3, Alteration.ORIGINAL, Alteration.SHARP, 0), 440);
        assertEquals(LA.getFrq(3, Alteration.FLAT, Alteration.SHARP, 0), 415);
        assertEquals(LA.getFrq(3, Alteration.ORIGINAL, Alteration.FLAT, 3), 415);
        assertEquals(LA.getFrq(3, Alteration.ORIGINAL, Alteration.FLAT, 2), 440);
        assertEquals(LA.getFrq(3, Alteration.NATURAL, Alteration.FLAT, 3), 440);
    }

    @Test
    public void testNoteInit() throws Exception {
        Note n = new Note("###");
        assertTrue(n.getKeyNumber() == 3);
        assertEquals(n.getKeyType(), Alteration.SHARP);
    }

    @Test
    public void testUSName() throws Exception {
        Note n = new Note("###");
        n.setNoteName(NoteName.MI);
        assertTrue(n.getKeyNumber() == 3);
        assertEquals(n.getUsName(), "e");
    }

    @Test
    public void testSilence() throws Exception {
        int duration = 100;
        Note n = new Silence(duration);
        assertNull(n.getKeyType());
        assertNotNull(n.getRythm());
        assertTrue(n.getRythm() == 0);
        assertTrue(((Silence) n).getDuration() == duration);
        assertEquals(n.getUsName(), "X");
        assertEquals(((Silence) n).getInMS(), duration);
    }
}
