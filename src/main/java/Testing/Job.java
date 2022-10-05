package Testing;

import java.util.concurrent.Callable;

public class Job implements Callable {
    int delay = 1000;


    public Job(int delay) {
        this.delay = delay;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(delay);
        return "json1";
    }
}
