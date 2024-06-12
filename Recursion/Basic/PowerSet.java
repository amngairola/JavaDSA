package Recursion.Basic;

//https://www.geeksforgeeks.org/powet-set-lexicographic-order/

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet {
//    public static void main(String[] args) {

//    public static void main(String[] args) {
//        print("geeks");
//    }

//    static void print(String s) {
//        ArrayList<String> al = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                String str = s.substring(i, j);
//                if (isPallindrome(str, 0, str.length() - 1)) {
//                    al.add(str);
//                }
//            }
//        }

//        for (String palindrome : al) {
//            System.out.print(palindrome + " ");
//        }
//
//    }
//
//    static boolean isPallindrome(String str, int s, int e) {
//
//        if (e - s == 0) {
//            return true;
//
//        }
//        if (s > e) {
//            return true;
//        }
//
//        if (str.charAt(s) != str.charAt(e)) {
//            return false;
//        }
//
//        return isPallindrome(str, s + 1, e - 1);
//    }
}