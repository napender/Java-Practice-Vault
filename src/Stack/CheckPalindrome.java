package Stack;

import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";

        Boolean result = checkPalindrome(str);
        System.out.println(result);
    }
    public static boolean checkPalindrome(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char Char : chars) {
            stack.push(Char);
        }

        for (int i = 0; i<chars.length;i++){
            if(!stack.isEmpty() && stack.peek().equals(chars[i])) {
                stack.pop();
            }else return false;
        }

        return true;

    }
}
