package 动态规划.零钱兑换;

/**
 * @author zx
 * @date 2024/2/10 15:25
 */
public class Quiz322 {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (coins.length == 1)
            return amount % coins[0] == 0 ? amount / coins[0] : -1;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{2, 5, 10, 1};
        System.out.println(coinChange(coins, 27));
    }
}
