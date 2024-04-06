package Numbers;

// FindBit.java
// Q: find the rightmost set bit 

public class FindBit {
    public static void main(String[] args) {
        String s = "01101000";
        int ans = find(s);
        int temp = (1 << (ans));
        System.out.println(Integer.toBinaryString(ans & temp));
    }

    static int find(String binaryString) {
        int temp = -1;
        int n = binaryString.length();
        for (int i = 0; i < n; i++) {
            if (binaryString.charAt(i) == '1') {
                temp = i;
            }
        }
        return temp;
    }
}
