package general.basicprograms;

public class removespace {
    public static void main(String[] args)
    {
        String str="Hello World! Welcome to programming";
        System.out.println("Before replacement:"+ str);
        str=str.replaceAll("\\s","-");
        System.out.println("After replacement:"+ str);
    }
}
