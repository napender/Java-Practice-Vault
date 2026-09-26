package Stack;

import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String str = "([{}])";

        boolean results = findValidParentheses(str);
        System.out.println(results);
    }

    public static boolean findValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                stack.push(c[i]);
            } else if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if ((c[i] == ')' && top == '(') ||
                        (c[i] == ']' && top == '[') ||
                        (c[i] == '}' && top == '{')) {

                    stack.pop();
                } else return false;
            } else return false;

        }
        return stack.isEmpty();
    }
}
