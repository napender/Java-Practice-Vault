package arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 7, 12, 3};
        int evenCount = 0;
        int oddCount = 0;

        for(int num : arr){
            if(num%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even numbers are : " + evenCount);
        System.out.println("Odd numbers are : " + oddCount);
    }
}

// TimeComplexity is = O(n) because we are traversing the array till the end which can have nth elements
// SpaceComplexity is = O(1) because using only two variables only.