package dsl;

/**
 * un truc qui a un état, une liste possible d'état et la possibilité de passer d'un état à un autre
 *
 *
 *
 *
 * Created by lisa on 01/01/17.
 */
public class Item {
    public Item(State currentState, String itemName) {
        this.currentState = currentState;
        this.itemName = itemName;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private State currentState;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String itemName;

    public Item(State currentState) {
        this.currentState = currentState;
    }

    public void changeState() {
        currentState.changeState();
    }


}
