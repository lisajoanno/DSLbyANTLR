package exception;

/**
 * Created by user on 07/02/17.
 */
public class PortOutOfRangeException extends RuntimeException {
    public PortOutOfRangeException(String brickName, int portNumber, int min_port, int max_port){
        super("PIN "+brickName+ " for brick "+portNumber+ " is out of range\nrange is ["+min_port+";"+max_port+"]");
    }
}
