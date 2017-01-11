package dsl;

import java.util.List;

/**
 * Macro, for example refrain.
 *
 * Contains a name to be reused later and a list of notes.
 *
 * Extends ScoreItem because it can be a part of the main score.
 *
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
