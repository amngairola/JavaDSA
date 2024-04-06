package Numbers;

//javac FindIthBit.java
public class FindIthBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(find((byte) 101011001, 3)));
    }

    static int find(byte x, int n) {
        return x & (1 << (n - 1));
    }
}
