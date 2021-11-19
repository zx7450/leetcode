package 动态规划.买卖股票的最佳时机4;

public class Quiz188 {
    public int maxProfit(int k, int[] prices) {
        int prilen=prices.length;
        if (prilen==0||prilen==1)
            return 0;
        int[][] dp=new int[prilen][2*k+1];
        for (int i = 1; i <= 2*k; i=i+2) {
            dp[0][i]=-prices[0];
        }
        for (int i = 1; i < prilen; i++) {
            for (int j = 1; j < 2*k+1; j++) {
                if (j%2==0)//j为偶数表示已卖出
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]+prices[i]);
                else//j为奇数表示买入
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]-prices[i]);
            }
        }
        return dp[prilen-1][2*k];
    }
}
