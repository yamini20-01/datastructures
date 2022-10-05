package general.MultiThreading;

public class Tester {

    public static void main(String[] args) {

        BlockingQueue b = new BlockingQueue(5);

        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    int count = 0;

                    while (true) {
                        b.enqueue(new Integer(count));
                        count++;
                    }


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {

                    while (true) {
                        b.dequeue();

                    }


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {

                    while (true) {
                        b.dequeue();

                    }


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();

    }

}
