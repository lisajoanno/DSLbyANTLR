package dsl;

import dsl.enums.NoteName;

/**
 * Created by lisa on 11/01/17.
 */
public class Note extends ScoreItem {
    private int duration;
    private NoteName noteName;

    public Note() {
    }

    public Note(int duration, NoteName noteName) {
        this.duration = duration;
        this.noteName = noteName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public NoteName getNoteName() {
        return noteName;
    }

    public void setNoteName(NoteName noteName) {
        this.noteName = noteName;
    }

    @Override
    public String toString() {
        return "(" + duration + "s, " + noteName.getNoteName() + ")";
    }
}
