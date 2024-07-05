package Recursion.medium;

/* LINK - https://leetcode.com/problems/count-good-numbers/description/
 */

public class GoodNo {
    public static void main(String[] args) {

        countGoodNumbers(2582);
    }

    public static int countGoodNumbers(long n) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        return check(arr, n, 0, 0, 0);
    }

    static int check(int[] arr ,long n, int i, int c , int j){
    
        if(i>=n){
             return c;
        }

        if(i)


         
    }

}
