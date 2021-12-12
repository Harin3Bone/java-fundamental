package exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        /*
         * We'll say that a number is "teen" if it is in the range 13 - 19 (inclusive)
         * 
         * Write a method named hasTeen with 3 parameters of type int.
         * 
         * The method should return boolean and it needs to return true if one of the
         * parameters is in range 13(inclusive) - 19(inclusive)
         * 
         * Otherwise return false.
         */

        /*
         * Test case
         * hasTeen (9, 99, 19) -> true
         * hasTeen (23, 15, 42) -> true
         * hasTeen (22, 23, 34) -> false
         */

        var x = hasTeen(9, 99, 19);
        var y = hasTeen(23, 15, 42);
        var z = hasTeen(22, 23, 34);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
