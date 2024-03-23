package Recursion.Basic;

public class Possible_Palindrome {
    public static void main(String[] args) {

        print("geeks");

    }

    static void print(String s) {
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        print(c, c.length - 1);
    }

    static void print(char[] c, int n) {
        if (n <= 1) {
            return;
        }
        // int i = n;
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }

    }
}
