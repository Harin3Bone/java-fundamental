package method;

public class SecondAndMinute {

    private static final String INVALID_VALUE_MSG = "Invalid value";

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

        System.out.println(getDurationString(60, 0));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(80, 24));
        System.out.println(getDurationString(-4, 2));
        System.out.println(getDurationString(73910));
        System.out.println(getDurationString(-548));
    }

    public static String summaryDuration(long hours, long minutes, long seconds) {
        String strHour = hours < 10 ? "0" + hours : String.valueOf(hours);
        String strMinute = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
        String strSecond = seconds < 10 ? "0" + seconds : String.valueOf(seconds);

        return strHour + "h " + strMinute + "m " + strSecond + "s";
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MSG;
        }

        long hours = minutes / 60;
        long newMinute = minutes % 60;

        return summaryDuration(hours, newMinute, seconds);
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MSG;
        }

        long minutes = seconds / 60;
        long newSeconds = seconds % 60;

        return getDurationString(minutes, newSeconds);
    }
}
