package dsl.exceptions;

/**
 * Exception thrown when the chosen color doesn't exist.
 *
 * Created by lisa on 11/01/17.
 */
public class ColorDoesntExistException extends Exception {
    public ColorDoesntExistException() {
        super("The chosen color doesn't exist.");
    }
}
