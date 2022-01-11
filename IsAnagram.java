import java.util.Arrays;

/**
 * anagram
 */
public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("xx", "xy"));
        System.out.println(isAnagram("character", "hratccera"));
        System.out.println(isAnagram("test", "ttess"));
    }

    public static boolean isAnagram(String x, String y) {

        if (x.length() != y.length()) {
            return false;
        } else {
            char[] xArr = x.toCharArray();
            char[] yArr = y.toCharArray();

            Arrays.sort(xArr);
            Arrays.sort(yArr);

            return Arrays.equals(xArr, yArr);
        }
    }
}