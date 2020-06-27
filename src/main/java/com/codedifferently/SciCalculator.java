package com.codedifferently;

/**
 * Hello world!
 *
 */
public class SciCalculator {
    private static double currentValue = 0.0;

    public static void main(String[] args) {

        String welcome = "Welcome to SciCalculator! Type \"ls\" to display my Features. ";
        DisplayMode.display(welcome);
        Input.setInput();
        SelectFeature.selFeature(Input.getInput());

    }

    public static void setCurrentVal(double val) {

        currentValue = val;

    }

    public static double getCurrentVal() {

        return currentValue;
    }

}
