package kata.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOrOddTest {
    
    @Test
    public void testEven() {
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
        assertEquals("Even", EvenOrOdd.even_or_odd(2));
        assertEquals("Even", EvenOrOdd.even_or_odd(4));
    }

    @Test
    public void testOdd() {
        assertEquals("Odd", EvenOrOdd.even_or_odd(-1));
        assertEquals("Odd", EvenOrOdd.even_or_odd(1));
        assertEquals("Odd", EvenOrOdd.even_or_odd(3));
    }
}
