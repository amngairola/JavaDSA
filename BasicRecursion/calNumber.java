package BasicRecursion;

public class calNumber {
    public static void main(String[] args) {
        System.out.println(fib(1, 3, 2, 5));

    }

    static int fib(int A, int B, int C, int N) {
        if (N == 1) {
            return A;
        }
        if (N == 2) {
            return B;
        }
        if (N == 3) {
            return C;
        }

        return fib(A, B, C, N - 1) +
                fib(A, B, C, N - 2) +
                fib(A, B, C, N - 3);

    }
}
