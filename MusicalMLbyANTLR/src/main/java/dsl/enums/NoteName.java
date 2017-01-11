package dsl.enums;

/**
 * List of notes.
 *
 * Created by lisa on 11/01/17.
 */
public enum NoteName {
    DO("do"), RE("re"), MI("mi"), FA("fa"), SOL("sol"), LA("la"), SI("si");

    private String noteName;

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    NoteName(String s) {
        this.noteName = s;
    }

    public static NoteName getTheNoteName(String s) {
        for (NoteName nn : values()) {
            if (nn.noteName.equals(s.trim())) return nn;
        }
        return null;
    }
}
