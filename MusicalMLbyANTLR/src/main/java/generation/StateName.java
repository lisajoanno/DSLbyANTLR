package generation;

/**
 * Current state to be written.
 *
 * For example :
 *
 *       state s0 {
 *           ...
 *           ... => s1
 *       }
 *
 * Created by Lisa Joanno on 25/01/17.
 */
public class StateName {
    public static int currentState = 0;
    public static int oldState = 0;

    public static int getCurrentStateAndUse() {
        oldState = currentState;
        currentState ++;
        return oldState;
    }
}
