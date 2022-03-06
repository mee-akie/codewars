package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Hex to Decimal
 * @rank 8
 * @id 57a4d500e298a7952100035d
 * @url https://www.codewars.com/kata/57a4d500e298a7952100035d
 */
public class HexToDecimalTest {
    
    @Test
    public void testHex() {
        assertEquals(-27, HexToDecimal.hexToDec("-1B"));
        assertEquals(100, HexToDecimal.hexToDec("64"));
        assertEquals(999, HexToDecimal.hexToDec("3E7"));
    }
}
