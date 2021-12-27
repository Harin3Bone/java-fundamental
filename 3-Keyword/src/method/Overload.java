package method;

import java.text.DecimalFormat;

public class Overload {

    public static void main(String[] args) {
        int newScore = calculateScore("Eli", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();

        double a = calcFeetAndInchesToCentimeters(6, 0);
        double b = calcFeetAndInchesToCentimeters(7, 5);
        double c = calcFeetAndInchesToCentimeters(-3, -7);
        double d = calcFeetAndInchesToCentimeters(8, 4);
        double e = calcFeetAndInchesToCentimeters(157);
        System.out.println("6 feet, 0 inches = " + a + " centimeters");
        System.out.println("7 feet, 5 inches = " + b + " centimeters");
        System.out.println("-3 feet, -7 inches = " + c + " centimeters");
        System.out.println("8 feet, 4 inches = " + d + " centimeters");
        System.out.println("0 feet, 157 inches = " + d + " centimeters");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player" + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player No score");
        return 0;
    }

    /*
     * Create a method called calcFeetAndInchesToCentimeters
     * It needs to have two parameters.
     * feet is the first parameter, inches is the 2nd parameter
     * 
     * You should validate that the first parameter feet is >= 0
     * You should validate that the 2nd parameter inches is >= 0 and <= 12
     * return -1 from the method if either of the above is not true
     * 
     * If the parameters are valid, then calculate how many centimeters
     * comprise the feet and inches passed to this method and return that value.
     * 
     * Create a 2nd method of the same name but with only one parameter
     * inches is the parameter
     * validate that it is >= 0
     * return -1 if it is not true
     * 
     * But if it is valid, then calculate how many feet are in the inches
     * and then here is the tricky part
     * 
     * call the other overloaded method passing the correct feet and inches
     * calculated so that it can calculate correctly
     */

    /*
     * Hint
     * 1. Use double for your number data types is probably a good idea
     * 2. 1 inch = 2.54cm
     * 3. 1 foot = 12 inches
     */

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double ret = -1;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            ret = calcFeetAndInchesToCentimeters(feet * 12) + calcFeetAndInchesToCentimeters(inches);
        }

        return ret;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }
}