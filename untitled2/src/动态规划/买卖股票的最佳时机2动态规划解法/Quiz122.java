package 动态规划.买卖股票的最佳时机2动态规划解法;

public class Quiz122 {
    public int maxProfit(int[] prices) {
        int prilen=prices.length;
        if (prilen==1)
            return 0;
        int[][] dp=new int[prilen][2];//后一个下标为0代表未持股票，为1代表持有股票
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < prilen; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);//第i天未持有股票的最大利润为第i-1天持有股票并在第i天卖出和第i-1天未持有股票之间的最大值
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);//第i天持有股票的最大利润为第i-1天持有股票和第i-1天未持有股票并在第i天买入之间的最大值
        }
        return dp[prilen-1][0];//最后一天一定不能持有股票（即便有也要卖出）
    }
}
