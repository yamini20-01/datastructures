package Test;

import java.util.concurrent.BlockingQueue;

public class RatingObjFactory {
    static Algorithm a1 = null;
    static Algorithm a2 = null;
    static Algorithm a3 = null;

    public RatingObjFactory() {
        if (a1 == null) {
            a1 = new AlgorithmA();
        }
        if (a2 == null) {
            a2 = new AlgorithmB();
        }
        if (a3 == null) {
            a3 = new AlgorithmC();
        }
    }


    public  Algorithm createObj(String type) {

        switch (type) {
            case "a":
                return a1;
            case "b":
                return a2;
            case "c":
                return a3;
            default:
                System.out.println();
                return null;
        }

    }
}
