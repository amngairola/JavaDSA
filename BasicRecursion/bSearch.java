package BasicRecursion;

public class bSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;
        int result = binarySearch(arr, target, 0, arr.length - 1, 0 + arr.length / 2);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
    }

    public static int binarySearch(int[] arr, int target, int s, int e, int mid) {

        mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            binarySearch(arr, target, s, mid - 1, mid);
        } else {
            binarySearch(arr, target, mid + 1, e, mid);
        }
        return 0;
    }
}
