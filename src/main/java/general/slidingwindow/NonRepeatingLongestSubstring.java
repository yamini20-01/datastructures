package general.slidingwindow;

import java.nio.charset.StandardCharsets;

public class NonRepeatingLongestSubstring {
    public static void main(String[] args) {
        String str = "pwwkew";
        int startIndex = 0;
        String longestSubStr = str.charAt(0) + "";
        String lastLongestSubStr = "";
        for (int i = 1; i < str.length(); i++) {
            if (!longestSubStr.contains(str.charAt(i) + "")) {
                longestSubStr = str.substring(startIndex, i + 1);
            } else {
                startIndex = i;
                if (longestSubStr.length() > lastLongestSubStr.length()) {
                    lastLongestSubStr = longestSubStr;
                }
                longestSubStr = "";
            }
        }
        System.out.println(lastLongestSubStr);
    }
}
