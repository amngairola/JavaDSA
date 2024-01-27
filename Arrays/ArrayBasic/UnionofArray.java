// link: https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.List;

public class UnionofArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6 };
        int[] b = { 2, 3, 5 };
        List<Integer> r = sortedArray(a, b);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        List<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            r.add(a[i]);
        }
        int j = 0;
        int k = 0;
        while (j < a.length) {
            if (r.get(k) != b[j]) {
                r.add(b[j]);
                k++;
            }

        }

        return r;
    }
}
