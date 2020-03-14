package oose.ooad.elevator;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class ClosedElevator extends ElevatorState {
    public ClosedElevator(Elevator elevator) {
        super(elevator);
        message = "Doors are closed";
    }

    @Override
    public void moveTo(int floor) {
        elevator.setFloor(2);
        elevator.setState(new movingState(elevator));

    }

    @Override
    public void openCloseDoor() {
        elevator.setState(new OpenElevator(elevator));
    }

}
