package general.Search;

public class ClosestPairWithSumInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8,8,28, 28, 91};
        int sum = 36;

        //Single while loop with sliding from left and right
        findPair(arr, sum);
    }

    private static void findPair(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;
        int closeLeft = 0;
        int closeRight = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] > sum) {
                right--;
            }
            if (arr[left] + arr[right] <= sum) {
                left++;
            }
            if (arr[left] + arr[right] == sum) {
                if ((right - left) < (closeRight - closeLeft)) {
                    closeRight = right;
                    closeLeft = left;
                }
            }
        }
        System.out.println(closeLeft + " : " + closeRight);
    }
}
