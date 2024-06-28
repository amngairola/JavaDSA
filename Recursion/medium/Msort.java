package Recursion.medium;

public class Msort {
    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1, 3 };
        ms(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static void ms(int[] arr, int s, int e) {
        if (s >= e)
            return;

        int mid = (s + e) / 2;

        ms(arr, s, mid);
        ms(arr, mid + 1, e);

        m(arr, s, mid, e);
    }

    static void m(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s + 1]; // Temporary array to hold merged elements
        int left = s; // Starting index of the left subarray
        int right = mid + 1; // Starting index of the right subarray
        int k = 0; // Index for the temp array

        // Merge the two subarrays into temp
        while (left <= mid && right <= e) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        // Copy remaining elements from the left subarray, if any
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements from the right subarray, if any
        while (right <= e) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy merged elements back into the original array
        for (int i = 0; i < temp.length; i++) {
            arr[s + i] = temp[i];

            /*
             * Why arr[s + i]?
             * Positioning: The variable s represents the starting index of the subarray
             * being merged.
             * i is an index within the temp array, which starts from 0.
             * By using arr[s + i], we ensure that the elements in temp are copied back to
             * the correct positions in the original array arr, starting from index s.
             */
        }
    }

}
