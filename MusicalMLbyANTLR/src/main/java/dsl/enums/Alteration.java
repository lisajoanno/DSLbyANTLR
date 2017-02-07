package dsl.enums;

/**
 * An alteration.
 *
 * Created by Lisa Joanno on 18/01/17.
 */
public enum Alteration {
    SHARP('#', 0.5), FLAT('¤', -0.5), ORIGINAL(' ', 0), NATURAL('=', 0);

    private final double value;
    private final char symbol;

    Alteration(char c, double value) {
        this.symbol = c;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public static Alteration valueOf(char s) {
        for (Alteration alteration : values()) {
            if (alteration.symbol == s) {
                return alteration;
            }
        }
        return ORIGINAL;
    }
}
