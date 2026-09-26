package HashSet;

import java.util.HashSet;

public class findFirstDuplicate {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 9, 3, 5};

        int duplicate = findFirstDuplicateNumber(arr);
        System.out.println(duplicate);
    }
    public static int findFirstDuplicateNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return 0;
    }
}
