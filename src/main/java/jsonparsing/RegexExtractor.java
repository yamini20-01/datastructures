package jsonparsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtractor {

    public static void main(String[] args) {
        String seatregex = "[{]\"meta\":[{]\".*?[}][}][}]";
/*        extractJson("seatmaps", seatregex);*/
        extractJson("flight-offers", seatregex);
     /*   extractJson("flight-orders", seatregex);
        String flightpricingregex = "[{]\"data\":[{]\".*?[}][}][}]";
        extractJson("flight-offers-pricing",flightpricingregex);*/

    }

    private static void extractJson(String fileName, String regex) {
        List<String> content = null;
        try {
            content = Files.readAllLines(Paths.get("src/main/resources/" + fileName + ".txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(content);
        String str = String.join(" ", content);
        str = str.substring(str.indexOf("{"));
        File file = new File("src/main/resources/" + fileName + "-output.txt");
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
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            try {
                String json = matcher.group();
                Files.write(Paths.get("src/main/resources/" + fileName + "-output.txt"), (json + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
