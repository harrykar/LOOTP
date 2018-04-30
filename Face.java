

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Face.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Face
{
    private Rectangle head;
    private Ellipse leftEye;
    private Ellipse rightEye;
    private Ellipse nose;
    private Ellipse mouth;

    /**
     * Default constructor for test class Face
     */
    public Face()
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
        head = new Rectangle(50, 50, 200, 200);
        leftEye = new Ellipse(75, 75, 25, 25);
        rightEye = new Ellipse(200, 75, 25, 25);
        nose = new Ellipse(125, 75, 50, 75);
        mouth = new Ellipse(75, 175, 150, 50);
        IO.inform("face drawed");
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
    public void testSmile()
    {
        mouth.setPosition(75, 150);
        mouth.setSize(150, 100);
        Rectangle lip = new Rectangle(75, 150, 150, 50);
    }

    @Test
    public void testBlink()
    {
        NamedColor headColor = head.getColor();
        NamedColor rightEyeColor = rightEye.getColor();
        leftEye.setColor(headColor);
        IO.pause(250);
        leftEye.setColor(rightEyeColor);
    }
}


