package oose.ooad.elevator;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public abstract class ElevatorState {
    protected Elevator elevator;
    protected String message;

    // In the base state we use the owner of the state. In this case 'elevator'.
    // This way we can change the state easily without modifying code in 'elevator'.
    public ElevatorState (Elevator elevator){
        this.elevator = elevator;
    }

    public abstract void moveTo(int floor);

    public abstract void openCloseDoor();

    public String getMessage(){
        return message;
    }
}
