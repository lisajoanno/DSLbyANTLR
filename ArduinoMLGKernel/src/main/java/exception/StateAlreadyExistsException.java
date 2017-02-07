package exception;

/**
 * Created by user on 07/02/17.
 */
public class StateAlreadyExistsException extends RuntimeException {
    public StateAlreadyExistsException(String stateName){
        super("State "+stateName+" already exists");
    }
}
