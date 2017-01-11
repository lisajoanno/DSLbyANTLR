package dsl;

import java.util.List;

/**
 * Created by lisa on 11/01/17.
 */
public class Macro extends ScoreItem {
    private String macroName;
    private List<Note> notes;

    public String getMacroName() {
        return macroName;
    }

    public void setMacroName(String macroName) {
        this.macroName = macroName;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        String res =
                "Macro name :" + macroName + '\n';
        for (Note n : notes) {
            res += "\t" + n + "\n";
        }
        return res;
    }
}
