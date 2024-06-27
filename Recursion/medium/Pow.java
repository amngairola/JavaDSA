package Recursion.medium;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
       if (n > 0)
            return positive(x, n);

        else {
            n = Math.abs(n);
            return 1/(positive(x, n));
        }
    }

    static double positive(double x, int n) {
        if (n < 1)
            return 1;

        return x * myPow(x, n - 1);
    }
}