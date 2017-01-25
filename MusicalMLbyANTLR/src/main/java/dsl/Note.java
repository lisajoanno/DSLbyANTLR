package dsl;

import dsl.enums.Alteration;
import dsl.enums.NoteName;
import generation.StateName;

import java.util.Random;

import static java.lang.StrictMath.max;

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




    public void setNoteName(NoteName noteName) {
        this.noteName = noteName;
    }

    public void setAlteration(Alteration alteration) {
        this.alteration = alteration;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public void setRythm(double rythm) {
        this.rythm = rythm;
    }


    @Override
    public String toString() {
        String res = "";
        res += "state s" + StateName.getCurrentStateAndUse() + " {\n";
        res += "\tled <= HIGH\n";
        res += "\ttone spk <= "+getInHZ()+" hz for "+getInMS()+" ms\n";
        res += "\twhen " + rythm +" ms elapsed => s"+StateName.currentState + "\n";
        res += "}\n\n";
        return res;
    }

    private int getInHZ() {
        return noteName.getFrq(octave, alteration);
    }

    private int getInMS() {
        return (int) max(100, rythm*0.3);

        //return (new Random()).nextInt(10000);
    }
}
