package Arrays.ArrayBasic;

// https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
// arbitrary integer = any integer
public class Ksum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 1, -1, -1, 0 };
        int k = 0;
        int ans = getLongestSubarray(arr, k);
        System.out.println(ans);
    }

    public static int getLongestSubarray(int[] nums, int k) {
        // Write your code here.

        int maxCount = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            for (int end = start; end < nums.length; end++) {

                sum += nums[end];
                if (sum == k) {
                    maxCount = Math.max(maxCount, end - start + 1);
                }

            }
        }

        return maxCount;
    }
}
