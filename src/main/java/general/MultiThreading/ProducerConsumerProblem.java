package general.MultiThreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Start both threads
        t1.start();
        t2.start();
    }
}

class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 1;

    public void produce() throws InterruptedException {

        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();
                list.add(value);
                value++;
                System.out.println("Produced - " + value);

                notifyAll();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (list.isEmpty())
                    wait();
                // list.add(null);
                int el = list.removeFirst();
                System.out.println("Consumed - " + el);
                Thread.sleep(1000);
                notifyAll();
            }
        }
    }
}
