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

    public void setKey(String key) {
        this.key = key;
    }

    private String key;


    private List<Macro> macros;
    // ScoreItem -> notes, of a macro name, to be replaced by its notes
    private List<ScoreItem> mainScore;

    public Musical() {
        macros = new ArrayList<>();
        mainScore = new ArrayList<>();
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

    private Macro getMacroFromMacrosList(String macroName) throws MacroDoesntExistException {
        for (Macro m : this.macros) {
            if (m.getMacroName().equals(macroName)) return m;
        }
        throw new MacroDoesntExistException();
    }

    @Override
    public String toString() {
        String res =
                "actuator led : " + screenPin + "\n" +
                "speaker spk : " + speakerPin + "\n" +
                "init: s"+ StateName.currentState+"\n" +
                "serial LOW \n\n";

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

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}
