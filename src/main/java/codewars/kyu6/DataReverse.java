package codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Data Reverse
 * @rank 6
 * @id 569d488d61b812a0f7000015
 * @url https://www.codewars.com/kata/569d488d61b812a0f7000015
 */
public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int[] ans = new int[data.length];
        int mult8 = data.length / 8;
        List<List<Integer>> list = new ArrayList<>();

        int aux = 0;
        for (int i = 0; i < mult8; i++) {
            List<Integer> l = new ArrayList<>();
            int k = 8;
            while (k != 0) {
                l.add(data[aux]);
                k--;
                aux++;
            }
            list.add(l);
        }

        List<List<Integer>> list_inv = new ArrayList<>();
        for (int i = mult8 - 1; i >= 0; i--) list_inv.add(list.get(i));

        aux = 0;
        for (List<Integer> l : list_inv) {
            int index = 0;
            while (index < l.size()) {
                ans[aux] = l.get(index);
                index++;
                aux++;
            }
        }
        return ans;
    }
}
