import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValidParenthesesV2("()"));
        System.out.println(isValidParenthesesV2("()[]{}"));
        System.out.println(isValidParenthesesV2("(]"));
    }

    public static boolean isValidParenthesesV3(String s) {
        int length = s.length();

        if (length < 2) {
            return false;
        }

        char[] cArr = new char[length];
        int j = 0;

        for (int i = 0; i < length; i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                cArr[j++] = temp;
            } else if ((j > 0) && (temp == ')') && (cArr[j - 1] == '(')) {
                j--;
            } else if ((j > 0) && (temp == ']') && (cArr[j - 1] == '[')) {
                j--;
            } else if ((j > 0) && (temp == '}') && (cArr[j - 1] == '{')) {
                j--;
            } else {
                return false;
            }
        }

        return j == 0;
    }

    // Version 2
    public static boolean isValidParenthesesV2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '{' || temp == '(' || temp == '[') {
                stack.add(temp);
            } else if (stack.isEmpty()) {
                return false;
            } else if (stack.peek() == '{' && temp != '}') {
                return false;
            } else if (stack.peek() == '[' && temp != ']') {
                return false;
            } else if (stack.peek() == '(' && temp != ')') {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    // Version 1
    public static boolean isValidParentheses(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (map.containsKey(temp)) {
                if (stack.isEmpty() || stack.pop() != map.get(temp)) {
                    return false;
                }
            } else {
                stack.push(temp);
            }
        }
        return stack.isEmpty();
    }
}
