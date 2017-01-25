package dsl;

import dsl.enums.Color;
import dsl.exceptions.MacroDoesntExistException;

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
        String res = "Musical \n\n" +
                "The color used : " + color + "\n" +
                "The pin of the screen : " + screenPin + "\n" +
                "The pin of the speaker : " + speakerPin + "\n\n" +
                "Your macros : \n\n";

        for (Macro macro : macros) {
            res += macro;
        }
        res += "\n\n\n\n\n";
        res += "The main score : \n\n";
        for (ScoreItem aMainScore : mainScore) {
            try {
                //res += mainScore.get(j) + "\n";
                String macroName = ((MacroName) aMainScore).name;
                res += getMacroFromMacrosList(macroName);
            } catch (Exception e) {
                res += aMainScore + "\n";
            }
        }
        return res;
    }
}
