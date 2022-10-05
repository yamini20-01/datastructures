package Test;// Java program to demonstrates ScheduleThreadPoolExecutor
// class

import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

class ScheduledThreadTester {
    public static void main(String[] args) {

        // Creating a ScheduledThreadPoolExecutor object
        ScheduledThreadPoolExecutor threadPool
                = new ScheduledThreadPoolExecutor(2);

        // Creating two Runnable objects
        Runnable task1 = new Command("task1");
        Runnable task2 = new Command("task2");

        // Printing the current time in seconds
        System.out.println(
                "Current time:"
                        + Calendar.getInstance().getTime());


        long diff = ((Timestamp.valueOf("2022-05-05 19:47:45").getTime()
                - Timestamp.valueOf("2022-05-03 21:47:45").getTime())
                / (1000 * 60 * 60 * 24))
                % 365;

        System.out.println(diff);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats.getMax());

        List<Integer> s = new Random().ints(10, 1000000).limit(100).mapToObj(x -> (Integer) x).collect(Collectors.toList());

        s.forEach(System.out::println);
        System.out.println(Calendar.getInstance().getTimeInMillis());
        boolean k = s.parallelStream().anyMatch(x -> x >999999);
        System.out.println(k);
        System.out.println(Calendar.getInstance().getTimeInMillis());

        Map<String, List<String>> people = new LinkedHashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        phones.forEach(System.out::println);

        // Scheduling the first task which will execute
        // after 2 seconds and then repeats periodically with
        // a period of 8 seconds
        //threadPool.scheduleAtFixedRate(task1, 1, 2,             TimeUnit.SECONDS);

        // Scheduling the second task which will execute
        // after 5 seconds and then there will be a delay of
        // 5 seconds between the completion
        // of one execution and the commencement of the next
        // execution
        //   threadPool.scheduleWithFixedDelay(task2, 2, 3,             TimeUnit.SECONDS);

        // Wait for 30 seconds
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Remember to shut sown the Thread Pool
        //      threadPool.shutdown();
    }
}

// Class that implements Runnable interface
class Command implements Runnable {
    String taskName;

    public Command(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        try {
            System.out.println("Task name : "
                    + this.taskName
                    + " Current time : "
                    + Calendar.getInstance().getTime());
/*            Thread.sleep(2000);
            System.out.println("Executed : " + this.taskName
                    + " Current time : "
                    + Calendar.getInstance().get(
                    Calendar.SECOND));*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
