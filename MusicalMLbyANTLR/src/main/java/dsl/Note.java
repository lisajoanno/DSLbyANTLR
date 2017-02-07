package dsl;

import dsl.enums.Alteration;
import dsl.enums.NoteName;
import generation.StateName;

import static java.lang.StrictMath.min;

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
    private Alteration keyType;
    private int keyNumber;

    public Note(String key) {
        this.keyNumber = key.length();
        this.keyType = this.keyNumber > 0 ? Alteration.valueOf(key.charAt(0)) : null;
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
        return toString(false);
    }

    protected String toString(Boolean silent) {
        String res = "";
        res += "state s" + StateName.getCurrentStateAndUse() + " {\n";
        res += "\tserialPrint " + getUsName() + (int) rythm + "\n";
        res += "\tled <= HIGH\n";
        if (!silent) {
            res += "\ttone spk <= " + getInHZ() + " hz for " + (int) rythm + " ms\n";
        }
        res += "\twhen " + getInMS() +" ms elapsed => s"+StateName.currentState + "\n";
        res += "}\n\n";
        return res;

    }


    public String getUsName() {
        return noteName.getUsName();
    }

    protected int getInHZ() {
        return noteName.getFrq(octave, alteration, keyType, keyNumber);
    }

    protected int getInMS() {
        return (int) (rythm + min(100, rythm*0.3));
    }
}
