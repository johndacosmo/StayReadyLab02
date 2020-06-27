package com.codedifferently;

import org.junit.Assert;

public class CoreFeaturesTest {

    public static void main(String[] args) {
        // uncomment the tesr to run they work independent of each other
        // but look at the test methods to see what you have to input
        // addTest();
        // subTest();
        // mulTest();
        // divTest();
        // expTest();
        // sqTest();
        // sqrtTest();
        // invsTest();
        // invtTest();

    }

    public static void addTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(40);
        double expectedVal = 60;

        // When
        // in the method input value for the number is 20
        double actualVal = testCoreFeatures.add();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {

            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void subTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(40);
        double expectedVal = 20;

        // When
        // in the method input value for the number is 20
        double actualVal = testCoreFeatures.sub();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void mulTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(40);
        double expectedVal = 80;

        // When
        // in the method input value for the number is 2
        double actualVal = testCoreFeatures.mul();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void divTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(40);
        double expectedVal = 20;

        // When
        // in the method input value for the number is 2
        double actualVal = testCoreFeatures.div();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void expTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(4);
        double expectedVal = 16;

        // When
        // in the method input value for the number is 2
        double actualVal = testCoreFeatures.exp();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void sqTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(2);
        double expectedVal = 4;

        // When
        double actualVal = testCoreFeatures.sq();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");
        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void sqrtTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(4);
        double expectedVal = 2;

        // When
        double actualVal = testCoreFeatures.sqrt();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");

        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

    public static void invsTest() {

        int count = 0;
        double expectedVal = 0;
        double actualVal = 0;
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();

        // to see if the function catches divison by 0
        while (count < 2) {

            if (count == 0) {
                // current value is 0
                // Given
                testScical.setCurrentVal(count);
                expectedVal = 0;

                // When
                actualVal = testCoreFeatures.invs();

            } else {
                // current value is 4
                // Given
                testScical.setCurrentVal(4);
                expectedVal = .25;

                // When
                actualVal = testCoreFeatures.invs();

            }

            // Then
            if (expectedVal == actualVal) {
                System.out.println("");
                System.out.println("Pass");
                System.out.println("");

            } else {
                System.out.println("failed" + testScical.getCurrentVal());

            }
            count++;
        }
    }

    public static void invtTest() {

        // Given
        SciCalculator testScical = new SciCalculator();
        CoreFeatures testCoreFeatures = new CoreFeatures();
        Input testInput = new Input();
        testScical.setCurrentVal(4);
        double expectedVal = -4;

        // When
        double actualVal = testCoreFeatures.invt();

        // Then
        if (expectedVal == actualVal) {
            System.out.println("");
            System.out.println("Pass");
            System.out.println("");

        } else {
            System.out.println("failed" + testScical.getCurrentVal());

        }

    }

}