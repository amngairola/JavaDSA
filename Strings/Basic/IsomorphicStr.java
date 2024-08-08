package Strings.Basic;

import java.util.HashMap;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStr {
    public static void main(String[] args) {

    }

    static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> st = new HashMap<>(); // map for s
        HashMap<Character, Character> ts = new HashMap<>(); // map for t

        for (int i = 0; i < s.length(); i++) { // length are same
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if ((st.containsKey(ch1) && st.get(ch1) != ch2) ||
                    (ts.containsKey(ch2) && ts.get(ch2) != ch1)) {
                return false;
                /*
                 * public V get(Object key)
                 * Returns the value to which the specified key is mapped, or null if this map
                 * contains no mapping for the key.
                 */
            }

            st.put(ch1, ch2);
            ts.put(ch2, ch1);
        }
        return true;
    }

}
