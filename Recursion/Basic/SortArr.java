package Recursion.Basic;

public class SortArr {
    public static void main(String[] args) {
        int arr[] = { 20, 23, 23, 0, 45, 78, 88, };
        System.out.println(print(arr, 5));
    }

    static boolean print(int[] arr, int n) {
        if (n == 0) {
            return true;
        }
        if (arr[n] < arr[n - 1]) {
            return false;
        }

        return print(arr, n - 1);
    }
}
