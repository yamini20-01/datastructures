package general.Search;

import java.util.Arrays;

public class SearchInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int element = 13;

        int left = 0;
        int right = arr.length - 1;

        System.out.println(binarySearch(arr, element, left, right));

    }

    private static int binarySearch(int[] arr, int element, int left, int right) {

        if (arr[left] > element) {
            return -1;
        }

        if (arr[right] < element) {
            return -1;
        }
        int mid = (left + right) / 2;


        if (arr[mid] == element) {
            return mid;
        }

        if (element > arr[mid]) {
            //search in right array
            return binarySearch(arr, element, mid + 1, right);
        }
        if (element < arr[mid]) {
            return binarySearch(arr, element, left, mid);
        }

        return left;
    }
}
