package general.basicprograms;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class missingnum {
    public static void main(String[] args)
    {
        int[] ar={1,2,4,5,6};
        int sum=0,total_sum,i;
        for(i=0;i<ar.length;i++)
        {
            sum = sum + ar[i];
        }
        int max=ar[0];
        for(i=0;i<ar.length;i++)
            if (max<ar[i]) {
                max = ar[i];
            }
        total_sum= (max*(max+1)/2);
        int missing_num=total_sum-sum;
        System.out.println("The missing number is: " + missing_num);
    }
}
