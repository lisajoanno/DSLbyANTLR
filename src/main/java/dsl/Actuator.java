package dsl;

/**
 * Created by user on 11/01/17.
 */
public class Actuator extends Brick {

    public String toString(){
        return "pinMode("+getPin()+",OUTPUT);\n";
    }
}
