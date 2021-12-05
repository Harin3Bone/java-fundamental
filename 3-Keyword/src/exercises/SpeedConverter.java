package exercises;

public class SpeedConverter {

    /*
     * 1. Write a method called toMilesPerHour that has 1 parameter of type double
     * with the name
     * kilometersPerHour. This method needs to return the rounded value of the
     * calculation of type long.
     * 
     * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
     * needs to return -1 to indicate an invalid value.
     * 
     * Otherwise if it is positive calculate the value of miles per hour, round it
     * and return it. For conversion and rounding.
     */

    /*
     * Test Case [toMilesPerHour]
     * toMilesPerHour(1.5); -> should return 1
     * toMilesPerHour(10.25); -> should return 6
     * toMilesPerHour(-5.6); -> should return -1
     * toMilesPerHour(25.42); -> should return 16
     * toMilesPerHour(75.114); -> should return 47
     */

    /*
     * Write another method called printConversion with 1 parameter of type double
     * with the name kilometersPerHour.
     * 
     * This method should not return anything (void) and it needs to calculate
     * milesPerHour from the kilometersPerHour parameter.
     * 
     * The it needs to print a message in the format "XX km/h = YY mi/h".
     * 
     * XX represents the original value kilometers per hour.
     * YY represents the rounded milesPerHour from the kilometersPerHour parameter.
     * 
     * If the parameter kilometersPerHour is < 0 then print the text
     * "Invalid Value".
     */

    /*
     * Test Case [printConversion]
     * printConversion(1.5) should print 1.5 km/h = 1 mi/h
     * printConversion(10.25) should print 10.25 km/h = 6 mi/h
     * printConversion(-5.6) should print Invalid Value
     * printConversion(25.42) should print 25.42 km/h = 16 mi/h
     * printConversion(75.114) should print 75.114 km/h = 47 mi/h
     */

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0.00);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long toMilesPerHour = -1;

        if (kilometersPerHour >= 0) {
            toMilesPerHour = Math.round(kilometersPerHour / 1.609);
        }

        return toMilesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
