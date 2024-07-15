package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlap {
    public int[][] merge(int[][] arr) {
        int n = arr.length;

        // Sort intervals based on their start times
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the current interval does not overlap with the last merged interval
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                // Merge the current interval with the last merged interval
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }

        // Convert List<List<Integer>> to int[][]
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] mergedIntervals = solution.merge(intervals);

        // Print merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    /// ------------- 2nd type
    public List<Interval> merge(List<Interval> intervals) {
        // Edge case: If the list is empty or has only one interval
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort intervals based on their start times
        Collections.sort(intervals, Comparator.comparingInt(interval -> interval.start));

        // List to store the merged intervals
        List<Interval> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            Interval lastMerged = mergedIntervals.get(mergedIntervals.size() - 1);

            if (current.start <= lastMerged.end) {
                // Merge overlapping intervals
                lastMerged.end = Math.max(lastMerged.end, current.end);
            } else {
                // Add non-overlapping interval to the result
                mergedIntervals.add(current);
            }
        }

        return mergedIntervals;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }

}
