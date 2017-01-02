package dsl;

/**
 * fait qqchose
 * amene qqchose d'un point A à un point B
 * Created by lisa on 01/01/17.
 */
public class Action {
    public Action(Item item) {
        this.item = item;
    }

    public Action(Item item, State nextState) {
        this.item = item;
        this.nextState = nextState;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    private Item item;
    private State nextState;
}
