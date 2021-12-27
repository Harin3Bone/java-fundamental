package exercises;

public class PlayingCat {

    public static void main(String[] args) {
        /*
         * The cats spend most of the day playing. In particular, they play if the
         * temperature is between 25
         * and 35 (inclusive). Unless it is summer, then the upper limit is 45
         * (inclusive) instead of 35
         * 
         * Write a method isCatPlaying that has 2 parameters. Method needs to return
         * true if the cat is
         * playing, Otherwise return false
         * 
         * 1st parameter should be of type boolean and be named summer it represent if
         * it is summer
         * 2nd parameter represents the temperature and is of type int with the name
         * temperature.
         */

        /*
         * Test Case
         * 1. isCatPlaying(true, 10) -> false
         * 2. isCatPlaying(false, 36) -> false
         * 3. isCatPlaying(false, 35) -> true
         */

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }
}
