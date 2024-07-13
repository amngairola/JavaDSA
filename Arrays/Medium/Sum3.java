package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/3sum/
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if (hs.contains(third)) {
                    List<Integer> tmp = Arrays.asList(nums[i], nums[j], third);
                    tmp.sort(null);
                    // Using null as the comparator tells the sort method to use the natural
                    // ordering of the list's elements. If you want a custom order, you would
                    // provide a comparator instead of null.
                    st.add(tmp);
                }
                hs.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // --OPTIMAL APPROCH LESSER SC
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (i != 0 && a[i] == a[i - 1])
                continue;
            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == 0) {
                    List<Integer> tmp = Arrays.asList(a[i], a[j], a[k]);
                    ans.add(tmp);
                    j++;
                    k--;
                    while (j < k && a[j] == a[j - 1])
                        j++;
                    while (j < k && a[k] == a[k + 1])
                        k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }

        }

        return ans;
    }

    // 4 sum

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    } else if (sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }

        return ans;
    }
}
