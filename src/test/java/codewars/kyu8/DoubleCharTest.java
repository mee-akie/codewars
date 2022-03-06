package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Double Char
 * @rank 8
 * @id 56b1f01c247c01db92000076
 * @url https://www.codewars.com/kata/56b1f01c247c01db92000076
 */
public class DoubleCharTest {
    
    @Test
    public void testEmptyString() {
        assertEquals("", DoubleChar.doubleChar(""));
    }

    @Test
    public void testString() {
        System.out.println(DoubleChar.doubleChar("test"));
        assertEquals("tteesstt", DoubleChar.doubleChar("test"));
    }
}
