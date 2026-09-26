package HashMap;

import java.util.HashMap;

public class findFirstOccurrence {
    public static void main(String[] args) {
        char[] arr = {'s', 'w', 'i', 's', 's'};
        char chr = findFirstOccurrenceFromArr(arr);
        System.out.println(chr);
    }

    private static char findFirstOccurrenceFromArr(char[] arr) {

        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();

        for(char c: arr) {
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(char c: arr) {
            if(hm.get(c) == 1){
                return c;
            }
        }
        return 0;
    }
}
