package dsl.enums;

import dsl.exceptions.ColorDoesntExistException;

/**
 * Possible colors to be displayed on RGB screen.
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

    /**
     * Returns a Color from the String in parameters or an exception if it does not exist.
     * @param s the String to convert into Color
     * @return a Color
     * @throws ColorDoesntExistException if the color does not exist.
     */
    public static Color getTheColor(String s) throws ColorDoesntExistException {
        for (Color c : values()) {
            if (c.colorName.equals(s)) return c;
        }
         throw new ColorDoesntExistException();
    }


}
