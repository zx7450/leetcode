package 贪心算法.买卖股票的最佳时机2;

/**
 * @author zx
 * @date 2021/11/04 10:23
 */
public class Quiz122 {
    //贪心法
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        if (n == 1)
//            return 0;
//        else if (n == 2)
//            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
//        int ans = 0;
//        for (int i = 1; i < n; i++) {
//            ans = Math.max(ans, ans + prices[i] - prices[i - 1]);
//        }
//        return ans;
//    }
    //dp法
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
