package Numbers;
//NumberOccuresNtime.java

public class NumberOccuresNtime {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 4, 5, 6, 5, 5, 4, 6, 6, 4 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;

            for (int num : arr) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= mask;
            }
        }

        return result;
    }
}
