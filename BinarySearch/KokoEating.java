package BinarySearch;

public class KokoEating {

    public static void main(String[] args) {
        int[] v = { 7, 15, 6, 3 };
        int h = 8;
        int ans = minEatingSpeed(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");

    }

    // find maximum element in the array
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        ;
        int n = v.length;
        // find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static int minEatingSpeed(int[] p, int h) {
        int s = 0, e = findMax(p);
        while (s <= e) {
            int mid = s + (e - s) / 2;

            int time = calculateTotalHours(p, mid);

            if (time <= h) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }

        return s;
    }

    static int calculateTotalHours(int[] a, int hr) {

        int totalH = 0;
        for (int i = 0; i < a.length; i++) {
            totalH += Math.ceil((double) (a[i]) / (double) (hr));
        }
        return totalH;
    }
}
