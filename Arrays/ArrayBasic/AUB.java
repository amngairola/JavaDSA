package Arrays.ArrayBasic;

//https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;

public class AUB {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3 };
        int[] b = { 2, 2, 4 };
        List<Integer> ans = sortedArray(a, b);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {

        ArrayList<Integer> union = new ArrayList<>();
        for (int i : a) {
            union.add(i);
        }

        for (int i : b) {
            if (!union.contains(i)) {
                union.add(i);
            }
        }

        sort(union);
        return union;
    }

    static void sort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != arr.get(i) - 1) {
                Collections.swap(arr, i, arr.get(i) - 1); // swap list elements *builin
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                }
            }
        }

    }
}

/*
 * import java.util.*;
 * public class Solution {
 * public static List< Integer > sortedArray(int []a, int []b) {
 * // Write your code here
 * ArrayList<Integer> union = new ArrayList<>();
 * for (int i : a) {
 * union.add(i);
 * }
 * 
 * for (int i : b) {
 * if (!union.contains(i)) {
 * union.add(i);
 * }
 * }
 * 
 * sort(union);
 * return union;
 * }
 * 
 * static void sort(List<Integer> arr) {
 * for (int i = 0; i < arr.size(); i++) {
 * if (arr.get(i) != arr.get(i) - 1) {
 * Collections.swap(arr, i, arr.get(i) - 1);
 * }
 * }
 * for (int i = 0; i < arr.size(); i++) {
 * for (int j = i + 1; j < arr.size(); j++) {
 * if (arr.get(i) == arr.get(j)) {
 * arr.remove(j);
 * }
 * }
 * }
 * 
 * }
 * }
 */