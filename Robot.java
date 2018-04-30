

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Robot.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    private Rectangle head;
    private Rectangle body;
    private Rectangle leftHand;
    private Rectangle rightHand;
    private Rectangle legs;

    /**
     * Default constructor for test class Robot
     */
    public Robot()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        head = new Rectangle(100, 50, 50, 50);
        body = new Rectangle(75, 100, 100, 125);
        leftHand = new Rectangle(50, 100, 25, 100);
        rightHand = new Rectangle(175, 100, 25, 100);
        legs = new Rectangle(100, 225, 50, 75);
        IO.inform("Robot drawed");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSweep()
    {
        rightHand.moveRight(-75);
        IO.pause(500);
        rightHand.moveRight(75);
    }
}

