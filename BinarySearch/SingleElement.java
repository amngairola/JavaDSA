package BinarySearch;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElement {
    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] arr) {
        int s = 0, e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            // Ensure 'mid' is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is broken
            if (arr[mid] == arr[mid + 1]) {
                s = mid + 2; // Move start to the next pair
            } else {
                e = mid; // Move end to mid
            }
        }

        return arr[s];
    }
}
