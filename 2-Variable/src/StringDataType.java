public class StringDataType {

    public static void main(String[] args) {
        System.out.println("StringDataType");

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("numberString is equal to " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("lastString is equal to " + lastString);
    }
}
