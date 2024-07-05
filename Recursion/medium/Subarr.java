package Recursion.medium;

import java.util.ArrayList;
import java.util.Collections;

public class Subarr {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        // System.out.println(subarraySum(arr, 2));
        ArrayList<Integer> sum = new ArrayList<>();
        subsum(arr, 0, 0, sum);

        Collections.sort(sum);
        System.out.println(sum);
    }

    public static int subarraySum(int[] arr, int k) {
        int c = 0;
        sum(arr, k, 0);
        return c;

    }

    // COUNT ALL THE POSSIBLE SUBSET
    static int sum(int[] arr, int target, int i) {
        if (i >= arr.length) {
            return 0;
        }

        int c = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (sum == target) {
                c++;
            }
        }
        return c + sum(arr, target, i + 1);
    }

    // RETUN THE SUM OF POSIBLE SUBSETS
    static void subsum(int[] arr, int s, int i, ArrayList<Integer> ans) {

        if (i >= arr.length) {
            ans.add(s);
            return;
        }

        s += arr[i];
        subsum(arr, s, i + 1, ans);
        s -= arr[i];
        subsum(arr, s, i + 1, ans);

    }

    // RETURN ALL THE SUBSET WITHOUT CONTAINING DUPLICATE
    /*
     * WE CAN DO IT BY THE ABOVE METHOD INSTED OF ADDING ARR[I] IN THE SUM WE CAN
     * ADD
     * ARR[I] IN THE ARRAYLIST AND WHEN I>= LENGTH OF THE ARRAY WE CAN JUST ADD THAT
     * LIST IN THE OUR FINAL ARRAY LIST
     */

}
