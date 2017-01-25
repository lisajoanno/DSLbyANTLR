package dsl;

/**
 * Created by user on 25/01/17.
 */
public class LogicalAction extends Action {
    private Actuator actuator;
    private BinaryState binaryState;

    public LogicalAction(Actuator actuator, BinaryState binaryState) {
        this.actuator = actuator;
        this.binaryState = binaryState;
    }

    public LogicalAction() {
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
