package Recursion.Basic;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class Steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        // int ans = count(num , 0);
        return count(num, 0);
    }

    static int count(int num, int i) {

        if (num % 2 != 0) {
            i += 1;
            num -= 1;

        }
        if (num == 0) {
            return i;
        }

        return count(num / 2, i + 1);

    }
}
