package com.codedifferently;

import java.lang.Double;
import java.lang.Math;

public class TrigFunctions {

    private static String selMode = "Degrees";

    public static void switchUnitMode() {

        DisplayMode.display("Enter \"deg\" or \"rad\" to switch the representation of Trig Data.");

        Input.setInput();

        if (Input.getInput().equals("rad")) {

            DisplayMode.display("Current mode is -->     " + switchUnitMoce("Radians"));

        } else if (Input.getInput().equals("deg")) {

            DisplayMode.display("Current mode is -->     " + switchUnitMoce("Degress"));

        } else {

            CoreFeatures.err(1);

        }

    }

    private static String switchUnitMoce(String seMode) {

        selMode = seMode;

        return selMode;
    }

    public static double sine() {

        double check = Math.sin(SciCalculator.getCurrentVal());
        trigErr(check);

        return SciCalculator.getCurrentVal();
    }

    public static double cosine() {

        double check = Math.cos(SciCalculator.getCurrentVal());
        trigErr(check);
        return SciCalculator.getCurrentVal();
    }

    public static double tangent() {

        double check = Math.tan(SciCalculator.getCurrentVal());
        trigErr(check);

        return SciCalculator.getCurrentVal();
    }

    public static double invereSine() {

        double check = Math.asin(SciCalculator.getCurrentVal());
        trigErr(check);

        return SciCalculator.getCurrentVal();
    }

    public static double inverseCosine() {

        double check = Math.acos(SciCalculator.getCurrentVal());
        trigErr(check);

        return SciCalculator.getCurrentVal();
    }

    public static double inverseTangent() {

        double check = Math.atan(SciCalculator.getCurrentVal());
        trigErr(check);

        return SciCalculator.getCurrentVal();
    }

    private static void trigErr(double check) {

        if (Double.isNaN(check) == true) {

            CoreFeatures.err(3);

        } else {

            SciCalculator.setCurrentVal(check);
        }

    }

}