package Recursion.Basic;

public class Pettren {
    public static void main(String[] args) {
        // print(4);
        // print(4, 0);
        t1(4, 0);
    }

    static void print(int n) {
        if (n == 0)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
        System.out.println("");
        print(n - 1);
    }

    static void print(int r, int c) {
        if (r > 4)
            return;

        if (c < r) {
            System.out.print("*");
            print(r, c + 1);
        } else {
            System.out.println();
            print(r + 1, 0);
        }

    }

    static void t1(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {
            t1(r, c + 1);
            System.out.print("*");
        } else {
            t1(r - 1, 0);
            System.out.println();
        }

    }
}
