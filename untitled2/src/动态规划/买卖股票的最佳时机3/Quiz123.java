package 动态规划.买卖股票的最佳时机3;

public class Quiz123 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        int[][] dp = new int[n][4];
        dp[0][0] = -prices[0];
        dp[0][2] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] - prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] + prices[i]);
        }
        return dp[n - 1][3];
    }
}
