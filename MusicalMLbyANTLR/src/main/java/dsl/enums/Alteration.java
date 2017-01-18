package dsl.enums;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Lisa Joanno on 18/01/17.
 */
public enum Alteration {
    SHARP('♯'), FLAT('♭'), NATURAL(' ');

    private char symbol;

    Alteration(char c) {
        this.symbol = c;
    }
}
