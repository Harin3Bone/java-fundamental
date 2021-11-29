package operator;

public class Conditional {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It's not an Alien!");
            System.out.println("Absolutely NOT!");
        }

        boolean isItAlien = false;
        if (isItAlien == true)
            System.out.println("I am Alien!");

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        int thirdTopScore = 79;
        if ((topScore > thirdTopScore) || (topScore < 100)) {
            System.out.println("Greater than third top score or less than 100");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("newValue is Equal 50");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operator Challenge
        /*
         * 1. Create a double variable with a value of 20.00
         * 2. Create a second variable of type double with the value 80.00
         * 3. Add both numbers together and multiply by 100.00
         * 4. Use the remainder operator to figure out what the remainder from the
         * result of the operation in step 3 and 40.00
         * We used the modulus or remainder operator on ints in the course,
         * but we can also use it on a double
         * 5. Create a boolean variable that assigns the value true
         * if the remainder in #4 in 0, or false if its not zero
         * 6. Output the boolean variable.
         * 7. Write an if-then statement that displays a message "Got some remainder"
         * if the boolean in step 5 is not true.
         * Don't be surprised if you see output for this step, Where you might expect
         * it not to show
         */
    }
}
