package 动态规划.买卖股票的最佳时机;

public class Quiz121 {
//    public int maxProfit(int[] prices) {//一维dp
//        int n = prices.length;
//        if (n == 1)
//            return 0;
//        else if (n == 2)
//            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
//        int[] dp = new int[2];
//        dp[0] = 0;
//        dp[1] = -prices[0];
//        for (int i = 1; i < n; i++) {
//            dp[0] = Math.max(dp[0], dp[1] + prices[i]);
//            dp[1] = Math.max(dp[1], -prices[i]);
//        }
//        return dp[0];
//    }

//    public int maxProfit(int[] prices) {//二维dp
//        int prilen = prices.length;
//        if (prilen == 1)
//            return 0;
//        int[][] dp = new int[prilen][2];//第二位代表第i天持有/不持有股票的最大利润
//        dp[0][1] = -prices[0];//代表在第0天买入股票
//        for (int i = 1; i < prilen; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);//第i-1天卖出股票或不持有股票(可能在之前卖出)间的最大值
//            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);//挑便宜的那天买入
//        }
//        return dp[prilen - 1][0];//最后一天不应该持有股票，返回无股票的情况
//    }
        public int maxProfit ( int[] prices){//贪心，取左边最小右边最大
        int n = prices.length;
        if (n == 1)
            return 0;
        int low = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < low)
                low = prices[i];
            if (prices[i] - low > ans)
                ans = prices[i] - low;
        }
        return ans;
        }
    }
