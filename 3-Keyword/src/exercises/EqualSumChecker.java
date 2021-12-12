package exercises;

public class EqualSumChecker {

    public static void main(String[] args) {
        /*
         * Write a method hasEqualSum with 3 parameters of type int
         * 
         * The method should return boolean and it needs to return true if the sum of
         * the first and second parameter is equal to the third parameter. Otherwise
         * return false.
         */

        /*
         * Test case
         * hasEqualSum(1,1,1) -> false
         * hasEqualSum(1,1,2) -> true
         * hasEqualSum(1,-1,0) -> true
         */
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return (a+b) == c;
    }
}
