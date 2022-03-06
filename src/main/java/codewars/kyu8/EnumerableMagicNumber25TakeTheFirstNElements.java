package codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.copyOfRange;

/**
 * @name Enumerable Magic #25 - Take the First N Elements
 * @rank 8
 * @id 545afd0761aa4c3055001386
 * @url https://www.codewars.com/kata/545afd0761aa4c3055001386
 */
public class EnumerableMagicNumber25TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        if(arr.length <= n) return arr;
        return copyOfRange(arr, 0, n);
    }

    public static void main(String [] args){
        int [] a = take(new int[]{0, 1, 2}, 3);
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < a.length; i++) l.add(a[i]);
        System.out.println(l.toString());
    }
}
