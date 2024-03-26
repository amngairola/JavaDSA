package Recursion.Basic;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

public class ParenthesisCheck {
    public static void main(String[] args) {
        String s = "()";
        if (check(s, 0, s.length() - 1))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    static boolean check(String str, int s, int e) {
        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }

        return check(str, s + 1, e - 1);

    }

}
