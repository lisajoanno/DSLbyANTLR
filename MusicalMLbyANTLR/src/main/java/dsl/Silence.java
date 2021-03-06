package dsl;

import dsl.enums.Alteration;
import dsl.enums.NoteName;

/**
 * A silence.
 *
 * Created by atlas on 01/02/17.
 */
public class Silence extends Note {

    private double duration;

    public Silence(double rythm) {
        super("");
        super.setNoteName(null);
        super.setAlteration(null);
        super.setOctave(0);
        super.setRythm(0);
        this.duration = rythm;
    }

    @Override
    public int getInMS() {
        return (int) this.duration;
    }

    @Override
    protected int getInHZ() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString(true);
    }

    @Override
    public String getUsName() {
        return "X";
    }

    public double getDuration() {
        return duration;
    }
}
