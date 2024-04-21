package Recursion.Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        print(1234);
    }

    static void print(int n) {
        System.out.println(print(n, 0));

    }

    static int print(int n, int rev) {
        if (n > 0) {
            rev = rev * 10 + n % 10;

            return print(n /= 10, rev);
        }

        return rev;
    }
}
