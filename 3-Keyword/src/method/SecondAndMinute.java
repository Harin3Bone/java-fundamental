package method;

public class SecondAndMinute {

    public static void main(String[] args) {
        /*
         * Create a method called getDurationString with two parameters
         * first parameter is minutes
         * second parameter is seconds.
         * 
         * You should validate that the first parameter minute is >= 0
         * And validate second parameter is >= 0 and <= 59
         * 
         * If it is valid, then calculate how many minutes are in the seconds value
         * and then call the other overload method passing the correct minutes
         * and seconds calculated so that it can calculate correctly
         */

        /*
         * Hint
         * 1. Use int or long for your number data types
         * 2. 1 minute = 60 seconds
         * 3. 1 hour = 60 minutes // 3600 seconds
         */

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || (seconds <= 0 && seconds >= 59)) {
            return "Invalid value";
        }

        int newSecond = (minutes * 60) + seconds;
        int hours = newSecond / 3600;

        return hours + "h" + minutes + "m" + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        int hours = seconds / 3600;
        int minutes = seconds / 60;
        return hours + "h" + minutes + "m" + seconds + "s";
    }
}
