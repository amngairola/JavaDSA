package BasicRecursion;

public class bSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 0;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1)
            System.out.println("Element not present in array" + result);
        else
            System.out.println("Element found at index " + result);
    }

    public static int binarySearch(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        {
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                // e = m -1;
                return binarySearch(arr, target, m + 1, e);
            }

            return binarySearch(arr, target, s, m - 1);
        }
    }
}
