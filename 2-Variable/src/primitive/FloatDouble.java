package primitive;

public class FloatDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        // Challenge 2
        // Try to use casting instead of `f` or `d`
        float myFloatValueCast = (float) 5.25;
        double myDoubleValueCast = (double) 5.25;

        int myIntDivValue = 5 / 3;
        float myFloatDivValue = 5f / 3f;
        double myDoubleDivValue = 5.00 / 3.00;
        System.out.println("Int Divide Value: " + myIntDivValue);
        System.out.println("Float Divide Value: " + myFloatDivValue);
        System.out.println("Double Divide Value: " + myDoubleDivValue);

        // Challenge 3
        // Convert a given number of pounds to kilograms
        // Step 1: Create a variable with the appropriate type to store the number of
        // pounds to be converted to kilograms.
        // Step 2: Calculate the result i.e. the number of kilograms based on the
        // contents of the variable above and store the result in a 2nd appropriate
        // variable.
        // Step 3: Print out the result
        // Hint: 1 pound is equal to 0.45359237 of a kilogram.

        double pound = 200d;
        double convertKilograms = pound * 0.45359237;
        System.out.println("Convert kilograms: " + convertKilograms);

        double pi = 3.1415927d;
        double anotherNum = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNum);
    }

}
