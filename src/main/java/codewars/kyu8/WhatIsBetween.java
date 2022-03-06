package codewars.kyu8;

/**
 * @name What is between?
 * @rank 8
 * @id 55ecd718f46fba02e5000029
 * @url https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */
public class WhatIsBetween {

    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];
        int cur = a;
        int i = 0;
        while (cur <= b) {
            result[i] = cur;
            cur++;
            i++;
        }
        return result;
    }
}
