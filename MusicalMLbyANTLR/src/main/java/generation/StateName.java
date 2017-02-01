package generation;

/**
 * pa très très bo
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
