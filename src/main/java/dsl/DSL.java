package dsl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by user on 01/01/17.
 */
public class DSL {
    //private Init initialisation;
    private List<Action> actions;

    private List<Item> items;

    public DSL() {
        actions = new ArrayList<>();
        items = new ArrayList<>();
    }


    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Item getItemFromName(String name) {
        for (Item i : items) {
            if (i.getItemName().equals(name)) return i;
        }
        return null;
    }

    public String toString() {
        String res = "";
        res += "ITEMS : \n";
        for (Item i : items) res += "\t"+i.getItemName() + " : " + i.getCurrentState();
        res += "\nACTIONS : \n";
        for (Action a : actions) res += "\t"+a.getItem().getItemName() + " : " + a.getItem().getCurrentState() + " -> " + a.getNextState();

        return res;
    }
}
