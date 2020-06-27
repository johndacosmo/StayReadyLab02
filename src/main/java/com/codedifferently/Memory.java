package com.codedifferently;

public class Memory {

    private static double memStor = 0.0;

    public static void memAdd() {

        memStor = SciCalculator.getCurrentVal() + memStor;
        DisplayMode.display("Memory Value--->      " + getMem());

    }

    public static void memRest() {

        memStor = 0.0;
        System.out.println("Memory has been reset to 0.");

    }

    public static double getMem() {

        return memStor;
    }

}