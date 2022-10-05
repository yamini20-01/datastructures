package general.MultiThreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PCTest {


    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<Integer>(10);

        Producer producer = new Producer(queue);

        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        t1.start();


        Thread t2 = new Thread(consumer);
        t2.start();
        Thread t3 = new Thread(consumer);
        t3.start();



    }
}
