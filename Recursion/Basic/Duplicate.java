package Recursion.Basic;

public class Duplicate {
    public static void main(String[] args) {

        String str = "aaaabbbbbb";
        remove(str);
        System.out.println(str);

    }

    static void remove(String str) {
        char[] arr = str.toCharArray();
        duplicate(arr, str.length());

        String s = new String(arr);

    }

    static void duplicate(char[] str, int n) {

        if (str[n - 1] == str[n - 2]) {
            str[n - 1] = '0';
        }
        if (n == 2) {
            return;
        }

        duplicate(str, n - 1);

    }
}
