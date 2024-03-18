package Recursion.Basic;

import java.util.Scanner;

public class SankalpNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Calculate and print f(n) for the current test case
            System.out.println(print(a, b, n));
        }
    }

    static int print(int a, int b, int n) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        int fn_1 = print(a, b, n - 1); //
        int fn_2 = print(a, b, n - 2);

        return fn_1 ^ fn_2;

    }
}
