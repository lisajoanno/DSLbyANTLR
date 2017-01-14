package dsl;

/**
 * Created by user on 11/01/17.
 */
public abstract class Brick {
    private String name;
    private int pin;
    public Brick(){

    }
    public Brick(String name, int pin){
        this.name = name;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
