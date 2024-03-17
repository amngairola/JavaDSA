package Recursion.Basic;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
        System.out.println(min(arr, arr.length - 1));
        System.out.println(max(arr, arr.length - 1));

    }

    static int min(int[] arr, int n) {
        if (n < 1) {
            return arr[n];
        }

        if (arr[n] < arr[n - 1]) {
            int temp = arr[n - 1];
            arr[n - 1] = arr[n];
            arr[n] = temp;
        }

        return min(arr, n - 1);
    }

    static int max(int[] arr, int n) {
        if (n < 1) {
            return arr[n];
        }

        if (arr[n] > arr[n - 1]) {
            int temp = arr[n - 1];
            arr[n - 1] = arr[n];
            arr[n] = temp;
        }

        return max(arr, n - 1);
    }
}
