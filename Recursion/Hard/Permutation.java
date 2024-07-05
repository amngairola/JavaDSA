package Recursion.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//LINK -  https://leetcode.com/problems/permutations/description/
public class Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(permute(arr));

    }

    static List<List<Integer>> outer = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        outer.clear();
        List<Integer> inner = new ArrayList<>();

        boolean freq[] = new boolean[nums.length];

        permutations(nums, inner, freq);
        return outer;
    }

    static void permutations(int[] arr, List<Integer> inner, boolean[] freq) {

        if (inner.size() == arr.length) {
            outer.add(new ArrayList<>(inner));
            return;

        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                inner.add(arr[i]);
                permutations(arr, inner, freq);
                inner.remove(inner.size() - 1);
                freq[i] = false;
            }
        }
    }

    static void permutation(int[] arr, int ind) {

        if (ind >= arr.length) {
            ArrayList<Integer> inner = new ArrayList<>();

            for (int j : arr) {
                inner.add(j);
            }

            outer.add(new ArrayList<>(inner));
            return;

        }

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, ind);
            permutation(arr, ind + 1);
            swap(arr, i, ind);
        }

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
