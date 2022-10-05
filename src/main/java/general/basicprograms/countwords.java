package general.basicprograms;

public class countwords {
    public static void main(String[] args)
    {
        String str=" Welcome to  programming world";
        int i,c=0;
        for(i=0;i<str.length()-1;i++)
        {
           if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
               c++;
        }
        System.out.println(c);
    }
}
