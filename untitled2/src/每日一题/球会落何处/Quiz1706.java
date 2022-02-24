package 每日一题.球会落何处;

import java.util.Arrays;

/**
 * @author zx
 * @date 2022/2/24 9:15
 */
public class Quiz1706 {
    public int[] findBall(int[][] grid) {
        int rowlen= grid.length,collen=grid[0].length;
        if (rowlen==1&&collen==1&&grid[0][0]==-1)
            return new int[]{-1};
        int ans[]=new int[collen];
        Arrays.fill(ans,-1);
        for (int i = 0; i < collen; i++) {
            int pos=i;
            for (int j = 0; j < rowlen; j++) {
                int movepos=grid[j][pos];
                pos+=movepos;
                if (pos<0||pos==collen||grid[j][pos]!=movepos) {
                    pos=-1;
                    break;
                }
            }
            if (pos>=0) {
                ans[i] = pos;
            }
        }
        return ans;
    }
}
