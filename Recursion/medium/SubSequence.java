package Recursion.medium;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        sub(arr, 0, list);
    }

    // GENRATE ALL POSSIBLE SUB SEQUENCE
    static void sub(int[] arr, int i, ArrayList<Integer> ls) {

        if (i >= arr.length) {
            System.out.println(ls);
            return;
        }
        ls.add(arr[i]);
        sub(arr, i + 1, ls);
        ls.remove(ls.size() - 1);
        sub(arr, i + 1, ls);
    }
}
