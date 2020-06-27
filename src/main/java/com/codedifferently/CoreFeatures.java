package com.codedifferently;

import java.lang.Math;

public class CoreFeatures {

    public static double add() {

        System.out.println("Enter the number would like to add to the current value: " + SciCalculator.getCurrentVal());
        Input.setnInput();
        SciCalculator.setCurrentVal(SciCalculator.getCurrentVal() + Input.getnInput());

        return SciCalculator.getCurrentVal();
    }

    public static double sub() {

        System.out.println(
                "Enter the number would like to subtract from the current value: " + SciCalculator.getCurrentVal());
        Input.setnInput();
        SciCalculator.setCurrentVal(SciCalculator.getCurrentVal() - Input.getnInput());

        return SciCalculator.getCurrentVal();
    }

    public static double mul() {

        System.out
                .println("Enter the number would like to mutilpy the current value: " + SciCalculator.getCurrentVal());
        Input.setnInput();
        SciCalculator.setCurrentVal(SciCalculator.getCurrentVal() * Input.getnInput());

        return SciCalculator.getCurrentVal();
    }

    public static double div() {

        System.out.println("Enter the number would like to divde the current value: " + SciCalculator.getCurrentVal());
        Input.setnInput();

        if (Input.getnInput() == 0 && (SciCalculator.getCurrentVal() != 0)) {

            err(2);

        } else if (SciCalculator.getCurrentVal() == 0 && Input.getnInput() == 0) {
            SciCalculator.setCurrentVal(0);

        } else {

            SciCalculator.setCurrentVal(SciCalculator.getCurrentVal() / Input.getnInput());
        }

        return SciCalculator.getCurrentVal();
    }

    public static double exp() {

        System.out.println("Enter the number would like to raise the current value: " + SciCalculator.getCurrentVal());
        Input.setnInput();
        SciCalculator.setCurrentVal(Math.pow(SciCalculator.getCurrentVal(), Input.getnInput()));

        return SciCalculator.getCurrentVal();
    }

    public static double sq() {

        SciCalculator.setCurrentVal(Math.pow(SciCalculator.getCurrentVal(), 2));

        return SciCalculator.getCurrentVal();
    }

    public static double sqrt() {

        SciCalculator.setCurrentVal(Math.sqrt(SciCalculator.getCurrentVal()));

        return SciCalculator.getCurrentVal();
    }

    public static double invs() {

        if (SciCalculator.getCurrentVal() == 0) {

            err(2);

        } else {

            SciCalculator.setCurrentVal(1 / SciCalculator.getCurrentVal());
        }

        return SciCalculator.getCurrentVal();
    }

    public static double invt() {

        SciCalculator.setCurrentVal(SciCalculator.getCurrentVal() * -1);

        return SciCalculator.getCurrentVal();
    }

    public static void clear() {

        DisplayMode.display("Current Value--->      " + SciCalculator.getCurrentVal());

    }

    public static void err(int errCode) {

        if (errCode == 1) {

            DisplayMode.display("Err. Your selection is invalid!");
            DisplayMode.display("Enter \"clr\" to clear display and to preform other operation. ");
            Input.setInput();
            while (!Input.getInput().equals("clr")) {

                DisplayMode.display("You must enter \"clr\" to use another feature.");
                Input.setInput();
            }

        } else if (errCode == 2) {

            DisplayMode.display("Err. Divison by \"0\" is not possible.");
            DisplayMode.display("Enter \"clr\" to clear display and to preform other operation. ");
            Input.setInput();
            while (!Input.getInput().equals("clr")) {

                DisplayMode.display("You must enter \"clr\" to use another feature.");
                Input.setInput();
            }

        } else if (errCode == 3) {

            DisplayMode.display("Err. Trig calculation not posibble.");
            DisplayMode.display("Enter \"clr\" to clear display and to preform other operation. ");
            Input.setInput();
            while (!Input.getInput().equals("clr")) {

                DisplayMode.display("You must enter \"clr\" to use another feature.");
                Input.setInput();
            }
        } else if (errCode == 4) {

            DisplayMode.display("Err. You must enter a number.");
            DisplayMode.display("Enter \"clr\" to clear display and to preform other operation. ");
            Input.setInput();
            while (!Input.getInput().equals("clr")) {

                DisplayMode.display("You must enter \"clr\" to use another feature.");
                Input.setInput();
            }

        }

    }

    public static void isEven() {

        if ((SciCalculator.getCurrentVal() % 2) == 0) {

            System.out.println("Current value is even.");
            System.out.println("");

        } else {

            System.out.println("Current value is odd");
            System.out.println("");

        }

    }

    public static void isPrime() {

        int temp = 0;
        int x = (int) (SciCalculator.getCurrentVal() / 2);
        for (int i = 2; i <= x; i++) {

            temp = (int) SciCalculator.getCurrentVal() % i;
            if (temp == 0) {

                System.out.println("Current value is not prime.");
                break;
            }
        }

    }

}