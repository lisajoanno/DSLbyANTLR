package dsl;

/**
 * fait qqchose
 * amene qqchose d'un point A à un point B
 * Created by lisa on 01/01/17.
 */
public class Action {
    private Actuator actuator;
    private BinaryState binaryState;

    public Action(Actuator actuator, BinaryState binaryState) {
        this.actuator = actuator;
        this.binaryState = binaryState;
    }

    public Action() {
    }

    public Actuator getActuator() {
        return actuator;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    public BinaryState getBinaryState() {
        return binaryState;
    }

    public void setBinaryState(BinaryState binaryState) {
        this.binaryState = binaryState;
    }

    public String toString(){
        return "digitalWrite("+actuator.getPin()+","+binaryState+");\n";
    }
}
