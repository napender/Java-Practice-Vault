package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Find a duplicate number in an array.
 * Author: Napendra Singh
 * Date: 2025-07-01
 * Difficulty: Easy
 *
 * Notes:
 * This class provides a method to find a duplicate number in an array of integers.
 */
public class FindDuplicate {

    /**
     * Finds a duplicate number in an array using a HashSet.
     *
     * @param nums The array of integers.
     * @return A duplicate number, or -1 if no duplicate is found.
     */
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicate finder = new FindDuplicate();
        int[] numbers = {1, 2, 3, 4, 5, 2};

        System.out.println("Array: [1, 2, 3, 4, 5, 2]");
        System.out.println("Duplicate number: " + finder.findDuplicate(numbers));
    }
}
