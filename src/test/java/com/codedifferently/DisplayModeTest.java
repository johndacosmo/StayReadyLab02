package com.codedifferently;

public class DisplayModeTest {

    public static void main(String[] args) {

        // switchDisplayModeTest();
    }

    public static void switchDisplayModeTest() {
        int count = 0;
        String expectedVal = "";
        String actualVal = "";
        DisplayMode displayModeTest = new DisplayMode();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();

        // to see if the function catches divison by 0
        while (count < 5) {

            if (count == 0) {
                // bi is entered as input
                // Given

                expectedVal = "Binary";

                // When
                displayModeTest.switchDisplayMode();
                actualVal = displayModeTest.getMode();

            } else if (count == 1) {
                // deci is entered as input
                // Given

                expectedVal = "Decimal";

                // When
                displayModeTest.switchDisplayMode();
                actualVal = displayModeTest.getMode();

            } else if (count == 2) {
                // hdeci is entered as input
                // Given

                expectedVal = "Hexadecimal";

                // When
                displayModeTest.switchDisplayMode();
                actualVal = displayModeTest.getMode();

            } else if (count == 3) {
                // oct is entered as input
                // Given

                expectedVal = "Octal";

                // When
                displayModeTest.switchDisplayMode();
                actualVal = displayModeTest.getMode();

            } else {
                // Random input is entered as input

                // When
                displayModeTest.switchDisplayMode();
                actualVal = displayModeTest.getMode();
            }

            // Then
            if (expectedVal.equals(actualVal)) {
                System.out.println("");
                System.out.println("Pass");
                System.out.println("");

            } else {
                System.out.println("failed" + displayModeTest.getMode());

            }
            count++;
        }
    }

}