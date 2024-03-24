package Recursion.Basic;

public class PP {
    public static void main(String[] args) {
        print("geeks");
    }

    static void print(String s) {
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                check(c, i, j);
            }
        }

    }

    static void check(char[] c, int s, int e) {
        while (s < e) {
            if (c[s] == c[e]) {

            }
            s++;
            e--;
        }
    }

}
