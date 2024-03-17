package Recursion.Basic;
// https://leetcode.com/problems/reverse-string/description/

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(s);
        System.out.println(s);

    }

    static void reverseString(char[] s) {
        rev(s, 0, s.length - 1);
    }

    static void rev(char[] str, int l, int r) {
        if (l > r) {
            return;
        }

        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;

        rev(str, l + 1, r - 1);

    }

}
