package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int target = 8;

        List<List<Integer>> result = findCombinations(arr, target);
        System.out.println(result);

    }

    static List<List<Integer>> findCombinations(int[] arr, int target) {
        List<List<Integer>> finalList = new ArrayList<>();

        if (arr.length == 0) {
            return finalList;
        }
        combinationSum(arr, target, 0, finalList, new ArrayList<>());
        return finalList;
    }

    static void combinationSum(int[] candidates, int target, int i, List<List<Integer>> ls, List<Integer> temp) {

        if (target == 0) {
            ls.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || i == candidates.length) {
            return;
        }

        temp.add(candidates[i]);
        combinationSum(candidates, target - candidates[i], i, ls, temp);
        temp.remove(temp.size() - 1);

        combinationSum(candidates, target, i + 1, ls, temp);///
    }
}
