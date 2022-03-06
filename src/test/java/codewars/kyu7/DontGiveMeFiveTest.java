package codewars.kyu7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Don't give me five!
 * @rank 7
 * @id 5813d19765d81c592200001a
 * @url https://www.codewars.com/kata/5813d19765d81c592200001a
 */
public class DontGiveMeFiveTest {
    @Test
    public void exampleTests() {
        assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
        assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
    }
}
