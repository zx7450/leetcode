package 算法学习计划.算法基础.第十三天动态规划.不同路径;

/**
 * @author zx
 * @date 2022/1/13 1:01
 */
public class Quiz62 {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];//表示从开始位置到对应位置的不同路径数目
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
