public class PowOf {
    public static void main(String[] args) {
        System.out.println(print(8));
    }

    // power of 2
    static boolean print(int n) {
        if (n == 0)
            return false;
        return (n & (n - 1)) == 0;

    }
}
