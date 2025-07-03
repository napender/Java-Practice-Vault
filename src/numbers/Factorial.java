package numbers;

/**
 * Problem: Calculate the factorial of a number.
 * Author: Napendra Singh
 * Date: 2025-07-01
 * Difficulty: Easy
 *
 * Notes:
 * This class provides two methods to calculate the factorial of a non-negative integer.
 * 1. Iterative approach using a for loop.
 * 2. Recursive approach.
 */
public class Factorial {

    /**
     * Calculates factorial using an iterative approach.
     *
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public long factorialWithLoop(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates factorial using a recursive approach.
     *
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public long factorialWithRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialWithRecursion(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 5;

        System.out.println("Factorial of " + number + " (Loop): " + factorial.factorialWithLoop(number));
        System.out.println("Factorial of " + number + " (Recursion): " + factorial.factorialWithRecursion(number));
    }
}
