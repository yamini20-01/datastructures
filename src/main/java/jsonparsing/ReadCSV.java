package jsonparsing;

import Testing.CSVReportGenerator;

public class ReadCSV {


    public static void main(String[] args) {

        CSVReportGenerator reportGenerator = new CSVReportGenerator("C:\\Development\\Data Dump\\afd_air_traffic_booked_1.csv", "afd_air_traffic_booked_1_query.txt");
        Thread thread1 = new Thread(reportGenerator);

        CSVReportGenerator reportGenerator2 = new CSVReportGenerator("C:\\Development\\Data Dump\\afd_air_traffic_booked_2.csv", "afd_air_traffic_booked_2_query.txt");
        Thread thread2 = new Thread(reportGenerator2);

        CSVReportGenerator reportGenerator3 = new CSVReportGenerator("C:\\Development\\Data Dump\\afd_air_traffic_booked_3.csv", "afd_air_traffic_booked_3_query.txt");
        Thread thread3 = new Thread(reportGenerator3);
        thread1.start();
        thread2.start();
        thread3.start();


    }

}
