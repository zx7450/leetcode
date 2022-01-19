package 算法学习计划.算法基础.第十八天动态规划.零钱兑换;

import java.util.Arrays;

/**
 * @author zx
 * @date 2022/1/19 17:25
 */
public class Quiz322 {
    public int coinChange(int[] coins, int amount) {
        if (amount==0)
            return 0;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i]<=j)
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
