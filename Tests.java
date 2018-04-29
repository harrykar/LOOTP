

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Tests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Tests
{
    private Rectangle rectangl1;
    private Ellipse ellipse1;
    private Triangle triangle1;

    
    
    

    
    
    

    /**
     * Default constructor for test class Tests
     */
    public Tests()
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
        rectangl1 = new Rectangle(50, 50, 200, 100);
        ellipse1 = new Ellipse(50, 50, 200, 100);
        triangle1 = new Triangle(50, 50, 200, 100);
        IO.inform("Fixture prepared");
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
    public void testMovements()
    {
        triangle1.moveDown();
        ellipse1.moveRight();
        rectangl1.moveDown();
    }

    @Test
    public void testMovements2()
    {
        ellipse1.moveDown();
        triangle1.moveRight();
        rectangl1.paint();
        triangle1.moveDown();
        triangle1.moveLeft();
        ellipse1.paint();
        rectangl1.paint();
        triangle1.moveDown();
    }
}


