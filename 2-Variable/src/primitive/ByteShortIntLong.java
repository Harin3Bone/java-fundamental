package primitive;

public class ByteShortIntLong {

    public static void main(String[] args) {
        int myVal = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        // If you use 2_147_483_648 it will show you error because it out of range;
        int myMaxIntTest = 2_147_483_647;
    }
}
