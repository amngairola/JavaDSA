package Recursion.Basic;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

public class ParenthesisCheck {
    public static void main(String[] args) {
        String s = "()";
        if (isValidExpression(s))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    static boolean isValidExpression(String exp) {
        return check(exp, 0, new Stack<>());
    }

    static boolean check(String str, int i, Stack<Character> stack) {

        if (i == str.length()) {
            return stack.isEmpty();
        }

        char c = str.charAt(i);

        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }

            char top = stack.pop();

            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return false;
            }
        }

        return check(str, i + 1, stack);

    }

}
