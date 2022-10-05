package jsonparsing;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExtractJson {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        // try block to check for exceptions where
        // object of BufferedReader class us created
        // to read filepath
        try (BufferedReader buffer = new BufferedReader(
                new FileReader("src/main/resources/log2.txt"))) {

            String str;

            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((str = buffer.readLine()) != null) {

                builder.append(str).append("\n");
            }
        }

        // Catch block to handle the exceptions
        catch (IOException e) {

            // Print the line number here exception occurred
            // using printStackTrace() method
            e.printStackTrace();
        }

     //   System.out.println(builder.toString());
        extractJSON(builder.toString());
    }


    public static String extractJSON(String str) {
        int firstOpen, firstClose = str.length() - 1; String candidate;
        firstClose = str.lastIndexOf('}');
        do {
            // debugger
            firstOpen = str.indexOf('{');
            // console.log('firstOpen: ' + firstOpen, 'firstClose: ' + firstClose);
            if(firstClose <= firstOpen) {
                return null;
            }
            do {
                candidate = str.substring(firstOpen, firstClose + 1);
                // console.log('candidate: ' + candidate);
                try {

                    Gson gson = new Gson();
                    gson.fromJson(candidate,Object.class);

                    // console.log('...found');
                    return candidate;
                }
                catch(Exception e) {
                    // console.log('...failed');
                }
                firstOpen = str.indexOf('{', firstOpen+1);
            } while(firstClose > firstOpen && firstOpen != -1);
            firstClose = str.lastIndexOf('}', firstClose - 1);
        } while(firstClose != -1);
        return null;
    }


}
