package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };

        // System.out.println(findIndex(arr, 4, 0));
        // System.out.println(findIndexLast(arr, 4, arr.length-1));
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        // System.out.println(ans);
        // System.out.println(list);
        find(arr, 4, 0);
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);

    }
    // --- first approch
    // static void findAllIndex(int[] arr, int n, int i) {
    // if (i == arr.length) {
    // return;
    // }
    // if (arr[i] == n) {
    // list.add(arr[i]);
    // }

    // findAllIndex(arr, n, i + 1);
    // }

    // ---second approch

    static void find(int[] arr, int n, int i) {
        ArrayList<Integer> indices = findAllIndex(arr, n, 0);
        System.out.println("Indices of " + n + " in the array: " + indices);
    }

    // static ArrayList<Integer> findAllIndex(int[] arr, int n, int i,
    // ArrayList<Integer> list) {
    // if (i == arr.length) {
    // return list;
    // }
    // if (arr[i] == n) {
    // list.add(i);
    // }

    // return findAllIndex(arr, n, i + 1, list);
    // }

    static ArrayList<Integer> findAllIndex(int[] arr, int n, int i) {

        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length) {
            return list;
        }
        if (arr[i] == n) {
            list.add(i);
        }

        list.addAll(findAllIndex(arr, n, i + 1));

        // list.addAll(findAllIndex(arr, n, i + 1)); ensures that the results obtained
        // from subsequent recursive calls are added to the current list
        return list;
    }

}
