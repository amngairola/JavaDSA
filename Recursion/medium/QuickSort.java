package Recursion.medium;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6, 5, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int s, int e) {
        if (s >= e)
            return;

        int p = find(arr, s, e);
        sort(arr, s, p - 1);
        sort(arr, p + 1, e);

    }

    private static int find(int[] arr, int s, int e) {
        int pivot = arr[s];
        int start = s;
        int end = e;

        while (s < e) {
            while (s < end && arr[s] <= pivot) {
                s++;
            }
            while (e > start && arr[e] > pivot) {
                e--;
            }

            if (s < e)
                swap(arr, s, e);
        }

        swap(arr, start, e);
        return e;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
