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
        /*
         * 
         * for i = 1
         * c = str.charAt(i) will be ')'
         * 
         */
        char c = str.charAt(i);

        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }

            char top = stack.pop(); /*
                                     * the value of top will be '(' because pop() removes and returns the top
                                     * element of the stack, which in this case is '('.
                                     * ->
                                     * now top == str.charat(top-1)
                                     * for '( ' ,')'
                                     * top = '(';
                                     * and c = ')'; *char at str.charAt(1) = ')'
                                     * 
                                     */
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                // in this we are checking the opening and closing bracket for the string if
                // they are diffrent return false
                return false;
            }

        }

        return check(str, i + 1, stack);

    }

}
