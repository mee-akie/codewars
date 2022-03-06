package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Area or Perimeter
 * @rank 8
 * @id 5ab6538b379d20ad880000ab
 * @url https://www.codewars.com/kata/5ab6538b379d20ad880000ab
 */
public class AreaOrPerimeterTest {
    
    @Test
    public void testSquare() {
        assertEquals(100, AreaOrPerimeter.areaOrPerimeter(10, 10));
        assertEquals(1, AreaOrPerimeter.areaOrPerimeter(1, 1));
    }

    @Test
    public void testRectangle() {
        assertEquals(14, AreaOrPerimeter.areaOrPerimeter(2, 5));
        assertEquals(6, AreaOrPerimeter.areaOrPerimeter(1, 2));
    }
}
