package Recursion.Basic;

import java.util.ArrayList;

public class PP {
    public static void main(String[] args) {
        print("geeks");
    }

    static void print(String s) {
        char[] c = s.toCharArray();
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                check(c, al, i, j);
            }
        }

    }

    static void check(char[] c, ArrayList<String> al, int s, int e) {
        if (e - s == 0) {
            al.add(arr[e]);
        }
        while (s < e) {
            if (c[s] == c[e]) {

            }
            s++;
            e--;
        }
    }

}
