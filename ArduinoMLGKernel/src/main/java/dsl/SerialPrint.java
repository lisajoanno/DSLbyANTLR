package dsl;

/**
 * Created by user on 25/01/17.
 */
public class SerialPrint extends Action {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "Serial.println(\"" + text + "\");\n";
    }
}
