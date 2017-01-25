package dsl;

/**
 * Name of a macro in a score, to be replaced by its notes during printing.
 *
 * Created by Lisa Joanno on 25/01/17.
 */
public class MacroName extends ScoreItem {
    String name;

    public MacroName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Insérer ici les notes de [" + name + "]";
    }
}
