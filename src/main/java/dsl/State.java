package dsl;

import java.util.ArrayList;
import java.util.List;

/**
 * la liste des états possibles pour les items
 * Created by lisa on 01/01/17.
 */
public class State {
    private String name;
    private List<Action> actions;
    private List<Transition> transitions;

    public State(String name) {
        this.name = name;
        actions = new ArrayList<>();
        transitions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

    public void addAction(Action a){
        actions.add(a);
    }

    public void addTransition(Transition t){
        transitions.add(t);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("void state_"+name+"(){\n");
        for(Action action:actions){
            sb.append(action.toString());
        }
        sb.append("boolean guard = millis() - time > debounce; \n");
        for(int i = 0; i < transitions.size(); i++){
            sb.append(transitions.get(i).toString());
            if(i < transitions.size() - 1)
                sb.append("else ");
        }
        sb.append(" else { \n");
        sb.append("state_"+name+"();\n");
        sb.append("}\n}\n");
        return sb.toString();
    }
}
