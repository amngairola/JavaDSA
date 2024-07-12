package Arrays.Medium;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(kthRow(6));
    }

    // print the nth row of the pascal triangle:

    // https://www.naukri.com/code360/problems/find-kth-row-of-pascal-s-triangle_1082551?interviewProblemRedirection=true&search=Pascal%27s%20Triangle&leftPanelTabValue=SUBMISSION

    public static ArrayList<Long> kthRow(int k) {
        ArrayList<Long> ls = new ArrayList<>();
        print(k, 1L, 1, ls); // 1L = 1 Long -> to convert int to long
        return ls;
    }

    static void print(int row, Long ans, int col, ArrayList<Long> ls) {
        if (col > row)
            return;
        ls.add(ans);
        ans = ans * (row - col);
        ans = ans / col;
        print(row, ans, col + 1, ls);
    }

    // Print the full triangle ->
    // https://www.naukri.com/code360/problems/pascal-s-triangle_1089580?interviewProblemRedirection=true&search=Pascal%27s%20Triangle&leftPanelTabValue=SUBMISSION

    static ArrayList<ArrayList<Long>> finalans = new ArrayList<>();

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        finalans.clear();

        for (int i = 1; i <= n; i++) {
            ArrayList<Long> ls = new ArrayList<>();
            print(i, 1L, 1, ls);
            finalans.add(ls);

        }

        return finalans;
    }

    static void print2(int row, Long ans, int col, ArrayList<Long> ls) {
        if (col > row)
            return;
        ls.add(ans);
        ans = ans * (row - col);
        ans = ans / col;
        print(row, ans, col + 1, ls);
    }
}
