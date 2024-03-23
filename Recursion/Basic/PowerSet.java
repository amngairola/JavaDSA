package Recursion.Basic;

//https://www.geeksforgeeks.org/powet-set-lexicographic-order/

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet {
    public static void main(String[] args) {
        String str = "cab";
        powerSet(str);
    }

    static void powerSet(String s) {
        char[] c = s.toCharArray();
        if (c.length == 1) {
            return;
        }
        Arrays.sort(c);
        ArrayList<String> al = new ArrayList<>();
        set(c, al, c.length - 1);
        System.out.println(al);
    }

    static void set(char[] str, ArrayList<String> al, int n) {

        if (n < 0) {
            return;
        }

        String s = "";

        for (int i = n; i >= 0; i--) {
            char c = str[i];
            String temp = Character.toString(c);
            s = s.concat(temp);
            al.add(s);
        }

        set(str, al, n - 1);

    }
}
