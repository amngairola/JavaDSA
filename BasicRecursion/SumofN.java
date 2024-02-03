package BasicRecursion;

// SumofN.java
public class SumofN {
    static int sum = 0;

    public static void main(String[] args) {
        sum(3);
    }

    static void sum(int i) {
        System.out.println(calulate(i, sum));
    }

    static int calulate(int i, int sum) {
        if (i < 1) {
            return sum;
        }
        return calulate(i - 1, sum + i);

    }
}
