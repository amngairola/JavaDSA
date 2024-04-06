package Numbers;

// SetIthBit.java

public class SetIthBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(find((byte) 101000001, (byte) 2)));
    }

    static int find(byte x, byte n) {
        return x | (1 << (n - 1));
    }
}
