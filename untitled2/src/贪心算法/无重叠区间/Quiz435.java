package 贪心算法.无重叠区间;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/08 9:05
 */
public class Quiz435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n < 2)
            return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int right = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (right > intervals[i][0]) {
                ans++;
                right = Math.min(right, intervals[i][1]);
            } else
                right = intervals[i][1];
        }
        return ans;
    }
}
