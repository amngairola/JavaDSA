package Numbers;

//!FORMULA to find number of digit in any number with base b = int ans = (int) (Math.log(n) / Math.log(b)) + 1; -- explain: This line calculates the number of digits in the number n when expressed in base b
public class Digits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
