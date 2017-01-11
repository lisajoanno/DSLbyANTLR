package dsl.exceptions;

/**
 * Exception thrown when a macro is used in the score but never declared.
 *
 * Created by lisa on 11/01/17.
 */
public class MacroDoesntExistException extends Exception {
    public MacroDoesntExistException() {
        super("A macro is used but never devlared.");
    }
}
