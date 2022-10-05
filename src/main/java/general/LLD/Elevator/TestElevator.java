package general.LLD.Elevator;

public class TestElevator {

    public static void main(String args[]) {

        Elevator elevator = new Elevator();

        /**
         * Thread for starting the elevator
         */
        RequestJob jobManager = new RequestJob(elevator);
        Thread t2 = new Thread(jobManager);
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ExternalRequest er = new ExternalRequest(Direction.UP, 0);
        InternalRequest ir = new InternalRequest(5);
        Request request1 = new Request(ir, er);

         er = new ExternalRequest(Direction.UP, 1);
         ir = new InternalRequest(4);
        Request request2 = new Request(ir, er);

        er = new ExternalRequest(Direction.DOWN, 5);
        ir = new InternalRequest(1);
        Request request3 = new Request(ir, er);

        /**
         * Pass job to the elevator
         */
        elevator.addJob(request1);
        elevator.addJob(request2);
        elevator.addJob(request3);


    }

}