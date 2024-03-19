import java.util.*;

// https://www.geeksforgeeks.org/recursive-bubble-sort/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 0, 2, -1 };
        sort(arr, arr.length - 1);
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
}
