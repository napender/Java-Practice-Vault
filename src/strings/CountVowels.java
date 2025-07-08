package strings;

/**
 * Problem: Count Vowels from string
 * Author: Napendra Singh
 * Date: 2025-07-08
 * Difficulty: Easy
 *
 * Notes:
 * This class provides different methods to count Vowels from string
 */
public class CountVowels {

    public static void main(String[] args) {
        String originalString = "Napendra singh";

        int[] totalCount = CountVowelsAndConsonants(originalString);
        int[] totalCountOne = CountVowelsAndConsonantsImprovedOfAboveMethod(originalString);

        System.out.println("Total number of vowels are : "+ totalCount[0] + " and Consonants are : "+ totalCount[1]);
        System.out.println("Total number of vowels are : "+ totalCountOne[0] + " and Consonants are : "+ totalCountOne[1]);
    }

    /**
     * This method is used to count the vowels and Consonants in given string
     *
     * Time Complexity is O(n)
     * Outer loop: for i in 0 to str.length() → O(n)
     * Inner loop: for j in 0 to vowels.length (5) → O(5) → O(1)
     * So total is O(n × 5) = O(n)
     *
     * @param str
     * @return
     */
    private static int[] CountVowelsAndConsonants(String str){
        char[] vowels = {'a','e','i','o','u'};
        str = str.replace(" ", "").toLowerCase();
        int vowelsCount = 0;
        int vowelsNewCount = 0;
        int consonantsCount = 0;
        if(str == null)
            return new int[]{vowelsCount,consonantsCount};
        for(int i=0; i<str.length(); i++){
            vowelsCount = vowelsNewCount;
            for(int j=0; j<vowels.length;j++){
                if(str.charAt(i) == vowels[j])
                    vowelsNewCount ++;
            }
            if(vowelsCount == vowelsNewCount){
                consonantsCount++;
            }
        }
        return new int[]{vowelsCount, consonantsCount};
    }

    /**
     * This method is used to count the vowels and Consonants in given string
     * This method is improved version of above method
     * Time Complexity is O(n)
     *
     * @param str
     * @return
     */
    private static int[] CountVowelsAndConsonantsImprovedOfAboveMethod(String str){
        char[] vowels = {'a','e','i','o','u'};
        int vowelsCount = 0;
        int consonantsCount = 0;
        if(str == null)
            return new int[]{vowelsCount,consonantsCount};

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                boolean isVowels = false;
                for(char v : vowels){
                    if(v == ch){
                        isVowels = true;
                        break;
                    }
                }
                if(isVowels){
                    vowelsCount++;
                }else {
                    consonantsCount++;
                }
            }
        }
        return new int[]{vowelsCount, consonantsCount};
    }
}
