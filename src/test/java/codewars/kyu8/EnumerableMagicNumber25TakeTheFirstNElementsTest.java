package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Enumerable Magic #25 - Take the First N Elements
 * @rank 8
 * @id 545afd0761aa4c3055001386
 * @url https://www.codewars.com/kata/545afd0761aa4c3055001386
 */
public class EnumerableMagicNumber25TakeTheFirstNElementsTest {
    
    @Test
    public void testArray() {
        assertArrayEquals(new int[]{-3,-2,-1,0},
            EnumerableMagicNumber25TakeTheFirstNElements.take(new int[]{-3,-2,-1,0,1,2,3}, 4));
        assertArrayEquals(new int[]{},
            EnumerableMagicNumber25TakeTheFirstNElements.take(new int[]{}, 2));
        assertArrayEquals(new int[]{1,2,3,4},
            EnumerableMagicNumber25TakeTheFirstNElements.take(new int[]{1,2,3,4}, 40));
    }
}
