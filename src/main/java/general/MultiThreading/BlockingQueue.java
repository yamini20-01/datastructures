package general.MultiThreading;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    private List queue = new LinkedList();
    private int  limit = 10;
    public BlockingQueue(int limit){
        this.limit = limit;
    }
    public synchronized void enqueue(Object item)
            throws InterruptedException  {
        while(this.queue.size() == this.limit) {
            wait();
        }
        this.queue.add(item);
        System.out.println("Element Added"+item+" "+Thread.currentThread().getName());
        if(this.queue.size() == 1) {
            notifyAll();
        }
    }
    public synchronized Object dequeue()
            throws InterruptedException{
        while(this.queue.size() == 0){
            wait();
        }
        if(this.queue.size() == this.limit){
            notifyAll();
        }
        System.out.println("Element Removed"+Thread.currentThread().getName());
        return this.queue.remove(0);
    }
}
