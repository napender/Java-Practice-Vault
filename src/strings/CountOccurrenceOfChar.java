package strings;

/**
 * Problem: Count the Occurrence of Each Character in a String
 * Author: Napendra Singh
 * Date: 2025-07-011
 * Difficulty: Easy
 *
 * Notes:
 * This class provides different methods to Count the Occurrence of Each Character in a String
 * Requirements :-
 * The comparison should be case-insensitive ('A' and 'a' are the same).
 * Ignore spaces and non-letter characters
 *
 * Output can be printed as:
 *                      a : 2
 *                      b : 1
 *                      c : 3
 */
public class CountOccurrenceOfChar {

    public static void main(String[] args) {
        String originalString = "Programming";

        FindCharCount(originalString);
    }

    private static void FindCharCount(String str){
        int count = 1;
        for(int i=0; i<str.length(); i++){
            for( int j= i+1; j<str.length(); j++){


                }
            }
        //System.out.println(str.charAt() + " : " + count);
    }
}
