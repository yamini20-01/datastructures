package Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class Consumer implements Callable {

    BlockingQueue<String> blockingQueue = null;


    Consumer(BlockingQueue blockingQueue){

    }


    @Override
    public Object call() throws Exception {

        while (!blockingQueue.isEmpty()){

        }
        return null;
    }

}
