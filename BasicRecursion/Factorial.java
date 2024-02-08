package BasicRecursion;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static void main(String[] args) {

        // int[] ans = fib(5);
        // for (var i = 0; i < ans.length; i++) {
        // System.out.println(ans[i]);
        // }
        List<Long> ans = factorialNumbers(5);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    // static int sum(int i) {
    // if (i == 1) {
    // return 1;

    // } else {
    // return i * sum(i - 1);
    // }
    // }
    public static List<Long> factorialNumbers(long n) {
        List<Long> ans = new ArrayList<Long>();
        for (long i = 1; i <= n; i++) {
            long factorial = factorial(i);
            if (factorial <= n) {
                ans.add(factorial);
            } else {
                break;
            }
        }
        return ans;
    }

    static long factorial(long i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
}
