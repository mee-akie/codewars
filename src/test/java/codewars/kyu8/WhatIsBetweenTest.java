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
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsBetween.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, WhatIsBetween.between(-2, 2));
    }
}
