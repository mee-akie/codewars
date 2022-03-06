package codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * @name What is between?
 * @rank 8
 * @id 55ecd718f46fba02e5000029
 * @url https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */
public class WhatIsBetween {
    public static int[] between(int a, int b) {
        List<Integer> l = new ArrayList<>();
        for(int i = a; i <= b; i++) l.add(i);
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
