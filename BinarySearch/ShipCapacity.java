public class ShipCapacity {
    // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
    public static void main(String[] args) {
        int[] shipCapacity = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(shipWithinDays(shipCapacity, 5));
    }

    static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int s = Integer.MIN_VALUE;
        int e = 0;
        // finding the range
        for (int i = 0; i < n; i++) {
            s = Math.max(s, weights[i]);
            e += weights[i];
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (findDays(weights, mid, n) <= days) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }

    static int findDays(int[] arr, int cap, int n) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] > cap) {
                days += 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }

        return days;
    }
}
