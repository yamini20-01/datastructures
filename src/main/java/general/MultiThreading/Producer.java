package general.MultiThreading;

import java.util.List;
import java.util.Random;

class Producer implements Runnable {
    private List<Integer> buffer;
    public Producer(List<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == 1) {
                    try {
                        wait(1000);
                        notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                buffer.add(value);
                value++;
                System.out.println("Produced - " + value + " " + Thread.currentThread().getName());
            }
        }

    }
}