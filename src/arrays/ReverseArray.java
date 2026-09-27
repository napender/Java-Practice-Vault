package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length;

       for(int i=0; i<len/2; i++){
           arr[i] = arr[i]+arr[len-1-i];
           arr[len-1-i] = arr[i]-arr[len-1-i];
           arr[i] = arr[i]-arr[len-1-i];
       }

       System.out.println(Arrays.toString(arr));
    }
}

// Time Complexity = O(n)
// Space Complexity = O(1)