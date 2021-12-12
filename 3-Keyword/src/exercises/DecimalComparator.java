package exercises;

public class DecimalComparator {

    /*
     * Write a method areEqualByThreeDecimalPlaces with Two parameters of type
     * double
     * 
     * The method should return boolean and it needs to return true if two double
     * numbers are the same up to three decimal places Otherwise return false
     * 
     * Test case
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175) -> true
     * areEqualByThreeDecimalPlaces(3.175, -3.176) -> false
     * areEqualByThreeDecimalPlaces(3.0, 3.0) -> true
     * areEqualByThreeDecimalPlaces(-3.123, 3.123) -> false
     */

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, -3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
        areEqualByThreeDecimalPlaces(3.1756, 3.1757);

    }

    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
        return (int) (var1 * 1000) == (int) (var2 * 1000);
    }

}
