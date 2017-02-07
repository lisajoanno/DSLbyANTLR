package exception;

import dsl.Brick;

/**
 * Created by user on 07/02/17.
 */
public class BrickNotFoundException extends RuntimeException {
    public BrickNotFoundException(String brickName){
        super("Brick "+brickName+" is not found");
    }
}
