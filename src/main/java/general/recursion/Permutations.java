package general.recursion;

public class Permutations {


    public static void main(String[] args) {

        String str = "ABCD";
        permute(str, "");
    }

    static void permute(String sourceString, String resultString) {
        if (sourceString.length() == 0) {
                System.out.println(resultString);
            return;
        }

        for (int i = 0; i < sourceString.length(); i++) {
            char fixedCharacter = sourceString.charAt(i);
            String left_substr = sourceString.substring(0, i);
            String right_substr = sourceString.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, resultString + fixedCharacter);
        }
    }
}
