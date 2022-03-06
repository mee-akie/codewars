package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Sum of positive
 * @rank 8
 * @id 5715eaedb436cf5606000381
 * @url https://www.codewars.com/kata/5715eaedb436cf5606000381
 */
public class SumOfPositiveTest {
    
    @Test
    public void testSum() {
        assertEquals(6, SumOfPositive.sum(new int[]{-3,-2,-1,0,1,2,3}));
    }
}
