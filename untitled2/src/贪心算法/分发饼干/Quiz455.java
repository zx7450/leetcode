package 贪心算法.分发饼干;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/03 10:21
 */
public class Quiz455 {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length==0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int num=0;
        int childrenSum=g.length;
        int cookiesSum=s.length;
        for (int i = 0,j=0; i < childrenSum&&j<cookiesSum; i++,j++) {
            while (j<cookiesSum&&s[j]<g[i])//找到第一个可以满足当前最小需求孩子的大小的饼干
                j++;
            if (j<cookiesSum)//j小于饼干总量，说明有饼干可分配
                num++;
        }
        return num;
    }
}
