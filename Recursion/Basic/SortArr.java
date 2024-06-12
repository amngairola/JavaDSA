package Recursion.Basic;

public class SortArr {
    public static void main(String[] args) {
        int arr[] = { 20, 23, 0, 23, 45, 78 };
        System.out.println(p(arr, 6));
    }

    static boolean p(int[] arr, int length) {
        int e = length - 1;
        if (e == 0)
            return true;

        return arr[e] >= arr[e - 1] && p(arr, length - 1);
    }

}
