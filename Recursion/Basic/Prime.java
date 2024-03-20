package Recursion.Basic;

public class Prime {
    public static void main(String[] args) {
        prime(11);
    }

    static void prime(int i) {
        System.out.println(print(15, 1));
    }

    static boolean print(int n, int i) {

        if (i > n % 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        }

        return print(n, i + 1);
    }

}
