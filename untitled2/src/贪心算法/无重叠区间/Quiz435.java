package 贪心算法.无重叠区间;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/08 9:05
 */
public class Quiz435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        if (n<2)
            return 0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int preend=intervals[0][1];
        int count=1;//记录非重叠子区间数目
        for (int i = 1; i < n; i++) {
            if (intervals[i][0]>=preend) {
                preend=intervals[i][1];
                count++;
            }
        }
        return n-count;//子区间总数减去非重叠子区间数目即为需要删除的区间数
    }
}
