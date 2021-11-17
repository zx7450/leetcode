package 动态规划.背包问题.完全背包相关问题.完全平方数;

public class Quiz279 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            dp[i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                    dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
