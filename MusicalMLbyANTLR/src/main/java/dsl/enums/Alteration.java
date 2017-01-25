package dsl.enums;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * An alteration.
 *
 * Created by Lisa Joanno on 18/01/17.
 */
public enum Alteration {
    SHARP('♯'), FLAT('♭'), NATURAL(' ');

    Alteration(char c) {
    }
}
