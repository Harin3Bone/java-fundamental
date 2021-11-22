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

        byte myByteValue = 127;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_648L;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Challenge 1:
        // create a byte variable and set it any valid byte number
        // create a short variable and set it any valid short number
        // create a int variable and set it any valid int number
        // create a long variable and make it equal to 50000 plus 10 times the sum of
        // the byte, short and int values.

        byte chByte = 10;
        short chShort = 100;
        int chInt = 1000;
        long chLongTotal = (long) (50000L + 10L * (chByte + chShort + chInt));
        System.out.println("Challenge-1: " + chLongTotal);

    }
}
