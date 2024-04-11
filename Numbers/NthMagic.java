package Numbers;

public class NthMagic {
    public static void main(String[] args) {
        System.out.println(find(6));
    }

    // ## brute force
    // static int find(int n) {
    // String b = Integer.toBinaryString(n);
    // int magic = 0;
    // int c = 1;
    // for (int i = b.length() - 1; i >= 0; i--) {
    // if (b.charAt(i) == '1') {
    // magic += Math.pow(5, c);
    // }
    // c++;
    // }
    // return magic;
    // }

    static int find(int n) {

        int magic = 0;
        int base = 5;
        for (int i = n; i > 0; i--) {
            int last = n & 1; // geting the last digit : ie. 0 or 1
            n = n >> 1; // right shifting every bit of the number until n==0
            magic += last * base; // if last digit == 1 then we will get the ans when * with the base value until
                                  // n< 0

            base *= 5; // updating base for every bit
        }
        return magic;
    }
}
