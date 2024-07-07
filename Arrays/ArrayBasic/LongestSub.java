import java.util.HashMap;

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

    // https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

    // longest sub array sum = K
    int subArr(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);

            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }
        return maxLen;

    }

    // way 2

    static void subArr(int[] arr, int k) {

        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;

        while (right < arr.length) {

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            sum += arr[right];

        }

        return maxLen;
    }
}