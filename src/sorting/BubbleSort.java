package sorting;

import java.util.Arrays;

/**
 * Problem: Implement the Bubble Sort algorithm.
 * Author: Napendra Singh
 * Date: 2025-07-01
 * Difficulty: Easy
 *
 * Notes:
 * This class provides an implementation of the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));
        sorter.bubbleSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
