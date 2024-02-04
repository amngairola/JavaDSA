package BasicRecursion;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        reverse(arr, 0, arr.length - 1);
        for (int index = 0; index < arr.length; index++) {

            System.out.println(arr[index]);
        }
    }

    static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            swap(arr, start, end);
            // reverse(arr, start++, end--); *In Java, the ++ and -- operators are postfix
            // operators, which means they first use the current value of the variable and
            // then increment or decrement it. I

            reverse(arr, start + 1, end - 1);
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}