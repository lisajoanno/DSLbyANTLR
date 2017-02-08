package dsl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11/01/17.
 */
public class Transition {
    private List<Condition> conditions;
    private State target;

    public Transition() {
        conditions = new ArrayList<>();
    }

    public Transition(List<Condition> conditions, State target) {
        this.conditions = conditions;
        this.target = target;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public State getTarget() {
        return target;
    }

    public void setTarget(State target) {
        this.target = target;
    }

    public void addCondition(Condition c){
        conditions.add(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tif(");
        sb.append("\t");
        for(int i = 0; i < conditions.size(); i++){

            sb.append(conditions.get(i).toString());
            if(i < conditions.size() - 1)
                sb.append(" && ");
        }
        sb.append(" && guard");
        sb.append("){\n");
        sb.append("\t\tacted =false;");
        sb.append("time = millis();");
        sb.append("state_"+target.getName()+"();\n");
        sb.append("\t}");

        return sb.toString();
    }
}
