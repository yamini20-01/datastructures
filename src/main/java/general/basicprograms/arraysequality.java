package general.basicprograms;

public class arraysequality {
    public static void main(String[] args) {
        int[] a1 = {4, 5, 6, 23, 1, 17};
        int[] a2 = {4, 5, 6, 23, 1, 7};
        int l, i;
        l = a1.length;
        int m;
        m = a2.length;


        /*Approach1
        int l;
        l = a1.length;
        int m;
        m = a2.length;
        if(l==m)
        {
        System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }*/


        //Approach2


        int c=0;
        if (l == m) {
            for (i = 0; i <a1.length; i++)
                if (a1[i] != a2[i]) {
                    c++;
                }
        }
        else {
            c=0;
        }
        if(c>0)
        {
            System.out.println("Arrays are not equal");
        }
        else
        {
            System.out.println("Arrays are equal");
        }
    }
}
