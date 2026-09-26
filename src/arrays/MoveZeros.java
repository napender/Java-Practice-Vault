package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String args[]) {
        int[] arr = {0, 1, 0, 3, 12};

        int[] result = moveZerosToEnd(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZerosToEnd(int[] arr) {

        int zeroPonter = 0;
        int temp = 0;
        for(int nonZeroPointer = 1; nonZeroPointer < arr.length; nonZeroPointer++){
                if(arr[zeroPonter] == 0 && arr[nonZeroPointer] != 0 ){
                    temp = arr[nonZeroPointer];
                    arr[nonZeroPointer] = arr[zeroPonter];
                    arr[zeroPonter] = temp;
                    zeroPonter++;
                }
        }
        return arr;
    }
}
