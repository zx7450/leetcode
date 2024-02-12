package 动态规划.买卖股票的最佳时机含冷冻期;

/**
 * @author zx
 * @date 2024/2/12 17:55
 */
public class Quiz309 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        int[][] dp = new int[n][2];
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = i < 2 ? Math.max(dp[i - 1][1], -prices[i]) : Math.max(Math.max(dp[i - 1][1], -prices[i]), dp[i - 2][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
