package Recursion.Basic;

public class Duplicate {
    public static void main(String[] args) {

        String str = "aaaabbbbbb";
        str = remove(str); // Update the value of str with the returned string
        System.out.println(str);

    }

    static String remove(String str) {
        char[] arr = str.toCharArray();
        duplicate(arr, str.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') {
                sb.append(arr[i]);
            }
        }

        return new String(sb);

    }

    static void duplicate(char[] str, int n) {
        if (n <= 1) {
            return;
        }

        if (str[n - 1] == str[n - 2]) {
            str[n - 1] = '0';
        }

        duplicate(str, n - 1);

    }
}
