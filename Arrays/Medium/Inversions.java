package Arrays.Medium;

//https://takeuforward.org/data-structure/count-inversions-in-an-array/
public class Inversions {
    public static void main(String[] args) {

    }

    static long inversionCount(long arr[], int n) {
        return ms(arr, 0, n - 1);
    }

    static long ms(long[] arr, int s, int e) {
        long c = 0;
        if (s >= e)
            return c;

        int mid = (s + e) / 2;

        c += ms(arr, s, mid);
        c += ms(arr, mid + 1, e);

        c += m(arr, s, mid, e);

        return c;
    }

    static long m(long[] arr, int s, int m, int e) {
        long[] temp = new long[e - s + 1];
        int l = s;
        int r = m + 1;
        int k = 0;

        long c = 0;

        while (l <= m && r <= e) {
            if (arr[l] <= arr[r]) {
                temp[k] = arr[l];
                l++;
            } else {
                temp[k] = arr[r];
                c += (m - l + 1);
                r++;
            }

            k++;
        }

        while (l <= m) {
            temp[k] = arr[l];
            k++;
            l++;
        }
        while (r <= e) {
            temp[k] = arr[r];
            k++;
            r++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[s + i] = temp[i];
        }

        return c;
    }
}
