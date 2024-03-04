package 贪心算法.合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author zx
 * @date 2021/11/08 10:36
 */
public class Quiz56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1)
            return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] > end) {
                ans.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            } else
                end = Math.max(intervals[i][1], end);
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}
