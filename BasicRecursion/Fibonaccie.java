package BasicRecursion;

public class Fibonaccie {
    // static int s = 0;

    // public static void main(String[] args) {

    // int[] ans = fib(5);
    // for (var i = 0; i < ans.length; i++) {
    // System.out.println(ans[i]);
    // }
    // }

    // static int[] fib(int n) {
    // int[] arr = new int[n];
    // f(arr, n, 0);
    // return arr;
    // }

    // static void f(int[] arr, int n, int s) {
    // if (s < n) {
    // if (s <= 1) {
    // arr[s] = s;
    // } else {
    // arr[s] = arr[s - 1] + arr[s - 2];
    // }
    // f(arr, n, s + 1);
    // }
    // }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    static int fib(int n) {
        // if (n == 1) {
        // return 1;
        // }
        // if (n == 0) {
        // return 0;
        // }
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}