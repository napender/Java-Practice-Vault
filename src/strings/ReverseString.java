package strings;

import java.util.Arrays;

/**
 * Problem: Reverse a String
 * Author: Napendra Singh
 * Date: 2025-07-01
 * Difficulty: Easy
 *
 * Notes:
 * This class provides different methods to reverse a string in Java.
 */
public class ReverseString {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        String revStringUsingStringBuilder = reverseStringUsingStringBuilder(originalString);
        String revStringUsingStringBuffer = reverseStringUsingStringBuffer(originalString);
        String revStringUsingCharArray = reverseStringUsingCharArray(originalString);
        String revStringByConvertingStringToCharArrayFirst = reverseStringByConvertingStringToCharArrayFirst(originalString);
        String revStringUsingRecursion = reverseStringUsingRecursion(originalString);

        System.out.println("Reverse String using StringBuilder is : "+ revStringUsingStringBuilder);
        System.out.println("Reverse String using StringBuffer is : "+ revStringUsingStringBuffer);
        System.out.println("Reverse String using CharArray is : "+ revStringUsingCharArray);
        System.out.println("Reverse String by converting String to char array first is : "+ revStringByConvertingStringToCharArrayFirst);
        System.out.println("Reverse String using Recursion is : "+ revStringUsingRecursion);
    }

    /**
     * This method is using StringBuilder to reverse string
     * TimeComplexity is - O(n)
     * The reverse() method works in linear time as it swaps characters internally.
     * @param str
     * @return
     */
    private static String reverseStringUsingStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    /**
     * This method is using StringBuffer to reverse string
     * TimeComplexity is - O(n)
     * The reverse() method works in linear time as it swaps characters internally.
     * @param str
     * @return
     */
    private static String reverseStringUsingStringBuffer(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    /**
     * This method is using char array to reverse string
     * TimeComplexity is - O(n) // The whole method is linear
     * @param str
     * @return
     */
    private static String reverseStringUsingCharArray(String str){
        char[] charArr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            charArr[i] = str.charAt(str.length()-i-1);
        }
        return String.valueOf(charArr);
    }

    /** 👑👑
     * This method is similar to above one but here we have converted original string to char array
     * then we performed reverse action on that string.
     * after that we changed that char array to string.
     * loop will run half way only.
     * TimeComplexity is - n
     * @param str
     * @return
     */
    private static String reverseStringByConvertingStringToCharArrayFirst(String str){
        char[] original = str.toCharArray();
        char temp;
        for(int i=0;i<original.length/2;i++){
            temp = original[(original.length)-1-i];
            original[(original.length)-1-i] = original[i];
            original[i] = temp;
        }
        return String.valueOf(original);
        //String.valueOf() and not Arrays.toString()
        //Goal - You have a char[] like {'a', 'b', 'c'} and want "abc" — not "[a, b, c]"
        // So String class method (String.valueOf()) will be able to convert on array
    }

    ///reverse("abc")
    ///reverse("bc") + "a"
    ///(reverse("c") + "b") + "a"
    ///("c" + "b") + "a"
    ///"cb" + "a"
    ///"cba"
    /**
     * This method is reversing string using recursion
     * TimeComplexity is - O(n^2)
     * This is not O(n^2) just because of recursion.
     * Reason: str.substring(1) creates a new string on every call → so for each character, it copies up to n characters.
     * @param str
     * @return
     */
    private static String reverseStringUsingRecursion(String str){
        if(str.length() <= 1)
            return str;
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }
}
