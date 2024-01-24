// problem: https://leetcode.com/problems/first-missing-positive/
public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        int a = FindMissing(arr);

        System.out.println(a);
    }

    public static void sort(int[] nums) {
        int i = 0;
        int length = nums.length - 1;
        while (i <= length) {
            if (nums[i] > 0 && nums[i] <= length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int FindMissing(int[] arr) {
        int i = 0;
        int temp = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                temp = i + 1;
                return temp;
            }
            i++;

        }
        if (arr.length == 1) {
            temp = arr[0] + 1;
        } else {
            temp = arr[arr.length - 1] + 1;
        }

        return temp;

    }

}
