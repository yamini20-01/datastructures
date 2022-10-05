package general.stack;

import java.util.*;

public class NGE {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2, 2, 5};
        int[] list = nextLargerElement(arr, 7);
    }
    public static int[] nextLargerElement(int[] arr, int n) {
        // Your code here
        if (arr.length == 0) {
            int[] arr1 = {};
            return arr1;
        }
        if (arr.length == 1) {
            int[] arr1 = {-1};
            return arr1;
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i > -1; i--) {
            if (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                    stack.pop();
            }
            if (stack.isEmpty() == false && stack.peek() > arr[i]) {
                list.add(stack.peek());
            }
            if (stack.isEmpty() == true) {
                list.add(Integer.valueOf(-1));
            }
            stack.add(arr[i]);
        }
        int finalAns[] = new int[list.size()];
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            finalAns[i] = list.get(i);
        }
        return finalAns;
    }
}
