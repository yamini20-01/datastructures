package Testing;

import java.util.HashMap;
import java.util.Stack;

public class Test2 {


    public static void main(String[] args) {

        Stack stack = new Stack();



        StringBuilder sb = new StringBuilder(100);
        String s = "";

        System.out.println("*"+sb.toString().hashCode()+"*");
        System.out.println("*"+s.hashCode()+"*");
        if (sb.equals(s)) {
            System.out.println("First");
        } else if (sb.toString().equals(s)) {
            System.out.println("Second");
        } else {
            System.out.println("Third");
        }

    }

    public static String longestPalindrome1(String s) {
        int maxPalinLength = 0;
        String longestPalindrome = null;
        int length = s.length();
// check all possible sub strings
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int len = j - i;
                String curr = s.substring(i, j + 1);
                if (isPalindrome(curr)) {
                    if (len > maxPalinLength) {
                        longestPalindrome = curr;
                        maxPalinLength = len;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public class Solution2 {
        public int[] twoSum(int[] numbers, int target) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] result = new int[2];
            for (int i = 0; i < numbers.length; i++) {
                if (map.containsKey(numbers[i])) {
                    int index = map.get(numbers[i]);
                    result[0] = index + 1;
                    result[1] = i + 1;
                    break;
                } else {
                    map.put(target - numbers[i], i);
                }
            }
            return result;
        }
    }

}
