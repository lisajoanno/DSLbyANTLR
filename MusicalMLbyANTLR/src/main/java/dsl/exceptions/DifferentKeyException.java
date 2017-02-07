package dsl.exceptions;

/**
 * Exception thrown if the key is not ok.
 *
 * Created by Lisa Joanno on 07/02/17.
 */
public class DifferentKeyException extends Exception {
    public DifferentKeyException() {
        super("You used a different key.");
    }
}
