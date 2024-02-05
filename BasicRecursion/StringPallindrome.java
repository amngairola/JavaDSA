
package BasicRecursion;

public class StringPallindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(Pallindrome(s));

    }

    static boolean Pallindrome(String s) {
        int r = s.length() - 1;
        int l = 0;
        if (r == 0 || r == 1) {
            return true;
        }
        return check(s, l, r);

    }

    static boolean check(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) == s.charAt(r)) {
            return check(s, l + 1, r - 1);
        }
        return false;
    }
}