package Recursion.Basic;

public class RotatedArr {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(find(arr, 0, 7, 1));

    }

    static int find(int[] arr, int s, int e, int key) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[s] <= arr[mid]) {
            // Check if the key lies in the left half
            if (key >= arr[s] && key < arr[mid]) {
                return find(arr, s, mid - 1, key);
            } else {
                return find(arr, mid + 1, e, key);
            }
        } else {
            // The right half is sorted
            // Check if the key lies in the right half
            if (key >= arr[mid] && key <= arr[e]) {
                return find(arr, mid + 1, e, key);
            } else {
                return find(arr, s, mid - 1, key);
            }
        }
    }
}