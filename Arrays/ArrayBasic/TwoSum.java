package Arrays.ArrayBasic;

/*SECTION - problemLik :https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf */

public class TwoSum {
    public static void main(String[] args) {
        int[] Book = { 4, 1, 2, 3, 1 };
        String ans = read(1, Book, 5);
        System.out.println(ans);
    }

    public static String read(int n, int[] book, int target) {
        // Write your code here.
        String ans = "no";

        for (int j = 0; j < n - 1; j++) {
            int temp = book[j];

            for (int i = 0; i < n; i++) {
                if (temp + book[i] == target) {
                    ans = "yes";
                    return ans;
                }
            }
        }
        return ans;
    }
}
