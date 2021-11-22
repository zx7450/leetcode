package 动态规划.最佳买卖股票时机含冷冻期;

/**
 * @author zx
 * @date 2021/11/20 上午8:58
 */
public class Quiz309 {
    public int maxProfit(int[] prices) {
        int prilen = prices.length;
        if (prilen == 0 || prilen == 1)
            return 0;
        int[][] dp = new int[prilen][2];
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
        dp[1][1] = Math.max(dp[0][1], -prices[1]);
        for (int i = 2; i < prilen; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }
        return dp[prilen - 1][0];
    }
}
