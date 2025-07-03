package strings;

import java.util.Arrays;

/**
 * Problem: Reverse a String
 * Author: Napendra Singh
 * Date: 2025-07-01
 * Difficulty: Easy
 *
 * Notes:
 * This class provides three different methods to reverse a string in Java.
 * 1. Iterative approach using a for loop.
 * 2. Using the built-in StringBuilder class.
 * 3. A recursive approach.
 */
public class ReverseString {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        String reverseStringUsingStringBuilder = ReverseStringUsingStringBuilder(originalString);
        String reverseStringUsingStringBuffer = ReverseStringUsingStringBuffer(originalString);
        String reverseStringUsingCharArray = ReverseStringUsingCharArray(originalString);

        System.out.println("Reverse String using StringBuilder is : "+ reverseStringUsingStringBuilder);
        System.out.println("Reverse String using StringBuffer is : "+ reverseStringUsingStringBuffer);
        System.out.println("Reverse String using CharArray is : "+ reverseStringUsingCharArray);
    }

    /**
     * This method is using StringBuilder to reverse string
     * @param str
     * @return
     */
    private static String ReverseStringUsingStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    /**
     * This method is using StringBuffer to reverse string
     * @param str
     * @return
     */
    private static String ReverseStringUsingStringBuffer(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    /**
     * This method is using char array to reverse string
     * @param str
     * @return
     */
    private static String ReverseStringUsingCharArray(String str){
        char[] charArr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            charArr[i] = str.charAt(str.length()-i-1);
        }
        return String.valueOf(charArr);
    }
}
