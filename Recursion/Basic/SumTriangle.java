package Recursion.Basic;

// https://www.geeksforgeeks.org/sum-triangle-from-array/
import java.sql.Array;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A, 5);
    }

    public static void printTriangle(int[] arr, int n) {
        if (n < 1) {
            return;
        }

        int[] temp = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        printTriangle(temp, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}
