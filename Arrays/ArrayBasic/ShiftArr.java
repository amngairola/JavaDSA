public class ShiftArr {

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println("");
        rotate(arr, 3);
        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k % n == 0) // If array is empty or rotation is multiple of array length, no need to rotate
            return;

        k = k % n; // Adjust k to be less than array length

        int[] temp = new int[k];
        // Copy the last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift elements to the right by k positions
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Copy the temp array back to nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

    }
}