package codewars.kyu8;

/**
 * @name Find Maximum and Minimum Values of a List
 * @rank 8
 * @id 577a98a6ae28071780000989
 * @url https://www.codewars.com/kata/577a98a6ae28071780000989
 */
public class FindMaximumAndMinimumValuesOfAList {
    
    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
