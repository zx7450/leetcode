package 贪心算法.用最少数量的箭引爆气球;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zx
 * @date 2021/11/06 15:59
 */
public class Quiz452 {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 1)
            return 1;
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int right = points[0][1];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (points[i][0] > right) {
                right = points[i][1];
                ans++;
            }
            else
                right = Math.min(points[i][1], right);
        }
        return ans;
    }
}
