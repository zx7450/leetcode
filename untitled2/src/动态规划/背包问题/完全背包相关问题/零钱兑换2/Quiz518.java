package 动态规划.背包问题.完全背包相关问题.零钱兑换2;

public class Quiz518 {
    public int change(int amount, int[] coins) {
        if (amount==0)
            return 1;
        int[] dp=new int[amount+1];
        dp[0]=1;
        for (int i = 0; i < coins.length; i++) {
            for (int j=coins[i];j<=amount;j++)
                dp[j]+=dp[j-coins[i]];
        }
        return dp[amount];
    }
}
