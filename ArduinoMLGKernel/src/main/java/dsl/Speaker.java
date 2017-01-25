package dsl;

/**
 * Created by user on 25/01/17.
 */
public class Speaker extends Brick {

    public String toString(){
        return "pinMode("+this.getPin()+", OUTPUT);\n";
    }
}
