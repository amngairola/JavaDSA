package Recursion.Basic;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    static int sum(int x) {
        if (x < 1) {
            return x;
        }

        return sum(x - 1) + x;
    }
}
