package Recursion.Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet {
    public static void main(String[] args) {
        String str = "cab";
        powerSet(str);
    }

    static void powerSet(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        ArrayList<String> al = new ArrayList<>();
        set(c, al, c.length);
    }

    static void set(char[] str, ArrayList<String> al, int n) {

    }
}
