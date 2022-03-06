package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Difference of Volumes of Cuboids
 * @rank 8
 * @id 58cb43f4256836ed95000f97
 * @url https://www.codewars.com/kata/58cb43f4256836ed95000f97
 */
public class DifferenceOfVolumesOfCuboidsTest {
    
    @Test
    public void testDifferenceFromFirstToSecond() {
        assertEquals(14,
            DifferenceOfVolumesOfCuboids.findDifference(new int[]{3,2,5}, new int[]{1,4,4}));
    }

    @Test
    public void testDifferenceFromSecondToFirst() {
        assertEquals(106, 
            DifferenceOfVolumesOfCuboids.findDifference(new int[]{5,2,2}, new int[]{9,7,2}));
    }
}
