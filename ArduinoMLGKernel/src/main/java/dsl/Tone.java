package dsl;

/**
 * Created by user on 25/01/17.
 */
public class Tone extends Action {
    private long frequency;
    private long length;
    private Speaker speaker;

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String toString(){
        return "tone("+speaker.getPin()+","+frequency+","+length+");\n";
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
