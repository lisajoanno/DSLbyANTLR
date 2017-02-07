package exception;

/**
 * Created by user on 07/02/17.
 */
public class StateNotFoundException extends RuntimeException {
    public StateNotFoundException(String stateName){
        super("State "+stateName+" not found");
    }
}
