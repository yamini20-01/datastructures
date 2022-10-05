package general.MultiThreading;

import java.util.List;

class Consumer implements Runnable {
    private List<Integer> buffer;

    public Consumer(List<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    try {
                        wait(1000);
                        notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                // list.add(null);
                int el = buffer.remove(0);
                System.out.println("Consumed - " + el + " " + Thread.currentThread().getName());

            }
        }
    }
}