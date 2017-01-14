package dsl;

import dsl.enums.NoteDuration;
import dsl.enums.NoteName;

/**
 * A note is a duration and a name, both described in enums because of their specificity.
 *
 * Created by lisa on 11/01/17.
 */
public class Note extends ScoreItem {
    private NoteDuration duration;
    private NoteName noteName;

    public Note() {
    }

    public Note(NoteDuration duration, NoteName noteName) {
        this.duration = duration;
        this.noteName = noteName;
    }

    public NoteDuration getDuration() {
        return duration;
    }

    public void setDuration(NoteDuration duration) {
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
        return "(" + duration.toString() + ", " + noteName.getNoteName() + ")";
    }
}
