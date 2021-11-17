package 动态规划.背包问题.完全背包相关问题.零钱兑换;

public class Quiz322 {
    public int coinChange(int[] coins, int amount) {
        if (amount==0)
            return 0;
        int[] dp=new int[amount+1];
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            dp[i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j-coins[i]]!=Integer.MAX_VALUE)
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
