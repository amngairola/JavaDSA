package BasicRecursion;
//functional recursion

public class Fr {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    static int sum(int i) {
        if (i == 0) {
            return 0;

        } else {
            return i + sum(i - 1);
        }
    }
}
