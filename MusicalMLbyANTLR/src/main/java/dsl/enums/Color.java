package dsl.enums;

/**
 * Possible colors to be displayed on RGB screen.
 *
 * Created by lisa on 11/01/17.
 */
public enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private String colorName;

    Color(String s) {
        this.colorName = s;
    }
}
