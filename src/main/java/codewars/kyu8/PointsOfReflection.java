package codewars.kyu8;

import java.util.stream.IntStream;

/**
 * @name Points of Reflection
 * @rank 8
 * @id 57bfea4cb19505912900012c
 * @url https://www.codewars.com/kata/57bfea4cb19505912900012c
 */
public class PointsOfReflection {

    public static int[] reflectPoint(int[] p, int[] q) {
        return IntStream.range(0, p.length).map(i -> q[i]*2 - p[i]).toArray();
    }
}
