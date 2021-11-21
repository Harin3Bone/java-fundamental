public class Variable {
    public static void main(String[] args) {
        System.out.println("Variable project");

        int myFirstNumber = (10 + 5) + (2 * 10);

        // Challenge 1: Print Variable
        System.out.println(myFirstNumber);

        // Challenge 2: Expression

        // Create additional variables
        // Declare the following variables and add to our program.
        // mySecondNumber which is an int and assign a value of 12 to it.
        // myThirdNumber, also an int with a value of 6.
        // Put the declaration statements above the System.out.println
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        // Challenge 3: Final Variable

        // Create a new variable call myLastOne
        // We want the value to be 1000 less the current value of myTotal
        // The data type is an int
        // Print out the value of myLastOne

        // Hint: Use another operator that we haven't actually used before, but should
        // be easy to figure out if you think about it for a bit.
        final int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
