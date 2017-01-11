package dsl.enums;

/**
 * List of notes by their french names.
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

    /**
     * Returns the NoteName corresponding to the String in parameters.
     *
     * @param s the String to convert into NoteName
     * @return the NoteName or null if it does not convert well (poorly handled because the grammar should not let that happen) (theoretically)
     */
    public static NoteName getTheNoteName(String s) {
        for (NoteName nn : values()) {
            if (nn.noteName.equals(s.trim())) return nn;
        }
        return null;
    }
}
