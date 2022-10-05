package general.Search;

public class PairWithSumInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6,8,28,91};
        int sum = 36;



        findPair(arr, sum);


    }

    private static void findPair(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] > sum) {
                right--;
            }
            if (arr[left] + arr[right] < sum) {
                left++;
            }
            if (arr[left] + arr[right] == sum) {
                break;
            }
        }
        System.out.println(left + " : " + right);


    }
}
