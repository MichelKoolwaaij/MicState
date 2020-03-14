package oose.ooad.elevator;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class OpenElevator extends ElevatorState {
    public OpenElevator(Elevator elevator) {
        super(elevator);
        this.message = "Doors are open";
    }

    @Override
    public void moveTo(int floor) {
        this.message = "Cannot move while doors are open";
    }

    @Override
    public void openCloseDoor() {
        elevator.setState(new ClosedElevator(elevator));
    }
}
