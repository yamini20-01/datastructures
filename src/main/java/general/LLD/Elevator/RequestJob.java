package general.LLD.Elevator;
class RequestJob implements Runnable {

    private Elevator elevator;

    RequestJob(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void run() {
        /**
         * start the elevator
         */
        elevator.startElevator();
    }

}