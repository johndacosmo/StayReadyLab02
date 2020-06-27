package com.codedifferently;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static String strInput = "";
    private static double numInput = 0.0;

    public static void setInput() {

        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter Command below: ");
        strInput = in.nextLine();
        strInput = strInput.toLowerCase();
        System.out.println("");
    }

    public static void setnInput() {
        try {
            Scanner in = new Scanner(System.in);
            numInput = in.nextDouble();
        } catch (InputMismatchException e) {

            CoreFeatures.err(4);
        }

        System.out.println("");
    }

    public static String getInput() {

        return strInput;
    }

    public static double getnInput() {

        return numInput;
    }

}