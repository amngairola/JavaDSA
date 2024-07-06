package Hashing.Basic;

import java.util.HashMap;

public class CharHashing {
    public static void main(String[] args) {
        String s = "abcararg";
        charFrequency(s);
        chArr(s);
    }

    static void charFrequency(String s) {
        HashMap<Character, Integer> chMap = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (chMap.containsKey(c)) {
                chMap.put(c, chMap.get(c) + 1);
                // we are adding +1 in the previous value if present in the hashmap
            } else {
                chMap.put(c, 1);
            }
        }

        // Print the character frequencies

        // for (Map.Entry<Character, Integer> e : chMap.entrySet()) {
        // System.out.println(e.getKey() + " " + e.getValue());
        // }

        System.out.println(chMap);
    }

    // using arrays

    static void chArr(String s) {
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            hash[currentChar - 'a']++;
            // hash[s.charAt(i) - 'a']++ increments the count at the computed index in the
            // hash array.
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + hash[i]);
            }
        }

    }
}
