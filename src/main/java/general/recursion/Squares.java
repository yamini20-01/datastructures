package general.recursion;

public class Squares {


    public static void main(String[] args) {

        String str = "abc";
        String pattern = "abc";
        System.out.println(isMatch(str, pattern));


    }


    public static boolean isMatch(String s, String p) {
        //if s exactly equals p(inlcuing both empty) -> true
        //if p equals blank -> false
        //if s equals blank -> false
        //if p contains only * -> true
        //Iterate though both strings parallelly -> check for each character
//"adceb"
//"*a*b"

        //abcd == //a*d , //abcdef == *f , -> p should be subsequence

        boolean isOnlyAsterisk = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != '*') {
                isOnlyAsterisk = false;
            }
        }
        //p = *
        if (isOnlyAsterisk) {
            return true;
        }

        boolean isOnlyQuestion = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != '?') {
                isOnlyQuestion = false;
            }
        }
        //if p = same length of questionmarks
        if (isOnlyQuestion) {
            if (p.length() == s.length()) {
                return true;
            }
        }
        //if string length more than pattern length and pattern does not contain any asterix
        if (s.length() > p.length()) {
            if (!p.contains("*")) {
                return false;
            }
        }
        boolean match = true;
        //for the same length
        for (int i = 0; i < s.length(); i++) {

            if (i < p.length() && (s.charAt(i) == p.charAt(i) || p.charAt(i) == '*')) {

                match = true;
            } else {
                match = false;
            }

        }


        return match;

    }


}
