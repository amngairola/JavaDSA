package Recursion.medium;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        print("", "abc");
    }

    static void print(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            print(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> printList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(printList(f + ch + s, up.substring(1)));

        }

        return ans;

    }

    static int printcount(String p, String up) {
        if (up.isEmpty()) {

            return 1;
        }

        char ch = up.charAt(0);

        int ans = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans = ans + printcount(f + ch + s, up.substring(1));

        }

        return ans;

    }
}
