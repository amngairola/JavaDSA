package BasicRecursion;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        reverse(arr, 0);
        for (int index = 0; index < arr.length; index++) {

            System.out.println(arr[index]);
        }
    }

    static void reverse(int[] arr, int start) {
        int n = arr.length - 1;
        if (start < n / 2) {
            swap(arr, start, n - start);
            reverse(arr, start + 1);
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
