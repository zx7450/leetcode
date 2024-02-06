package 动态规划.不同路径2;

/**
 * @author zx
 * @date 2021/11/11 10:01
 */
public class Quiz63 {
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m=obstacleGrid.length;
//        int n=obstacleGrid[0].length;
//        int[][] dp=new int[m][n];
//        for (int i = m-1; i >= 0; i--) {
//            for (int j = n-1; j >= 0; j--) {
//                if (obstacleGrid[i][j]==1)
//                    dp[i][j]=0;
//                else {
//                    if (j == n - 1) {
//                        if (i == m - 1)
//                            dp[i][j] = 1;
//                        else
//                            dp[i][j] = dp[i+1][j];
//                    } else if (i == m - 1) {
//                        dp[i][j]=dp[i][j+1];
//                    } else {
//                        dp[i][j]=dp[i+1][j]+dp[i][j+1];
//                    }
//                }
//            }
//        }
//        return dp[0][0];
//    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1)
                dp[i][0] = 0;
            else
                dp[i][0] = dp[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1)
                dp[0][i] = 0;
            else
                dp[0][i] = dp[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
