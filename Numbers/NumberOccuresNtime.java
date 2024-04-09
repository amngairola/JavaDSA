package Numbers;
//NumberOccuresNtime.java

public class NumberOccuresNtime {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 4, 5, 6, 5, 5, 4, 6, 6, 4 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
        }
        return count % 3;
    }
}
