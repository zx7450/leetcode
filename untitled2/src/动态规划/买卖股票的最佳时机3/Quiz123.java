package 动态规划.买卖股票的最佳时机3;

public class Quiz123 {
    public int maxProfit(int[] prices) {
        int prilen=prices.length;
        if (prilen==1)
            return 0;
        int[][] dp=new int[prilen][5];//后一个下标，0代表未进行过任何买卖，1代表进行过第一次买入，2代表进行过第一次卖出...以此类推
        dp[0][1]=-prices[0];
        dp[0][3]=-prices[0];//第二次买入依赖于第一次卖出的状态，其实相当于第0天第一次买入了，第一次卖出了，然后在买入一次
        for (int i = 1; i < prilen; i++) {//dp[i-1][0]始终为0，无意义
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2]-prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
        }
        return dp[prilen-1][4];
    }
}
