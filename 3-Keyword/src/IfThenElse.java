public class IfThenElse {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        // if (score == 5000) {
        // System.out.println("Your score was 5000");
        // } else if (score < 1000) {
        // System.out.println("Your score was less than 1000");
        // } else {
        // System.out.println("Got there");
        // }

        if (gameOver == true) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        score = 10_000;
        levelComplete = 8;
        bonus = 200;

        if (newGameOver == true) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
