package 贪心算法.分发饼干;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/03 10:21
 */
public class Quiz455 {
    public int findContentChildren(int[] g, int[] s) {
        int gl = g.length, sl = s.length;
        if (sl == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gflag = 0, sflag = 0, ans = 0;
        while (gflag < gl && sflag < sl) {
            if (g[gflag] <= s[sflag]) {
                ans++;
                gflag++;
            }
            sflag++;
        }
        return ans;
    }
}
