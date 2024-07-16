package Arrays.Medium;

import java.util.ArrayList;

public class MergeArr {
    public static void main(String[] args) {
        int[] a1 = { 1, 4, 6, 10, 0, 0 };
        int[] a2 = { 2, 5 };

        a1 = sort(a1, a2, 4, 2);

        for (int i : a1) {
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int a1[], int a2[], int m, int n) {
        // Last index of the merged array
        int last = m + n - 1;

        // Last index of the first array
        int i = m - 1;
        // Last index of the second array
        int j = n - 1;

        // Merge the two arrays starting from the end
        while (i >= 0 && j >= 0) {
            if (a1[i] > a2[j]) {
                a1[last] = a1[i];
                i--;
            } else {
                a1[last] = a2[j];
                j--;
            }
            last--;
        }

        // If there are remaining elements in a2
        while (j >= 0) {
            a1[last] = a2[j];
            j--;
            last--;
        }

        return a1;
    }

    // input as ArrayList
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int m = a.size();
        int n = b.size();

        // Extend the size of a to accommodate elements of b
        for (int k = 0; k < n; k++) {
            a.add(0); // Add placeholders for elements of b
        }

        int last = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (a.get(i) > b.get(j)) {
                a.set(last, a.get(i));
                i--;
            } else {
                a.set(last, b.get(j));
                j--;
            }
            last--;
        }

        // If there are remaining elements in b
        while (j >= 0) {
            a.set(last, b.get(j));
            j--;
            last--;
        }
    }
}
