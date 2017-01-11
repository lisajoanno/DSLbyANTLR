package dsl;

import dsl.enums.Color;
import dsl.exceptions.MacroDoesntExistException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisa on 11/01/17.
 */
public class Musical {
    private Color color;
    private int screenPin;
    private int buzzerPin;

    private List<Macro> macros;
    // liste soit de macro soit de notes
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

    public int getBuzzerPin() {
        return buzzerPin;
    }

    public void setBuzzerPin(int buzzerPin) {
        this.buzzerPin = buzzerPin;
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
                "The pin of the buzzer : " + buzzerPin + "\n\n" +
                "Your macros : \n\n";

                for (int i = 0; i<macros.size(); i++) {
                    res += macros.get(i);
                }
        res += "\n\n\n\n\n";
        res += "The main score : \n\n";
        for (int j = 0; j<mainScore.size(); j++) {
            res += mainScore.get(j) + "\n";
        }
        return res;
    }
}
