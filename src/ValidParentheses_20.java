import java.util.*;

public class ValidParentheses_20 {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        if (s.length() == 0) {
            return true;
        }

        List<Character> left = new ArrayList<Character>();
        left.addAll(Arrays.asList('(', '[', '{'));

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (left.contains(s.charAt(i))) {
                if (s.charAt(i) == '(') {
                    stack.push(')');
                }
                else if (s.charAt(i) == '[') {
                    stack.push(']');
                }
                else if (s.charAt(i) == '{') {
                    stack.push('}');
                }
                else {
                    return false;
                }
            }
            else {
                try {
                    if (s.charAt(i) != stack.pop()) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid(args[0]));
    }
}
