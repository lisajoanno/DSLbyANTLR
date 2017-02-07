package dsl;

import java.util.*;

/**
 * Created by user on 01/01/17.
 */
public class DSL {
    private Map<String, Brick> bricks;
    private Map<String, State> states;
    private String initState;
    private boolean serialActivated;
    private int debounce = 100;

    private static int MAX_PORT = 13;
    private static int MIN_PORT = 0;
    private Set<Integer> usedPorts;

   public DSL(){
       bricks = new HashMap<>();
       states = new HashMap<>();
       usedPorts = new HashSet<>();
   }

   public void setDebounce(int debounce){
       this.debounce = debounce;
   }


    public Map<String, Brick> getBricks() {
        return bricks;
    }

    public void setBricks(Map<String, Brick> bricks) {
        this.bricks = bricks;
    }

    public Map<String, State> getStates() {
        return states;
    }

    public void setStates(Map<String, State> states) {
        this.states = states;
    }

    public void addBrick(Brick b){
        String name = b.getName();
        if(bricks.containsKey(name)){
            throw new RuntimeException("BRICKS ALREADY EXISTS");
        }
        int pin = b.getPin();
        if(pin > MAX_PORT || pin < MIN_PORT){
            throw new RuntimeException("PIN "+b.getPin()+ " for brick "+b.getName()+ " is out of range\nrange is["+MIN_PORT+";"+MAX_PORT+"]");
        }
        if(usedPorts.contains(pin)){
            throw new RuntimeException("PIN "+b.getPin()+" for brick "+b.getName()+"IS ALREADY IN USE");
        }
        usedPorts.add(pin);
        bricks.put(name,b);
    }

    public void addState(State s){
        String name = s.getName();
        if(bricks.containsKey(name)){
            throw new RuntimeException("STATE ALREADY EXISTS");
        }
        states.put(name,s);
    }

    public Brick getBrick(String name){
        if(bricks.containsKey(name)){
            return bricks.get(name);
        }
        throw  new RuntimeException("Non existent brick "+name);
    }
    public State getState(String name){
        if(states.containsKey(name)){
            return states.get(name);
        }
        throw new RuntimeException("Non existent state "+name);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("void setup() {\n");
        for(Brick b: bricks.values()){
            sb.append("\t");
            sb.append(b.toString());
        }
        if(serialActivated) {
            sb.append("\tSerial.begin(9600);\n" +
                    "\twhile (!Serial) {\n" +
                    "\t\t; // wait for serial port to connect. Needed for native USB port only\n" +
                    "\t}");
        }
        sb.append("}\n");
        sb.append("bool acted = false;long time = 0; long debounce = "+debounce+";\n");

        for(State s: states.values()){
            sb.append(s.toString());
        }
        sb.append("\n\n\nvoid loop() { state_"+initState+"(); }");
        return sb.toString();
    }

    public void setInitState(String stateName){
        if(states.containsKey(stateName)){
            this.initState = stateName;
        } else {
            throw  new RuntimeException("INITIAL STATE "+stateName+" NOT FOUND");
        }
    }

    public void setSerialActivated(boolean serialActivated) {
        this.serialActivated = serialActivated;
    }

    public boolean isSerialActivated() {
        return serialActivated;
    }
}
