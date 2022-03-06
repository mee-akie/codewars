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
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, EnumerableMagicNumber25TakeTheFirstNElements.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}
