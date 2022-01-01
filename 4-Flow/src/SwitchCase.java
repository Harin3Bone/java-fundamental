
public class SwitchCase {

    public static void main(String[] args) {
        int value = 3;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value not was 1 or 2");
        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            case 6:
                System.out.println("Value as not in range 1 to 5");
            default:
                System.out.println("Value not was 1,2,3,4,5 or 6");
                break;
        }

        /*
         * Challenge
         * Create a new switch statement using char instead of int
         * Create a new char variable
         * Create a switch statement testing for
         * A B C D or E
         * display a message if any of these are found and then break it
         * Add a default which displays a message saying not found.
         */

        char chara = 'D';

        switch (chara) {
            case 'A':
                System.out.println("A was found.");
                break;
            case 'B':
                System.out.println("B was found.");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(chara + " was found.");
                break;
            default:
                System.out.println("Not found.");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("JAN");
                break;
            case "february":
                System.out.println("FEB");
                break;
            default:
                System.out.println("NOT SURE");
                break;
        }
    }

}