package Recursion.Basic;

public class SumOfDig {
    public static void main(String[] args) {
        int ans = sum(12345);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n < 1) {
            return n;
        }
        int d = n % 10;
        n /= 10;

        return sum(n) + d;
    }
}
