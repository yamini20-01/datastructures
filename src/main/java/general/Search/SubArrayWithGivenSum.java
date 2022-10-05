package general.Search;

import java.util.Arrays;

public class SubArrayWithGivenSum {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 15;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length; ) {
            if (currentSum < targetSum) {
                currentSum = currentSum + arr[i];
                i++;
            }
            if (currentSum > targetSum) {
                currentSum = currentSum - arr[startIndex];
                startIndex++;

            }
            if (currentSum == targetSum) {
                System.out.println(startIndex + "  " + (i - 1));
                break;
            }
        }


/*        int[] subArray = Arrays.copyOfRange(arr, startIndex, endIndex+1);

        System.out.println(Arrays.toString(subArray));*/


    }
}
