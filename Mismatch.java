import java.util.ArrayList;

public class Mismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        sort(arr);
    }

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = findDuplicate(nums);
        int j = 0;
        while (j < ans.size()) {
            System.out.println(ans.get(j));
            j++;
        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static ArrayList<Integer> findDuplicate(int[] arr) {
        int i = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                temp.add(arr[i]);
                temp.add(i + 1);
            }
            i++;
        }
        return temp;
    }

}
