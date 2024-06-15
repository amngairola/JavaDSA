package Recursion.Basic;

import java.util.*;

// https://www.geeksforgeeks.org/recursive-bubble-sort/
public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 3, 0, 2, -1 };
        int[] arr = { 4, 3, 2, 0, 5 };
        // sort(arr, arr.length - 1);
        sort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int n) {
        int count = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                count++;
            }
        }
        if (count == 0) {
            return;
        }

        sort(arr, n);
    }

    static void sort2(int[] arr, int s, int e) {
        if (e == 0) {
            return;
        }
        if (s >= e) {
            sort2(arr, 0, e - 1);
            return;
        }

        int s2 = s + 1;
        if (arr[s] > arr[s2]) {
            swap(arr, s, s2);
        }

        sort2(arr, s + 1, e);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
