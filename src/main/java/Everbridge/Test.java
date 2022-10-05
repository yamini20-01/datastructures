package Everbridge;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 12, 18, 89, 21};
        int len = arr.length, i;
        int[] arr1 = new int[len];
        int j= 0;
        for (i = len - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        for (j = 0; j < len; j++) {
            System.out.println(arr1[j]);
        }


    }
}

