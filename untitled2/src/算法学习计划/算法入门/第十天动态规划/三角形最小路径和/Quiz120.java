package 算法学习计划.算法入门.第十天动态规划.三角形最小路径和;

import java.util.List;

/**
 * @author zx
 * @date 2021/12/24 9:49
 */
public class Quiz120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int trianglelen=triangle.size();
        if (trianglelen==1)
            return triangle.get(0).get(0);
        int[][] dp=new int[trianglelen][trianglelen];
        dp[0][0]=triangle.get(0).get(0);
        for (int i = 1; i < trianglelen; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0)
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                else if (j==i)
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                else {
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < trianglelen; i++) {
            if (dp[trianglelen-1][i]<ans)
                ans=dp[trianglelen-1][i];
        }
        return ans;
    }
}
