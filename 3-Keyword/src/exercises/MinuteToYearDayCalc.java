package exercises;

public class MinuteToYearDayCalc {

    public static void main(String[] args) {

        /*
         * Write a method printYearsAndDays with parameter of type long named minutes.
         * 
         * The method should not return anything (void) and it needs to calculate the
         * years and days from the minutes parameter.
         * 
         * If the parameter is less than 0, print text "Invalid Value."
         * 
         * Otherwise, if the parameter is valid then it needs to print a message
         * in the format "XX min = YY y and ZZ d"
         * 
         * XX represents the original value minutes.
         * YY represents the calculated years.
         * ZZ represents the calculated days.
         */

        /*
         * Test Case
         * printYearsAndDays(525600) -> print 525600 min = 1 y and 0 d
         * printYearsAndDays(1051200) -> print 1051200 min = 2 y and 0 d
         * printYearsAndDays(561600) -> print 561600 min = 1 y and 25 d
         */

        /*
         * Hints
         * 1. Be careful about spaces in the printed message.
         * 2. Use the remainder operator
         * 3. 1 hour = 60 minutes
         * 4. 1 day = 24 hours
         * 5. 1 year = 365 days
         */

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes >= 0) {
            long years = ((minutes / 60) / 24) / 365;
            long days = ((minutes / 60) / 24) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
