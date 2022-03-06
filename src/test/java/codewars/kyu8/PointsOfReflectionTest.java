package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Points of Reflection
 * @rank 8
 * @id 57bfea4cb19505912900012c
 * @url https://www.codewars.com/kata/57bfea4cb19505912900012c
 */
public class PointsOfReflectionTest {
    
    @Test
    public void testReflection() {
        assertArrayEquals(new int[]{17,-4},
            PointsOfReflection.reflectPoint(new int[]{-7,4}, new int[]{5,0}));
    }
}
