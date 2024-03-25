package Recursion.Basic;

// https://www.geeksforgeeks.org/problems/find-all-possible-palindromic-partitions-of-a-string/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.ArrayList;

public class PP {
    public static void main(String[] args) {
        print("geeks");
    }

    static void print(String s) {
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j);
                if (isPallindrome(str, 0, str.length() - 1)) {
                    al.add(str);
                }
            }
        }

        for (String palindrome : al) {
            System.out.print(palindrome + " ");
        }

    }

    static boolean isPallindrome(String str, int s, int e) {

        if (e - s == 0) {
            return true;

        }
        if (s > e) {
            return true;
        }

        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }

        return isPallindrome(str, s + 1, e - 1);
    }

}
