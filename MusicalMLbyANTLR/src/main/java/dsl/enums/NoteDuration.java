package dsl.enums;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Model of note durations.
 *
 * Knows what symbols the DSL is going to use (to convert into symbols).
 *
 * Created by lisa on 11/01/17.
 */
public enum NoteDuration {
    WHOLE, HALF, QUARTER, EIGHT, SIXTEEN;

    public static NoteDuration getNoteDurationFromSymbol(TerminalNode symbol) {
        String symbolStr = (symbol == null ? "" : symbol.toString());
        switch (symbolStr) {
            case "@" : return HALF;
            case "*" : return QUARTER;
            case "$" : return EIGHT;
            case "¤" : return SIXTEEN;
            default: return WHOLE;
        }
    }
}
