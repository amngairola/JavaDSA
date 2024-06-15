package Recursion.Basic;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 0, 5, 2, 1, 0 };
        sort(arr, 0, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int max, int e) {
        if (e == 1) {
            return;
        }

        if (s >= e) {
            swap(arr, max, e);
            sort(arr, 0, 0, e - 1);
            return;
        }

        if (arr[s] > arr[max]) {
            max = s;
        }
        sort(arr, s + 1, max, e);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
