package Hashing.Basic;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 3, 4 };
        HashMapCreation(arr);

    }

    /* Function to create HashMap from array */
    static void HashMapCreation(int arr[]) {

        /* Creates an empty HashMap */
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            /* Get if the element is present */
            Integer n = hashmap.get(arr[i]);

            /* If this is first occurrence of element Insert the element */
            if (hashmap.get(arr[i]) == null) {
                hashmap.put(arr[i], 1);
            }

            /*
             * If element is already present in hash map Increment the count of element by 1
             */
            else {
                hashmap.put(arr[i], ++n);
            }
        }
        /* Display HashMap */
        System.out.println(hashmap);
    }

}
