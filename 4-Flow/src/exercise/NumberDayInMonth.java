package exercise;

public class NumberDayInMonth {

    public static void main(String[] args) {
        /*
         * Write a method isLeapYear with a parameter of type int named year.
         * 
         * The parameter needs to be greater than or equal to 1 and less than or equal
         * to 9999.
         * 
         * If the parameter is not in that range return false.
         * 
         * Otherwise if it is the valid range. calculate if the year is a leap year and
         * return true if it is otherwise return false.
         * 
         * A year is leap year if it is divisible by 4 but not by 100 or it is divisible
         * by 400.
         */

        /*
         * Test Case
         * isLeapYear(-1600) -> false
         * isLeapYear(1600) -> true
         * isLeapYear(2017) -> false
         * isLeapYear(2000) -> true
         */

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        /*
         * Write another method getDaysInMonth with two parameters month and year.
         * Both of type int.
         * 
         * If the parameter month is < 1 or > 12 return -1
         * If parameter year is < 1 or > 9999 return -1
         * 
         * This method needs to return the number of days in the month. Be careful about
         * leap years they have 29 days in month 2 (February)
         */

        /*
         * Test Case
         * getDaysInMonth(1, 2020) -> 31
         * getDaysInMonth(2, 2020) -> 29
         * getDaysInMonth(2, 2018) -> 28
         * getDaysInMonth(-1, 2020) -> -1
         * getDaysInMonth(1, -2020) -> -1
         */

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year <= 0) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

}