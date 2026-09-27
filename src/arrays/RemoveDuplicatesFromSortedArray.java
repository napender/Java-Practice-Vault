package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3};

        int finalArr = removeDuplicatesFromSortedArray(arr);
        System.out.println(finalArr);
    }

    private static int removeDuplicatesFromSortedArray(int[] arr) {
        int UniquePointer = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[UniquePointer]){
                UniquePointer++;
                arr[UniquePointer] = arr[i];
            }

        }

        return UniquePointer+1;
    }
}

