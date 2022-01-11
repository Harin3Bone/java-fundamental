package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
    }

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
