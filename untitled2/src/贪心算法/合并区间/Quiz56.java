package 贪心算法.合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2021/11/08 10:36
 */
public class Quiz56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]>end) {
                res.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            } else {
                end=Math.max(intervals[i][1],end);
            }
        }
        res.add(new  int[]{start,end});
        return res.toArray(new int[res.size()][]);
    }
}
