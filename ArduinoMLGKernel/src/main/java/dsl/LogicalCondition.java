package dsl;

/**
 * Created by user on 25/01/17.
 */
public class LogicalCondition extends Condition {
    private Sensor sensor;
    private BinaryState binaryState;

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public BinaryState getBinaryState() {
        return binaryState;
    }

    public void setBinaryState(BinaryState binaryState) {
        this.binaryState = binaryState;
    }

    public String toString(){
        return " digitalRead("+sensor.getPin()+") == "+binaryState+" ";
    }
}
