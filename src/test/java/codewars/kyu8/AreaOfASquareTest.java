package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Area of a Square
 * @rank 8
 * @id 5748838ce2fab90b86001b1a
 * @url https://www.codewars.com/kata/5748838ce2fab90b86001b1a
 */
public class AreaOfASquareTest {

    private static final double DELTA = 1e-15;

    @Test
    public void basicTests() {
        assertEquals(1.62, AreaOfASquare.squareArea(2), DELTA);
        assertEquals(0, AreaOfASquare.squareArea(0), DELTA);
        assertEquals(80, AreaOfASquare.squareArea(14.05), DELTA);
    }
}
