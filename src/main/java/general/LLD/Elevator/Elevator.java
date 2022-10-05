package general.LLD.Elevator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

class Elevator {
    private Direction currentDirection = Direction.UP;
    private State currentState = State.IDLE;
    private int currentFloor = 0;

    /**
     * jobs which are being processed
     */
    private Deque<Request> currentRequests = new ArrayDeque<>() ;
    /**
     * up jobs which cannot be processed now so put in pending queue
     */
    private Deque<Request> upPendingRequests = new ArrayDeque<>();
    /**
     * down jobs which cannot be processed now so put in pending queue
     */
    private Deque<Request> downPendingRequests = new ArrayDeque<>();

    public void startElevator() {

        System.out.println("The Elevator has started functioning");
        while (true) {

            if (checkIfJob()) {

                if (currentDirection == Direction.UP) {
                    Request request = currentRequests.poll();
                    processUpRequest(request);
                    if (currentRequests.isEmpty()) {
                        addPendingDownJobsToCurrentJobs();

                    }

                }
                if (currentDirection == Direction.DOWN) {
                    Request request = currentRequests.pollLast();
                    processDownRequest(request);
                    if (currentRequests.isEmpty()) {
                        addPendingUpJobsToCurrentJobs();
                    }

                }
            }
        }
    }

    public boolean checkIfJob() {

        if (currentRequests.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("No Jobs to process ...........");
            return false;
        }
        return true;

    }

    private void processUpRequest(Request request) {

        int startFloor = currentFloor;
        // The elevator is not on the floor where the person has requested it i.e. source floor. So first bring it there.
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("We have reached floor -- " + i);
                currentFloor = i;
            }
        }
        // The elevator is now on the floor where the person has requested it i.e. source floor. User can enter and go to the destination floor.
        System.out.println("Reached Source Floor--opening door");

        startFloor = currentFloor;

        for (int i = startFloor + 1; i <= request.getInternalRequest().getDestinationFloor(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("We have reached floor -- " + i);
            currentFloor = i;
            if (checkIfNewJobCanBeProcessed(request)) {
                break;
            }
        }

    }

    private void processDownRequest(Request request) {

        int startFloor = currentFloor;
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("We have reached floor -- " + i);
                currentFloor = i;
            }
        }

        System.out.println("Reached Source Floor--opening door");

        startFloor = currentFloor;

        for (int i = startFloor - 1; i >= request.getInternalRequest().getDestinationFloor(); i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("We have reached floor -- " + i);
            currentFloor = i;
            if (checkIfNewJobCanBeProcessed(request)) {
                break;
            }
        }

    }

    private boolean checkIfNewJobCanBeProcessed(Request currentRequest) {
        if (checkIfJob()) {
            if (currentDirection == Direction.UP) {
                Request request = currentRequests.pollLast();
                if (request.getInternalRequest().getDestinationFloor() < currentRequest.getInternalRequest()
                        .getDestinationFloor()) {
                    currentRequests.add(request);
                    currentRequests.add(currentRequest);
                    return true;
                }
                currentRequests.add(request);

            }

            if (currentDirection == Direction.DOWN) {
                Request request = currentRequests.pollFirst();
                if (request.getInternalRequest().getDestinationFloor() > currentRequest.getInternalRequest()
                        .getDestinationFloor()) {
                    currentRequests.add(request);
                    currentRequests.add(currentRequest);
                    return true;
                }
                currentRequests.add(request);

            }

        }
        return false;

    }

    private void addPendingDownJobsToCurrentJobs() {
        if (!downPendingRequests.isEmpty()) {
            System.out.println("Pick a pending down job and execute it by putting in current job");
            currentRequests = downPendingRequests;
            currentDirection = Direction.DOWN;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is in Idle state");
        }

    }

    private void addPendingUpJobsToCurrentJobs() {
        if (!upPendingRequests.isEmpty()) {
            System.out.println("Pick a pending up job and execute it by putting in current job");

            currentRequests = upPendingRequests;
            currentDirection = Direction.UP;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is in Idle state");

        }

    }

    public void addJob(Request request) {
        if (currentState == State.IDLE) {
            currentState = State.MOVING;
            currentDirection = request.getExternalRequest().getDirectionToGo();
            currentRequests.add(request);
        } else if (currentState == State.MOVING) {

            if (request.getExternalRequest().getDirectionToGo() != currentDirection) {
                addtoPendingJobs(request);
            } else if (request.getExternalRequest().getDirectionToGo() == currentDirection) {
                if (currentDirection == Direction.UP
                        && request.getInternalRequest().getDestinationFloor() < currentFloor) {
                    addtoPendingJobs(request);
                } else if (currentDirection == Direction.DOWN
                        && request.getInternalRequest().getDestinationFloor() > currentFloor) {
                    addtoPendingJobs(request);
                } else {
                    currentRequests.add(request);
                }

            }

        }

    }

    public void addtoPendingJobs(Request request) {
        if (request.getExternalRequest().getDirectionToGo() == Direction.UP) {
            System.out.println("Add to pending up jobs");
            upPendingRequests.add(request);
        } else {
            System.out.println("Add to pending down jobs");
            downPendingRequests.add(request);
        }
    }

}













