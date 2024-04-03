package Recursion.Basic;

public class Fib {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println((int) fibbo(i));

        }
    }

    // static int print(int n) {
    // if (n < 2) {
    // return n;
    // }

    // return print(n - 1) + print(n - 2);
    // }

    static double fibbo(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        double fib = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);

        return fib;
    }
}
