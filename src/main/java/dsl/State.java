package dsl;

/**
 * la liste des états possibles pour les items
 * Created by lisa on 01/01/17.
 */
public enum State {
    ON, OFF;

    private State state;

    public void changeState() {
        if (state == ON)
            state = OFF;
        else state = ON;
    }

}
