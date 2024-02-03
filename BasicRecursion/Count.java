package BasicRecursion;

public class Count {

    public static void main(String[] args) {
        // print(10); // print 1-10

        int a = print(10, 1); // print 10-1
    }

    /*
     * static int print(int i) {
     * if (i < 1) {
     * return i;
     * } else {
     * print(i - 1);
     * System.out.println(i); //this will exicute after when this print function
     * gets the return value
     * }
     * return 0;
     * }
     */
    static int print(int i, int n) {
        if (n > i) {
            return n;
        } else {
            print(i, n + 1);
            System.out.println(n);

        }
        return 0;
    }
}
