package 动态规划.不同路径;

/**
 * @author zx
 * @date 2021/11/11 9:36
 */
public class Quiz62 {
//    public int uniquePaths(int m, int n) {//从终点倒推回起点，每次只能向左或向上走
//        int[][] dp=new int[m][n];
//        for (int i = m-1; i >= 0; i--) {
//            for (int j = n-1; j >= 0; j--) {
//                if (j==n-1)
//                    dp[i][j]=1;
//                else if (i==m-1)
//                    dp[i][j]=1;
//                else
//                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
//            }
//        }
//        return dp[0][0];
//    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
