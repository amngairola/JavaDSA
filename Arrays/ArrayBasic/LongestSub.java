public class LongestSub {
    public static void main(String[] args) {
        // https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    }

    public static int longestSubarrayWithSumK(int[] a, long k) {
        int maxLength = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < a.length; end++) {
            currentSum += a[end];

            while (currentSum > k) {
                currentSum -= a[start];
                start++;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }
}