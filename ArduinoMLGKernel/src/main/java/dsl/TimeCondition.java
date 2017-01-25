package dsl;

/**
 * Created by user on 25/01/17.
 */
public class TimeCondition extends Condition {
    private long waitTime;


    public String toString(){
        return "(millis() - time) >= "+waitTime+" ";
    }

    public long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }
}
