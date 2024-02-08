package 动态规划.背包问题.零一背包相关问题.最后一块石头的重量2;

public class Quiz1049 {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        if (n == 1)
            return stones[0];
        else if (n == 2)
            return Math.abs(stones[0] - stones[1]);
        int allweight = 0;
        for (int stone : stones) {
            allweight += stone;
        }
        int halfWeight = allweight / 2;
        int[] dp = new int[halfWeight + 1];
        for (int i = 0; i < n; i++) {
            for (int j = halfWeight; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return Math.abs(allweight - 2 * dp[halfWeight]);
    }
}
