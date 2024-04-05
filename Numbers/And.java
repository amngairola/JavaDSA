package Numbers;

public class And {
    public static void main(String[] args) {
        System.out.println(find(10));
    }

    static boolean find(int n) {
        return (n & 1) == 1;
    }
}
