package Arrays.Medium;

import java.util.HashMap;

public class MisingNum {
    public static void main(String[] args) {

    }

    int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count occurrences of each number
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        int[] ans = new int[2];
        for (int i = 1; i <= n; i++) {
            if (mp.containsKey(i)) {
                if (mp.get(i) == 2) {
                    ans[0] = i;
                }

            } else {
                ans[1] = i;
            }
        }

        return ans;
    }
}
