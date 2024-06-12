package Recursion.Basic;

import java.util.ArrayList;

public class LeniarSearch {

    static void print(ArrayList<Integer> a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 5, 3, 5, 6, 7 };
        // System.out.println(find(arr, 5, 0));

        ArrayList<Integer> list = findIn(arr, 5, 0);
        print(list);
    }

    // static int find(int[] arr, int key, int s) {
    // if (s >= arr.length)

    // return -1;

    // if (arr[s] == key)
    // return s;
    // return find(arr, key, s + 1);
    // }

    // static ArrayList<Integer> al = new ArrayList<Integer>();

    // static void findAll(int[] arr, int key, int s) {
    // if (s >= arr.length) {
    // print(al);
    // return;
    // }

    // if (arr[s] == key)
    // al.add(s);

    // findAll(arr, key, s + 1);
    // }

    // returning a list without passing it in the parameters of the function call
    static ArrayList<Integer> findIn(int[] arr, int key, int s) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (s == arr.length) {
            return list;
        }

        if (arr[s] == key)
            list.add(s);

        ArrayList<Integer> ans = findIn(arr, key, s + 1);

        list.addAll(ans);
        return list;
    }

}
