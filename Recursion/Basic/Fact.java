package Recursion.Basic;

// https://www.hackerrank.com/challenges/30-recursion/problem
public class Fact {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    static int fact(int n) {
        if (n == 1) {
            return n;
        }

        return fact(n - 1) * n;
    }
}
