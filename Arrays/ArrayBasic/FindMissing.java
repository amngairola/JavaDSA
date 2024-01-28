public class FindMissing {
    // problem: https://leetcode.com/problems/missing-number/submissions/1158403128/
    public static void main(String[] args) {

    }

    // some time a problem has simple solution
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int i = 0;
        int ans = 0;
        while (i < n) {
            ans += nums[i];
            i++;
        }
        return sum - ans;

    }
}
