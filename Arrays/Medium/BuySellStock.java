package Arrays.Medium;

import java.util.List;

//https://www.interviewbit.com/problems/best-time-to-buy-and-sell-stocks-i/
public class BuySellStock {
    public static void main(String[] args) {

    }

    public int maxProfit(final List<Integer> A) {
        if (A == null || A.size() == 0)
            return 0;
        int p = 0;
        int low = A.get(0);

        for (int i = 0; i < A.size(); i++) {
            int c = A.get(i) - low;
            p = Math.max(p, c);
            low = Math.min(low, A.get(i));
        }

        return p;
    }
}
