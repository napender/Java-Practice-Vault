package Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverString {
    public static void main(String[] args) {
        String str = "hello";

        String result  = reverseString(str);
        System.out.println("Reversed String is : " + result);
    }
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for( int i = 0; i<chars.length; i++){
            stack.push(chars[i]);
        }

        for( int i = 0; i<chars.length; i++){
            chars[i] = stack.pop();
        }

        return String.valueOf(chars);
    }
}

// Time Complexity = O(n)
// Space Complexity = O(n)