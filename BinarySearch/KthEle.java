import java.util.ArrayList;

public class KthEle {
    public static void main(String[] args) {

    }

    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m, int k) {
        // Write your coder here
        int ele = -1;
        int cnt = 0; // counter
        // apply the merge step:
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a.get(i) < b.get(j)) {
                if (cnt == k - 1)
                    ele = a.get(i);
                cnt++;
                i++;
            } else {
                if (cnt == k - 1)
                    ele = b.get(j);
                cnt++;
                j++;
            }
        }

        // copy the left-out elements:
        while (i < n) {
            if (cnt == k - 1)
                ele = a.get(i);
            cnt++;
            i++;
        }
        while (j < m) {
            if (cnt == k - 1)
                ele = b.get(j);
            cnt++;
            j++;
        }

        return ele;

    }
}
