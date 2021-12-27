package exercises;

public class EqualityPrinter {

    public static void main(String[] args) {

        /*
         * Write a method printEqual with 3 parameters of type int. The method should
         * not return anything (void)
         * 
         * If one of the parameters is less than 0, print text "Invalid Value".
         * 
         * If all numbers are equal print text "All numbers are equal"
         * 
         * If all numbers are different print text "All numbers are different".
         * 
         * Otherwise print "Neither all are equal or different".
         */

        /*
         * Test Case
         * printEqual(1,1,1) -> All numbers are equal
         * printEqual(1,1,2) -> Neither all are equal or different
         * printEqual(-1,-1,-1) -> Invalid Value
         * printEqual(1,2,3) -> All numbers are different
         */

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        boolean invalid = x < 0 || y < 0 || z < 0;
        boolean xy = x == y;
        boolean xz = x == z;
        boolean yz = y == z;

        if (xy && xz && yz && !invalid) {
            System.out.println("All numbers are equal");
        } else if (!xy && !xz && !yz && !invalid) {
            System.out.println("All numbers are different");
        } else if (!invalid) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
