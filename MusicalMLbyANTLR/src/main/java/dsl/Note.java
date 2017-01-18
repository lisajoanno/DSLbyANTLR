package dsl;

import dsl.enums.Alteration;
import dsl.enums.NoteDuration;
import dsl.enums.NoteName;

/**
 * A note is a duration and a name, both described in enums because of their specificity.
 *
 * Created by lisa on 11/01/17.
 */
public class Note extends ScoreItem {
    private NoteName noteName;
    private Alteration alteration;
    private int octave;
    private double rythm;

    public Note() {
    }

    public Note(NoteName noteName, Alteration alteration, int octave, double rythm) {
        this.noteName = noteName;
        this.alteration = alteration;
        this.octave = octave;
        this.rythm = rythm;
    }




    public NoteName getNoteName() {
        return noteName;
    }

    public void setNoteName(NoteName noteName) {
        this.noteName = noteName;
    }

    public Alteration getAlteration() {
        return alteration;
    }

    public void setAlteration(Alteration alteration) {
        this.alteration = alteration;
    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public double getRythm() {
        return rythm;
    }

    public void setRythm(double rythm) {
        this.rythm = rythm;
    }


    @Override
    public String toString() {
        return "(" + alteration + ", " + noteName.getNoteName() + ")";
    }
}
