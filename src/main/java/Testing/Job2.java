package Testing;

import java.util.concurrent.Callable;

public class Job2 implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "json2";
    }
}
