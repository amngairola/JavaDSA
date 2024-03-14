package BasicRecursion;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

        sort(arr, arr.length - 1);
    }

    static void sort(int[] arr, int n) {

        if (n == 1) {
            return;
        }

        int c = 0;

        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                c = c + 1;
            }

        if (c == 0) {
            return;
        }

        sort(arr, n - 1);
    }
}
