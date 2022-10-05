package Everbridge;

public class bubbleSort {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1- i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        int arr[] = {8, 6, 9, 2, 3, 1, 4};

        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        bubbleSort(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
