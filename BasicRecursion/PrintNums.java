package BasicRecursion;

public class PrintNums {
    static int num = 1;

    public static void main(String[] args) {
        print(10);
    }

    // print

    static void print(int n) {
        if (num < n) {
            System.out.println(num);
            num++;
            print(n);
        }

    }

    // print n-1
    // static void print(int n) {
    // if (n >= 1) {
    // System.out.println(n);
    // n--;
    // print(n);
    // }

    // }
}
