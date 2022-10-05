package Everbridge;

public class countwords {
    public static void main(String[] args){
        String str="Hello world! Welcome to my world";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' ' && str.charAt(i+1)!=' '){
                c++;
            }
        }
        System.out.println(c);
    }
}
