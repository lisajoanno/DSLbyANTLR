package dsl;

/**
 * Created by Lisa Joanno on 25/01/17.
 */
public class MacroName extends ScoreItem {
    public MacroName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String toString() {
        return "Insérer ici les notes de [" + name + "]";
    }
}
