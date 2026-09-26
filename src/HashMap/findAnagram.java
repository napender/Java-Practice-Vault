package HashMap;

import java.util.HashMap;

public class findAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

         boolean flag = isAnaram(arrS, arrT);
         System.out.println("These string values are " + flag);
    }

    private static boolean isAnaram(char[] arrS, char[] arrT) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c1 : arrS){
            map.put(c1, map.getOrDefault(c1,0)+1);
        }
        for(char c2 : arrT){
            map.put(c2, map.getOrDefault(c2,0)-1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
