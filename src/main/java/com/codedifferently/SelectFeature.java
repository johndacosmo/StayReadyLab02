package com.codedifferently;

public class SelectFeature {

    public static void listOptions() {

        String addDes = "Add - Allows you to enter a number. The number you enter is then added to the current value on display.";
        DisplayMode.display(addDes);
        String subDes = "Sub - Allows you to enter a number. The number you enter is then subtracted from the current value on display.";
        DisplayMode.display(subDes);
        String mulDes = "Mul - Allows you to enter a number. The current value on display is then multiplied by the number you entered.";
        DisplayMode.display(mulDes);
        String divDes = "Div - Allows you to enter a number. The current value on display is then divided by the number you entered.";
        DisplayMode.display(divDes);
        String sq = "Sq - Squares the current value on display.";
        DisplayMode.display(sq);
        String sqrt = "Sqrt - Takes the square root of the current value on display.";
        DisplayMode.display(sqrt);
        String exp = "Exp - Allows you to enter a number. The current value on display is then rasied to that power.";
        DisplayMode.display(exp);
        String insv = "Insv - Calculates the inverse of the current value on display.";
        DisplayMode.display(insv);
        String invt = "Invt - Changes sign of the current value on display.";
        DisplayMode.display(invt);
        String clr = "Clr - Clears display and resets the current value on Display to 0.";
        DisplayMode.display(clr);
        String switchDisplay = "Swd - Changes the the number system to octal, hexadecimal, binary, or decimal.";
        DisplayMode.display(switchDisplay);
        String ma = "Madd - Adds the current value on the display to the value stored in memory.";
        DisplayMode.display(ma);
        String mrc = "Mrc - Recalls the current value from memory to the display.";
        DisplayMode.display(mrc);
        String mc = "Mc - Resets memory.";
        DisplayMode.display(mc);
        String trigU = "TrigU - Switchs unit trig values are displayed in.";
        DisplayMode.display(trigU);
        String sine = "Sin - Calculates the sine of the displayed value and displays it.";
        DisplayMode.display(sine);
        String coSine = "Cos - Calculate the cosine of the displayed value and displays it.";
        DisplayMode.display(coSine);
        String tangent = "Tan - Calculates the tangent of the displayed value and displays it.";
        DisplayMode.display(tangent);
        String arcSin = "Arcsin - Calculates the arcsine of the displayed value and displays it.";
        DisplayMode.display(arcSin);
        String arcCos = "Arccos - Calculate the cosine of the displayed value and displays it.";
        DisplayMode.display(arcCos);
        String arcTan = "ArcTan - Calculates the arctangent of the displayed value and displays it.";
        DisplayMode.display(arcTan);
        String isEven = "Even - Tells you if current value is even or odd.";
        DisplayMode.display(isEven);
        String isPrime = "prime - tells if the value in front of the decimal is not prime.";
        DisplayMode.display(isPrime);

    }

    public static void selFeature(String selection) {

        if (selection.equals("ls")) {

            listOptions();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("add")) {

            String out = String.valueOf(CoreFeatures.add());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("sub")) {

            String out = String.valueOf(CoreFeatures.sub());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("mul")) {

            String out = String.valueOf(CoreFeatures.mul());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("div")) {

            String out = String.valueOf(CoreFeatures.div());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("sq")) {

            String out = String.valueOf(CoreFeatures.sq());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("sqrt")) {

            String out = String.valueOf(CoreFeatures.sqrt());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("exp")) {

            String out = String.valueOf(CoreFeatures.exp());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("insv")) {

            String out = String.valueOf(CoreFeatures.invs());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("invt")) {

            String out = String.valueOf(CoreFeatures.invt());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("clr")) {

            CoreFeatures.clear();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("swd")) {

            DisplayMode.switchDisplayMode();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("madd")) {

            Memory.memAdd();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("trigu")) {

            TrigFunctions.switchUnitMode();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("mrc")) {

            String out = String.valueOf(Memory.getMem());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("mc")) {

            Memory.memRest();
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("sin")) {

            String out = String.valueOf(TrigFunctions.sine());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("cos")) {

            String out = String.valueOf(TrigFunctions.cosine());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("tangent")) {

            String out = String.valueOf(TrigFunctions.tangent());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("arcsin")) {

            String out = String.valueOf(TrigFunctions.invereSine());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("arccos")) {

            String out = String.valueOf(TrigFunctions.inverseCosine());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("arctan")) {

            String out = String.valueOf(TrigFunctions.inverseTangent());
            DisplayMode.display("Current Value--->      " + out);
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("even")) {

            CoreFeatures.isEven();
            DisplayMode.display("Current Value--->      " + SciCalculator.getCurrentVal());
            Input.setInput();
            selFeature(Input.getInput());

        } else if (selection.equals("prime")) {

            CoreFeatures.isPrime();
            DisplayMode.display("Current Value--->      " + SciCalculator.getCurrentVal());
            Input.setInput();
            selFeature(Input.getInput());

        } else {

            CoreFeatures.err(1);
            selFeature(Input.getInput());

        }

    }

}