package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Is it even?
 * @rank 8
 * @id 555a67db74814aa4ee0001b5
 * @url https://www.codewars.com/kata/555a67db74814aa4ee0001b5
 */
public class IsItEvenTest {
    
    @Test
    public void testEven() {
        assertTrue(new IsItEven().isEven(-4));
        assertTrue(new IsItEven().isEven(2));
        assertTrue(new IsItEven().isEven(6));
    }

    @Test
    public void testOdd() {
        assertFalse(new IsItEven().isEven(0.5));
        assertFalse(new IsItEven().isEven(1));
        assertFalse(new IsItEven().isEven(-1));
    }
}
