public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelComplete, bonus);

        calculateScore(true, 10_000, 8, 200);

        int finalScore = calculateScoreRet(true, 20_000, 2, 200);
        System.out.println("Return finalScore is = " + finalScore);

        /*
         * Challenge
         * Create a method called displayHighScorePosition
         * it should a players name as a parameter, and a 2nd parameter as a position in
         * the high score table
         * You should display the players name along with a message like
         * " managed to get into position " and the
         * position they got and a further message " on the high score table".
         * 
         * Create a 2nd method called calculateHighScorePosition
         * it should be sent one argument only,
         * the player score it should return an int
         * the return data should be
         * 1 if the score is >= 1000
         * 2 if the score is >= 500 and < 1000
         * 3 if the score is >= 100 and < 500
         * 4 in all other cases
         * call both methods and display the result of the following
         * a score of 1500, 900, 400 and 50
         */
        displayHighScorePosition("BotA", calculateHighScorePosition(1500));
        displayHighScorePosition("BotB", calculateHighScorePosition(900));
        displayHighScorePosition("BotC", calculateHighScorePosition(400));
        displayHighScorePosition("BotD", calculateHighScorePosition(90));
    }

    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreRet(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
