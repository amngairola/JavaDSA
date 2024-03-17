package Recursion.Basic;

public class FirstUppercase {
    public static void main(String[] args) {
        System.out.println(find("isUpperCase"));
    }

    static String find(String s) {
        int n = s.length();
        int i = 0;

        if (i >= n) {
            return null;
        }
        char c = s.charAt(i);

        if (Character.isUpperCase(c)) {
            return Character.toString(c);
        }

        String str = s.substring(i + 1, n);
        return find(str);
    }
}
