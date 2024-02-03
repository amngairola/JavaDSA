package BasicRecursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int i) {
        if (i == 1) {
            return 1;

        } else {
            return i * sum(i - 1);
        }
    }
}
