package jsonparsing;

// Java program to find index of closing
// bracket for given opening bracket.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FindJsons {

    // Function to find index of closing
// bracket for given opening bracket.
    static int test(String expression, int index) {
        int i = -1;

        if (expression.charAt(index) != '{') {
            System.out.print(expression + ", "
                    + index + ": -1\n");
            return i;
        }

        Stack<Integer> st = new Stack<>();

        for (i = index; i < expression.length(); i++) {
            if (expression.charAt(i) == '{') {
                st.push((int) expression.charAt(i));
            } else if (expression.charAt(i) == '}') {
                st.pop();
                if (st.empty()) {
                    return i;
                }
            }
        }
        return i;
    }

    // Driver Code
    public static void main(String[] args) {

        List<String> content = null;
        try {
            content = Files.readAllLines(Paths.get("src/main/resources/seatmaps.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(content);
        String str = String.join(" ", content);
        str = str.substring(str.indexOf("{"));
        File file = new File("src/main/resources/seatmaps-output.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("file deleted");
        }
        try {
            file.createNewFile();
            System.out.println("new file created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            while (str.contains("{") && str.contains("}")) {
            /*Pattern pattern1 = Pattern.compile("(?<=POST).*?(?=HTTP/1.1)");
            Matcher matcher1 = pattern1.matcher(str);

            while (matcher1.find()) {
                System.out.println(matcher1.group());
                try {
                    Files.write(Paths.get("src/main/resources/flight-offers-output.txt"), (matcher1.group() + "\n").getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }*/
                int index = test(str, str.indexOf("{")); // should be 8

                try {
                    String json = str.substring(str.indexOf("{"), index);
                    System.out.println(json);
                    Files.write(Paths.get("src/main/resources/seatmaps-output.txt"), (json+ "\n").getBytes(), StandardOpenOption.APPEND);

                    str = str.substring(json.length()+1, str.length() - 1);

                } catch (IOException e) {
                    e.printStackTrace();
                }
         //       System.out.println(str);
            }

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }


    }
// this code is contributed by Rajput-Ji
}
