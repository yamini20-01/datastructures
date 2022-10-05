package general.basicprograms;
import java.util.*;

import static java.lang.System.*;

public class duplicate {
    public static void main(String[] args)
    {
        int[] ar={3,4,1,0,6,2,8,7};
        int i,j;
        Arrays.sort(ar);
        int c=0;
        for(i=0;i<ar.length;i++) {
            for (j = i+1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println("Duplicate element found at: " + i + " and "+ j);
                    c++;
                }
            }
        }
        if (c == 0)
        {
            System.out.println("Duplicate elements are not found ");
        }
    }
}
