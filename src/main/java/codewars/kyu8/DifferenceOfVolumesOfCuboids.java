package codewars.kyu8;

/**
 * @name Difference of Volumes of Cuboids
 * @rank 8
 * @id 58cb43f4256836ed95000f97
 * @url https://www.codewars.com/kata/58cb43f4256836ed95000f97
 */
public class DifferenceOfVolumesOfCuboids {
    
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(firstCuboid[0]*firstCuboid[1]*firstCuboid[2] - secondCuboid[0]*secondCuboid[1]*secondCuboid[2]);
    }
}
