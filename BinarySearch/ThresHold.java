package BinarySearch;

//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
public class ThresHold {
    public static void main(String[] args) {

    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int divisor = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            divisor = Math.max(nums[i], divisor);
        }

        int s = 1;
        int e = divisor;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (res(nums, mid, n) <= threshold) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }

    static int res(int[] arr, int div, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }
}
