package oose.ooad.elevator;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ElevatorTest {
    private Elevator elevator;

    @Test
    public void testFromZeroToTwo(){
        elevator = new Elevator(0);

        elevator.moveTo(2);

        assertEquals(2, elevator.getFloor());
    }

    @Test
    public void testMoveWhileDoorsOpen(){
        elevator = new Elevator(0);
        elevator.openCloseDoor();
        elevator.moveTo(2);
        assertEquals("Cannot move while doors are open",elevator.getMessage());
    }

}
