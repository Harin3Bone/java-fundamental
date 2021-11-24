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
    }
}
