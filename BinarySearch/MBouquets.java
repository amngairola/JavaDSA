package BinarySearch;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class MBouquets {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int k = 3;
        int m = 2;
        int ans = minDays(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }

    public static int minDays(int[] arr, int m, int k) {
        long val = (long) m * k;
        int n = arr.length;
        if (val > n)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // Find maximum and minimum:
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int s = min;
        int e = max;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (possibleDay(arr, mid, m, k)) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    static boolean possibleDay(int[] a, int day, int m, int k) {
        int count = 0;
        int totelDay = 0;
        // Count the number of bouquets:
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= day) {
                count++;
            } else {
                totelDay += count / k;
                count = 0;
            }
        }
        totelDay += count / k;
        return totelDay >= m;
    }
}
