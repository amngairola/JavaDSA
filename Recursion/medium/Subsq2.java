package Recursion.medium;

import java.util.ArrayList;

public class Subsq2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        // sub(arr, 0, list, 0, 2);
        subsseq(arr, 0, list, 0, 2);
    }

    private static void sub(int[] arr, int i, ArrayList<Integer> ls, int sum, int target) {
        if (i >= arr.length) {
            if (sum == target) {
                System.out.println(ls);
            }
            return;
        }
        ls.add(arr[i]);
        sum += arr[i];
        sub(arr, i + 1, ls, sum, target);
        ls.remove(ls.size() - 1);
        sum -= arr[i];
        sub(arr, i + 1, ls, sum, target);

    }

    // only print one sub sequence
    private static Boolean subsseq(int[] arr, int i, ArrayList<Integer> ls, int sum, int target) {
        if (i >= arr.length) {
            if (sum == target) {
                System.out.println(ls);
                return true;
            }
            return false;
        }
        ls.add(arr[i]);
        sum += arr[i];
        if (subsseq(arr, i + 1, ls, sum, target) == true) {
            return true;
        }
        ;
        ls.remove(ls.size() - 1);
        sum -= arr[i];
        if (subsseq(arr, i + 1, ls, sum, target) == true) {
            return true;
        }

        ;
        return false;
    }

    // count the number of subsequence possible
    private static int subsseqCount(int[] arr, int i, int sum, int target) {
        if (i >= arr.length) {
            if (sum == target)
                return 1;
            return 0;
        }
        sum += arr[i];
        int l = subsseqCount(arr, i + 1, sum, target);
        sum -= arr[i];
        int r = subsseqCount(arr, i + 1, sum, target);
        return l + r;
    }

}
