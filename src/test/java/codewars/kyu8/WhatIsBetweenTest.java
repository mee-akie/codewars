package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name What is between?
 * @rank 8
 * @id 55ecd718f46fba02e5000029
 * @url https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */
public class WhatIsBetweenTest {
    
    @Test
    public void testNegativeValues() {
        assertArrayEquals(new int[]{-4,-3,-2,-1}, WhatIsBetween.between(-4, -1));
        assertArrayEquals(new int[]{-4,-3,-2,-1,0}, WhatIsBetween.between(-4, 0));
    }

    @Test
    public void testPositiveValues() {
        assertArrayEquals(new int[]{1,2,3,4}, WhatIsBetween.between(1, 4));
    }

    @Test
    public void testBothValues() {
        assertArrayEquals(new int[]{-4,-3,-2,-1,0,1,2,3,4}, WhatIsBetween.between(-4, 4));
    }
}
