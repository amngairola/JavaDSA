public class Power {
    public static void main(String[] args) {
        System.out.println(print(3, 4));
    }

    // power of any
    static int print(int a, int b) {

        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                ans *= a;
            }
            a *= a;
            b = b >> 1;
        }

        return ans;

    }
}
