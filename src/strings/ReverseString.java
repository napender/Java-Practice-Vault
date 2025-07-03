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

        String reverserStringUsingStringBuilder = ReverseStringUsingStringBuilder(originalString);
        String reverserStringUsingStringBuffer = ReverseStringUsingStringBuffer(originalString);

        System.out.println("Reverse String using StringBuilder is : "+ reverserStringUsingStringBuilder);
        System.out.println("Reverse String using StringBuffer is : "+ reverserStringUsingStringBuffer);
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
}
