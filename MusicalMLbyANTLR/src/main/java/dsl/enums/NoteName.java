package dsl.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List of notes by their french names and their frequences.
 *
 * Created by lisa on 11/01/17.
 */
public enum NoteName {
    DO(-4.5, "c"), RE(-3.5, "d"), MI(-2.5, "e"),
    FA(-2, "f"), SOL(-1, "g"), LA(0, "a"), SI(1, "b");
    private static List<NoteName> sharpOrder;

    static {
        sharpOrder = Arrays.asList(FA, DO, SOL, RE, LA, MI, SI);
    }

    private double place;
    private String usName;


    NoteName(double place, String us) {
        this.place = place;
        this.usName = us;
    }

    /**
     * Returns the frequency of the note.
     *
     * @param octave the octave of the note
     * @param alteration the note alteration
     * @param keyType the score key alteration
     * @param keyNumber the number of key alteration
     * @return the frequency of the note
     */
    public int getFrq(int octave, Alteration alteration, Alteration keyType, int keyNumber) {
        List alteredNotes = new ArrayList(sharpOrder);
        if (keyType == Alteration.FLAT) {
            Collections.reverse(alteredNotes);
        }
        alteredNotes = alteredNotes.subList(0, keyNumber);
        double keyModifier = 0;
        if (alteration != Alteration.NATURAL && alteredNotes.contains(this)) {
            keyModifier = keyType.getValue();
        }
        double modifier = keyModifier + alteration.getValue();

        double actualPlace = 2*((place + modifier) + ((octave-3) * 6)); //-3 in order to have LA3 = 440Hz
        return (int) Math.round(440* Math.pow(2, actualPlace/12));
    }

    public String getUsName() {
        return usName;
    }

}
