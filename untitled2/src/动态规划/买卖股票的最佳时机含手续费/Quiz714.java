package 动态规划.买卖股票的最佳时机含手续费;

/**
 * @author zx
 * @date 2021/11/20 9:24
 */
public class Quiz714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return Math.max(prices[1] - prices[0] - 2 * fee, 0);
        int[][] dp = new int[n][2];
        dp[0][1] = -prices[0] - fee;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i] - fee);
        }
        return dp[n - 1][0];
    }
}
