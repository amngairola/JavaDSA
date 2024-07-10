package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/zero-matrix_1171153?leftPanelTabValue=SUBMISSION
public class SetMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.

        int[] r = new int[n];
        int[] c = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;

    }
}
