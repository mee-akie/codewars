package codewars.kyu8;

import java.util.Arrays;

/**
 * @name Enumerable Magic #25 - Take the First N Elements
 * @rank 8
 * @id 545afd0761aa4c3055001386
 * @url https://www.codewars.com/kata/545afd0761aa4c3055001386
 */
public class EnumerableMagicNumber25TakeTheFirstNElements {

    public static int[] take(int[] arr, int n) {
        return arr.length < n ? arr : Arrays.copyOfRange(arr, 0, n);
    }
}
