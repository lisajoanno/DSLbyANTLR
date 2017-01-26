package dsl.enums;

/**
 * List of notes by their french names.
 *
 * Created by lisa on 11/01/17.
 */
public enum NoteName {
    DO("do", -4.5), RE("re", -3.5), MI("mi", -2.5),
    FA("fa", -2), SOL("sol", -1), LA("la", 0), SI("si", 1);

    private String noteName;
    private double place;

    NoteName(String s, double place) {
        this.noteName = s;
        this.place = place;
    }

    public int getFrq(int octave, Alteration alteration) {
        double actualPlace = 2*((place + alteration.getValue()) + ((octave-3) * 6)); //-3 in order to have LA3 = 440Hz
        return (int) Math.round(440* Math.pow(2, actualPlace/12));
    }

    public String getNoteName() {
        return noteName;
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

    private NoteName getInterval(int interval) {
        NoteName[] notes = values();
        for(int i = 0; i < notes.length; i++) {
            if(notes[i].equals(this)){
                /* To prevent    -1 % 7 = -1   when the interval is negative */
                int intervalNoteId = (((i + interval) % notes.length) + notes.length) % notes.length;
                /*  It would be cleaner to use Maths.floorMod() but it's java 1.8
                    and the maven java compiler is set to 1.7.
                    And I don't want to break everything for you if you don't have the last jdk */
//                int intervalNodeId = floorMod(i+interval, notes.length);
                return notes[intervalNoteId];
            }
        }
        return null;
    }

}
