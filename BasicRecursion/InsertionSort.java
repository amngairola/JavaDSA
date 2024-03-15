package BasicRecursion;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

        sort(arr, arr.length - 1);
    }

    static void sort(int[] arr, int n) {

        if (n <= 1) {
            return;
        }
        sort(arr, n - 1);

        int last = arr[n - 1];
        int i = n - 2;

        while (i >= 0 && arr[i] > last) {

            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = last;

    }
}
