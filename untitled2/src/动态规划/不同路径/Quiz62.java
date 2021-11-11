package 动态规划.不同路径;

/**
 * @author zx
 * @date 2021/11/11 9:36
 */
public class Quiz62 {
    public int uniquePaths(int m, int n) {//从终点倒推回起点，每次只能向左或向上走
        int[][] dp=new int[m][n];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (j==n-1)
                    dp[i][j]=1;
                else if (i==m-1)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}
