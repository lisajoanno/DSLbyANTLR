package dsl;

import dsl.enums.Color;
import dsl.exceptions.MacroDoesntExistException;
import generation.StateName;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the musical.
 *
 * Contains pins and brick initialization, macros and the score.
 *
 * Created by lisa on 11/01/17.
 */
public class Musical {
    // the display color on the RGB screen
    private Color color;
    // the pin where the screen will be plugged
    private int screenPin;
    // the pin where the buzzer will be plugged
    private int speakerPin;
    // the beat!
    private int bpm;
    // should the rgb screen be activated or not
    private String serial;
    // the keyAlt alterations
    private String keyAlt = "";




    private List<Macro> macros;
    // ScoreItem -> notes, of a macro name, to be replaced by its notes
    private List<ScoreItem> mainScore;

    public Musical() {
        macros = new ArrayList<>();
        mainScore = new ArrayList<>();
    }


    @Override
    public String toString() {
        String res =
                "actuator led : " + screenPin + "\n" +
                        "speaker spk : " + speakerPin + "\n" +
                        "init: s"+ StateName.currentState+"\n" +
                        "serial " + serial + " \n" +
                        "debounce : " + 100 + "\n";

        res += "state s" + StateName.getCurrentStateAndUse() + " {\n";
        res += "\tserialPrint z" + color.getColorName().charAt(0) + " \n";
        res += "\tserialPrint y" + bpm + " \n";
        res += "\twhen " + 0 +" ms elapsed => s"+StateName.currentState + "\n";
        res += "}";

        // soit une note soit une macro
        for (ScoreItem s : mainScore) {
            if (s.getClass() == MacroName.class) {
                try {
                    res += "\n\n" + getMacroFromMacrosList(((MacroName) s).name) + "\n\n";
                } catch (MacroDoesntExistException e) {
                    e.printStackTrace();
                }
            } else {
                res += s.toString() + "";
            }
        }

        // fin --> on crée l'état final
        res += "state s" + StateName.getCurrentStateAndUse() + " {\n";
        res += "}";
        return res;
    }

    private Macro getMacroFromMacrosList(String macroName) throws MacroDoesntExistException {
        for (Macro m : this.macros) {
            if (m.getMacroName().equals(macroName)) return m;
        }
        throw new MacroDoesntExistException();
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getKeyAlt() {
        return keyAlt;
    }

    public void setKeyAlt(String keyAlt) {
        this.keyAlt = keyAlt;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getScreenPin() {
        return screenPin;
    }

    public void setScreenPin(int screenPin) {
        this.screenPin = screenPin;
    }

    public int getSpeakerPin() {
        return speakerPin;
    }

    public void setSpeakerPin(int speakerPin) {
        this.speakerPin = speakerPin;
    }

    public List<Macro> getMacros() {
        return macros;
    }

    public List<ScoreItem> getMainScore() {
        return mainScore;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}
