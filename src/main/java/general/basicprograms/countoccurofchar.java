package general.basicprograms;

public class countoccurofchar {
    public static void main(String[] args)
    {
        String str;
        str = "Java programming";
        int len=str.length();
        String str2=str.replaceAll("a","");
        int len1=str2.length();
        int no_of_a=len-len1;
        System.out.println("The character a occurred "+ no_of_a);
    }
}

