

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class House.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class House
{
    private Rectangle building;
    private Rectangle chimney;
    private Triangle roof;

    /**
     * Default constructor for test class House
     */
    public House()
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
        building = new Rectangle(50, 200, 200, 100);
        chimney = new Rectangle(100, 100, 20, 50);
        roof = new Triangle(50, 100, 200, 100);
        IO.inform("House prepared");
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
    public void testSmoke()
    {
        Ellipse s1 = new Ellipse(100, 50, 50, 50);
        Ellipse s2 = new Ellipse(125, 25, 75, 50);
        Ellipse s3 = new Ellipse(150, 0, 100, 50);
    }

    @Test
    public void testColor()
    {
        roof.setColor(NamedColor.getNamedColor("red"));
        building.setColor(NamedColor.getNamedColor("ochre"));
    }
}


