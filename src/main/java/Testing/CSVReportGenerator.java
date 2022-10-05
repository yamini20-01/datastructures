package Testing;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CSVReportGenerator implements Runnable {

    final String inputFilePath;

    final String outputFilePath;

    public CSVReportGenerator(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    @Override
    public void run() {
        List<String[]> list = new ArrayList<>();

        try {
            try (CSVReader reader = new CSVReader(new FileReader(inputFilePath))) {
                list = reader.readAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        String[] headers = list.get(0);
        String c = headers[1] + "," + headers[2];
        String queryAppend = "INSERT INTO (" + headers[1] + "," + headers[2] + "," + headers[3] + "," + headers[4] + "," + headers[5] + "," + headers[6] + "," + headers[7] + ")values(";
//INSERT INTO (period,origin_airport,destination_airport,origin_city,destination_city,number_of_flights,number_of_travellers) values(2021-01-01,AAL,AMS,AAL,AMS,52,100);

        Path path
                = Paths.get(outputFilePath);
        for (int i = 1; i < list.size(); i++) {
            String[] values = list.get(i);
            String querySuffix = "'" + values[1] + "','" + values[2] + "','" + values[3] + "','" + values[4] + "','" + values[5] + "'," + values[6] + "," + values[7];
            byte[] arr = (queryAppend + querySuffix + ");\r\n").getBytes();

            try {
                Files.write(path, arr, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
