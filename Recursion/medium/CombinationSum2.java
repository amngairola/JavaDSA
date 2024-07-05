package Recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* LINK - https://leetcode.com/problems/combination-sum/description/
 */

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 1, 2 };
        int target = 5;

        List<List<Integer>> a = combinationSum(arr, target);

        System.out.println(a);
    }

    static List<List<Integer>> ansSet = new ArrayList<>();

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ansSet.clear();
        Arrays.sort(candidates); // sort array for preventing duplicate element combinations
        List<Integer> ls = new ArrayList<>();
        // sum(candidates, target, 0, ls);
        // Sum(candidates, target, 0, ls);
        findCombinations(candidates, target, 0, ls);

        return ansSet;
    }

    static void sum(int[] arr, int target, int i, List<Integer> temp) {

        if (i >= arr.length) {
            if (target == 0) {
                ansSet.add(new ArrayList<>(temp));
            }

            return;
        }

        if (arr[i] <= target) {
            temp.add(arr[i]);
            sum(arr, target - arr[i], i, temp);
            temp.remove(temp.size() - 1);

        }

        sum(arr, target, i + 1, temp);

    }

    // PART -2 **The solution set must not contain duplicate combinations .
    // USING SET , FOR NOT ADDING THE DUPLICATE ELEMENT **BROOTFORCE METHOD
    static void Sum(int[] arr, int target, int i, List<Integer> temp) {
        if (i >= arr.length) {
            if (target == 0) {
                Collections.sort(temp);
                ansSet.add(new ArrayList<>(temp));
            }
            return;
        }

        if (arr[i] <= target) {
            temp.add(arr[i]);
            Sum(arr, target - arr[i], i + 1, temp);
            temp.remove(temp.size() - 1);
        }

        Sum(arr, target, i + 1, temp);

    }

    // **The solution set must not contain duplicate combinations.

    // --THE OPTIMAL APPROCH
    static void findCombinations(int[] arr, int target, int i, List<Integer> temp) {

        if (target == 0) {
            ansSet.add(new ArrayList<>(temp));
            return;
        }

        // picking the element from index till length of the array
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1])
                continue;
            if (arr[j] > target)
                break;

            temp.add(arr[j]);
            findCombinations(arr, target - arr[j], j + 1, temp);
            temp.remove(temp.size() - 1);
        }

    }

    // Print all subset without containg duplicate subset

    // LINK - https://leetcode.com/problems/subsets-ii/

    static void findCombinations(int[] arr, int i, List<Integer> temp) {
        ansSet.add(new ArrayList<>(temp));
        // picking the element from index till length of the array
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1])
                continue;

            temp.add(arr[j]);
            findCombinations(arr, j + 1, temp);
            temp.remove(temp.size() - 1);
        }

    }

}
