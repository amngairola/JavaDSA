package BasicRecursion;

public class SumOfDig {

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }

    static int sum(int n) {

        if (n == 0) {

            return 0;
        }
        int d = n % 10;

        return d + sum(n / 10);

    }
}
