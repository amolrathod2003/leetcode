// Last updated: 4/1/2026, 10:43:58 PM
import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int cnt = 1;
        int lastEnd = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= lastEnd) {
                cnt++;
                lastEnd = intervals[i][1];
            }
        }
        return n - cnt;
    }
}
