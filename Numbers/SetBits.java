public class SetBits {
    public static void main(String[] args) {
        System.out.println(print(11));
    }

    static int print(int n) {
        int c = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                c++;

            n = n >> 1;
        }
        return c;
    }
}
