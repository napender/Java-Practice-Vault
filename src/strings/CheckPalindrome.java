package strings;

/**
 * Problem: Check for Palindrome
 * Author: Napendra Singh
 * Date: 2025-07-07
 * Difficulty: Easy
 *
 * Notes:
 * This class provides different methods to Check for Palindrome for a string in Java.
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        String originalString = "Madam";

        boolean isTrue_one = CheckPalindromeUsingReverseString(originalString);
        boolean isTrue_two = CheckPalindromeUsingForLoopOrTwoPointerTechnique(originalString);
        boolean isTrue_three = CheckPalindromeUsingForLoopOrTwoPointerTechnique(originalString);
        boolean isTrue_four = checkPalindromeUsingRecursion(originalString);

        System.out.println("Checking palindrome using reverse string : " + isTrue_one);
        System.out.println("Checking palindrome using For loop : " + isTrue_two);
        System.out.println("Checking palindrome using StringBuilder : " + isTrue_three);
        System.out.println("Checking palindrome using Recursion : " + isTrue_four);
    }

    /**
     * This method is checking if strig is palindrome or not using reverse string using char array and
     * then converting that char array to string
     * after that we compare both strings and return the result
     *
     * TimeComplexity -  O(n)
     * Loop runs n/2 times → O(n)
     * String.valueOf(charArr) → O(n)
     * equalsIgnoreCase() → character-by-character comparison → O(n)
     * @param str
     * @return
     */
    private static boolean CheckPalindromeUsingReverseString(String str){
        char[] charArr = str.toCharArray();
        char temp;
        if(str.length() == 1)
            return true;
        for(int i=0; i<charArr.length/2; i++){
            temp = charArr[(charArr.length)-1-i];
            charArr[(charArr.length)-1-i] = charArr[i];
            charArr[i] = temp;
        }
        if(str.equalsIgnoreCase(String.valueOf(charArr))){  // ignored case sensitivity
            return true;
        }else{
            return false;
        }
    }

    /** 👑👑
     * This method will use the string and change to lower case first to handle lower case
     * then it will use the for loop to check and return the result.
     * this is also Two-Pointer Technique
     *
     * TimeComplexity -  O(n)
     * str.toLowerCase() → O(n)
     * Loop comparison → O(n/2) → O(n)
     * @param str
     * @return
     */
    private static boolean CheckPalindromeUsingForLoopOrTwoPointerTechnique(String str){
        str = str.toLowerCase();
        if(str.length() == 1)
            return true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }

    /**
     * This method used StringBuilder to verify the string.
     *
     * TimeComplexity -  O(n)
     * New StringBuilder(str) → O(n) || (Creates a copy of the original string)
     * .reverse() → O(n) || (Swaps characters in place within the StringBuilder)
     * .toString() → O(n) || (Creates a new string from StringBuilder)
     * .equalsIgnoreCase() → O(n) || (Compares both strings character by character)
     * @param str
     * @return
     */
    private static boolean CheckPalindromeUsingStringBuilder(String str){
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    /**
     * This method is used to check for the Palindrome using Recursion
     *
     * TimeComplexity -  O(n)
     * Because we make one comparison per character, from both ends.
     * @param str
     * @return
     */
    private static boolean checkPalindromeUsingRecursion(String str) {
        // Normalize the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    /**
     *
     * @param str
     * @param left
     * @param right
     * @return
     */
    private static boolean isPalindromeRecursive(String str, int left, int right){
        // Base case: if left crosses right, we’re done
        if (left >= right)
            return true;

        // If characters don’t match, it's not a palindrome
        if (str.charAt(left) != str.charAt(right))
            return false;

        // Move pointers inward and recurse
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}
