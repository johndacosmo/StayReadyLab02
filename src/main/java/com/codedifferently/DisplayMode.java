package com.codedifferently;

public class DisplayMode {

    private static String whichMode = "Decimal";

    public static void switchDisplayMode() {

        DisplayMode.display("Enter \"Oct\", \"deci\", \"bi\" or \"hdeci\".");

        Input.setInput();

        if (Input.getInput().equals("bi")) {

            DisplayMode.display("Current mode is -->     " + switcDisplayMode("Binary"));

        } else if (Input.getInput().equals("deci")) {

            DisplayMode.display("Current mode is -->     " + switcDisplayMode("Decimal"));

        } else if (Input.getInput().equals("hdeci")) {

            DisplayMode.display("Current mode is -->     " + switcDisplayMode("Hexadecimal"));

        } else if (Input.getInput().equals("oct")) {

            DisplayMode.display("Current mode is -->     " + switcDisplayMode("Octal"));

        } else {

            CoreFeatures.err(1);

        }
    }

    private static String switcDisplayMode(String wMode) {

        whichMode = wMode;

        return whichMode;
    }

    public static void display(String output) {

        System.out.println(output);

    }

    public String getMode() {

        return whichMode;
    }

}