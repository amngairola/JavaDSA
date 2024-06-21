package Recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        Subset(arr);

        List<List<Integer>> ans = SubSetDuplicate(arr);
        for (List<Integer> a : ans) {
            System.out.println(a);
        }

    }

    private static List<List<Integer>> Subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    private static List<List<Integer>> SubSetDuplicate(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            s = 0;

            if (i > 0 && arr[i] == arr[i - 1]) {
                s = e + 1;
            }
            e = outer.size() - 1;
            int size = outer.size();
            for (int j = s; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
