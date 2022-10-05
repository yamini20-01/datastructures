package Everbridge;

public class Binarysearch {
    public int Binarysearch(int[] arr, int key, int l, int h ) {
        while (l<h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
            Binarysearch bs=new Binarysearch();
            int arr[] = {14, 23, 37, 46, 58, 65, 79, 82, 91, 100};
            int key = 58;
            int h = arr.length, l = 0;
            int res=bs.Binarysearch(arr,key,l,h-1);
            if(res==-1){
                System.out.println("Not found");
            }
            else{
                System.out.println("Found at index " + res);
            }
        }
}
