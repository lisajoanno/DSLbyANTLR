package dsl.enums;

import dsl.exceptions.ColorDoesntExistsException;

/**
 * Possible colors to be displayed on LCD screen.
 *
 * Created by lisa on 11/01/17.
 */
public enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private String colorName;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    Color(String s) {
        this.colorName = s;
    }

    public static Color getTheColor(String s) throws ColorDoesntExistsException {

        for (Color c : values()) {
            if (c.colorName.equals(s)) return c;
        }
         throw new ColorDoesntExistsException();
    }


}
