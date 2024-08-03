package Strings.Basic;

public class OddNum {
    public static void main(String[] args) {

    }

    public String largestOddNumber(String num) {
        int n = num.length();
        String ans = "";
        for (int i = 0; i < n; i++) {

            char currentChar = num.charAt(i);
            int digit = Character.getNumericValue(currentChar);
            if (digit % 2 != 0) {
                ans = num.substring(0, i + 1);
            }

        }

        return ans;
    }
}
