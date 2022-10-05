package Testing;

import java.util.ArrayList;
import java.util.List;

public class NumberProducer implements Runnable {

    List<Integer> listOfNo ;
    static int count = 0;

    public NumberProducer(List<Integer> listOfNo) {
        this.listOfNo = listOfNo;
    }

    public List<Integer> getListOfNo() {
        return listOfNo;
    }

    public void setListOfNo(List<Integer> listOfNo) {
        this.listOfNo = listOfNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                listOfNo.add(count);
                count++;
            }
        }

    }
}
