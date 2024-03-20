package Recursion.Basic;

// https://www.geeksforgeeks.org/recursive-insertion-sort/
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 0, 2, -1 };
        sort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr, int n) {
        sort(arr, n, 1);
    }

    static void sort(int[] arr, int n, int i) {
        if (i > n) {
            return;
        }

        int j = i - 1;

        while (j >= 0 && arr[j] > arr[i]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = arr[i];

        sort(arr, n, i + 1);
    }
}
