package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Find Maximum and Minimum Values of a List
 * @rank 8
 * @id 577a98a6ae28071780000989
 * @url https://www.codewars.com/kata/577a98a6ae28071780000989
 */
public class FindMaximumAndMinimumValuesOfAListTest {

    private FindMaximumAndMinimumValuesOfAList mm = new FindMaximumAndMinimumValuesOfAList();

    @Test
    public void testFindMin() {
        assertEquals(1, mm.min(new int[]{7,5,3,1}));
        assertEquals(-1, mm.min(new int[]{0,-1,2,3,4}));
    }

    @Test
    public void testFindMax() {
        assertEquals(10, mm.max(new int[]{1,2,3,4,5,10}));
        assertEquals(-5, mm.max(new int[]{-10,-9,-5,-6,-7}));
    }
}
