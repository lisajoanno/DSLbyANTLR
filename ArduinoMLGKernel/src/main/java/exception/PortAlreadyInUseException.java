package exception;

/**
 * Created by user on 07/02/17.
 */
public class PortAlreadyInUseException extends RuntimeException {
    public PortAlreadyInUseException(String brickName,int portNumber){
        super("Pin "+portNumber+" for brick "+brickName+" is already in use");
    }
}
