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

    public void setMacros(List<Macro> macros) {
        this.macros = macros;
    }

    public List<ScoreItem> getMainScore() {
        return mainScore;
    }

    public void setMainScore(List<ScoreItem> mainScore) {
        this.mainScore = mainScore;
    }

    public Macro getMacroFromMacrosList(String macroName) throws MacroDoesntExistException {
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

                for (int i = 0; i<macros.size(); i++) {
                    res += macros.get(i);
                }
        res += "\n\n\n\n\n";
        res += "The main score : \n\n";
        for (int j = 0; j<mainScore.size(); j++) {
            try {
                //res += mainScore.get(j) + "\n";
                String macroName = ((MacroName) mainScore.get(j)).name;
                res += getMacroFromMacrosList(macroName);
            } catch (Exception e) {
                res += mainScore.get(j) + "\n";
            }
        }
        return res;
    }
}
