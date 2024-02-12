package 动态规划.买卖股票的最佳时机4;

public class Quiz188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        int[][] dp = new int[n][2 * k];
        for (int i = 0; i < 2 * k; i += 2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            for (int j = 1; j < 2 * k; j++) {
                dp[i][j] = j % 2 == 0 ? Math.max(dp[i - 1][j], dp[i - 1][j - 1] - prices[i])
                        : Math.max(dp[i - 1][j], dp[i - 1][j - 1] + prices[i]);
            }
        }
        return dp[n - 1][2 * k - 1];
    }
}
