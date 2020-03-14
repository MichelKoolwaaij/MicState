package oose.ooad.elevator;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class Elevator {
    // Behaviour of the elevator depends on the state
    // We don't implement this behaviour in the elevator
    // No. Instead we implement this in the state
    // The benefits:
    // + we never have to change the code of the elevator
    // + we can simply add a new state bij adding new code

    private int floor;
    private ElevatorState state;
    public Elevator(int floor) {
        this.floor = floor;
        this.state = new ClosedElevator(this);
    }

    public int getFloor() {
        return floor;
    }

    public void setState(ElevatorState elevatorState){
        this.state = elevatorState;
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public void moveTo(int floor) {
        state.moveTo(floor);
    }

    public void openCloseDoor(){
        state.openCloseDoor();
    }

    public String getMessage(){
        return state.getMessage();
    }
}
