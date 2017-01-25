package dsl.enums;

/**
 * List of notes by their french names.
 *
 * Created by lisa on 11/01/17.
 */
public enum NoteName {
    DO("do", 32.7), RE("re", 36.7), MI("mi", 41.2), FA("fa", 43.6), SOL("sol", 49.0), LA("la", 55.0), SI("si", 62.0);

    private String noteName;

    public int getFrq(int octave, Alteration alteration) {
        /*if (alteration.equals(Alteration.SHARP)) {
            return (int) Math.round(frq * Math.pow(2, octave-1));
        }*/
        return (int) Math.round(frq * Math.pow(2, octave-1));
    }

    private double frq;

    public String getNoteName() {
        return noteName;
    }

    NoteName(String s, double f) {
        this.noteName = s;
        this.frq = f;
    }

    /**
     * Returns the NoteName corresponding to the String in parameters.
     *
     * @param s the String to convert into NoteName
     * @return the NoteName or null if it does not convert well (poorly handled because the grammar should not let that happen) (theoretically)
     */
    public static NoteName getTheNoteName(String s) {
        //TODO return valueOf(s);
        for (NoteName nn : values()) {
            if (nn.noteName.equals(s.trim())) return nn;
        }
        return null;
    }

    private NoteName getLast(NoteName note) {
        NoteName[] notes = values();
        for(int i = 0; i < notes.length; i++) {
            if(notes[i].equals(note)){
                return notes[(i-1) % notes.length];
            }
        }
        return null;
    }

}
