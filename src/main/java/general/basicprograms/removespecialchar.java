package general.basicprograms;

public class removespecialchar {
    public static void main(String[] args) {
        String str = "HAi!@h#e8l$l3oWo&^rl%D5*";
        String str1 = str.replaceAll("[^a-zA-Z0-9#&@]", "-");
        System.out.println(str1);
    }
}
