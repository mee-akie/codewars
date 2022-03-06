package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Returning Strings
 * @rank 8
 * @id 55a70521798b14d4750000a4
 * @url https://www.codewars.com/kata/55a70521798b14d4750000a4
 */
public class ReturningStringsTest {
    
    @Test
    public void testString() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }
}
