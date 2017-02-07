package exception;

/**
 * Created by user on 07/02/17.
 */
public class BrickAlreadyExistsException extends RuntimeException {
    public BrickAlreadyExistsException(String brickName){
        super("Brick "+brickName+" already exists");
    }
}
