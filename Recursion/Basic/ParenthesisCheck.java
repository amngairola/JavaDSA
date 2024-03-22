package Recursion.Basic;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
public class ParenthesisCheck {
    public static void main(String[] args) {
        char expr[] = "[(])".toCharArray();
        int n = expr.length;
        if (check(expr, n))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    static boolean check(char[] exp, int n) {

        return false;
    }

}
