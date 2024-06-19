package Recursion.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SubSequence {
    public static void main(String[] args) {
        // subset("", "abc");
        subsetASCII("", "abc");
        // System.out.println(subsetList(" ", "abc"));

    }

    static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

    }

    static void subsetASCII(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsetASCII(p + ch, up.substring(1));
        subsetASCII(p + (ch + 0), up.substring(1));
        subsetASCII(p, up.substring(1));

    }

    static ArrayList<String> subsetList(String p, String up) {

        if (up.isEmpty()) {
            // here we just creating a new list whenever the string gets empty and returning
            // the list from whre it is called
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        char ch = up.charAt(0);
        // ---** In the above function call we have 2 recursive call one for add in the
        // string and other for just ignore the string **----

        ArrayList<String> first = subsetList(p + ch, up.substring(1));
        /// In these two function call we are geting the List containing the P String
        /// and we are combining it and returning it to thee previous function call
        ArrayList<String> second = subsetList(p, up.substring(1));

        // adding one list into another and passing it back to the previous function
        first.addAll(second);
        return first;

        /*
         * ANS -
         * abc
         * [abc, ab]
         * [abc, ab, ac, a]
         * [abc, ab, ac, a, bc, b, c, ]
         */
    }

    // using itrative method

}
