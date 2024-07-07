package Arrays.Medium;

// https://leetcode.com/problems/maximum-subarray/
public class KadanesAlgo {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max)
                max = sum;

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
