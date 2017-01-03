package dsl;

/**
 * fait qqchose
 * amene qqchose d'un point A à un point B
 * Created by lisa on 01/01/17.
 */
public class Action {

    private Item itemSrc;
    private State stateSrc;

    private Item itemDest;
    private State stateDest;

    public Action(Item itemSrc, State stateSrc, Item itemDest, State stateDest) {
        this.itemSrc = itemSrc;
        this.stateSrc = stateSrc;
        this.itemDest = itemDest;
        this.stateDest = stateDest;
    }

    public Action() {
    }


    public Item getItemSrc() {
        return itemSrc;
    }

    public void setItemSrc(Item itemSrc) {
        this.itemSrc = itemSrc;
    }

    public State getStateSrc() {
        return stateSrc;
    }

    public void setStateSrc(State stateSrc) {
        this.stateSrc = stateSrc;
    }

    public Item getItemDest() {
        return itemDest;
    }

    public void setItemDest(Item itemDest) {
        this.itemDest = itemDest;
    }

    public State getStateDest() {
        return stateDest;
    }

    public void setStateDest(State stateDest) {
        this.stateDest = stateDest;
    }
}
