package codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @name Data Reverse
 * @rank 6
 * @id 569d488d61b812a0f7000015
 * @url https://www.codewars.com/kata/569d488d61b812a0f7000015
 */
public class DataReverseTest {
    @Test
    public void Test1() {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        assertArrayEquals(data2, DataReverse.DataReverse(data1));
    }

    @Test
    public void Test2() {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        assertArrayEquals(data2, DataReverse.DataReverse(data1));
    }
}
