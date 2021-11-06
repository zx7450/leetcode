package 贪心算法.用最少数量的箭引爆气球;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zx
 * @date 2021/11/06 15:59
 */
public class Quiz452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length==1)
            return 1;
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int xend=points[0][1];
        int arrowcount=1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0]>xend) {//气球起始位置在当前一箭能射爆的最多气球的范围之外,需要再射一箭
                xend = points[i][1];
                arrowcount++;
            } else {
                if (points[i][1] < xend)
                    xend = points[i][1];
            }
        }
        return arrowcount;
    }
}
