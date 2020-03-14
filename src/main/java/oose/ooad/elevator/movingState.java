package oose.ooad.elevator;

import static java.lang.Thread.sleep;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class movingState extends ElevatorState {
    public movingState(Elevator elevator) {
        super(elevator);
        move();

    }

    private void move() {
        try {
            message = "moving";
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elevator.setState(new OpenElevator(elevator));
    }

    @Override
    public void moveTo(int floor) {
        this.message = "Already moving";

    }

    @Override
    public void openCloseDoor() {
        this.message = "Cannot open door when moving";

    }

}
