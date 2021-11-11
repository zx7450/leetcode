package 动态规划.使用最小花费爬楼梯;

/**
 * @author zx
 * @date 2021/11/11 9:14
 */
public class Quiz746 {
    public int minCostClimbingStairs(int[] cost) {
        int clen=cost.length;
        if (clen==2)
            return cost[0]<cost[1]?cost[0]:cost[1];
        int[] dp=new int[clen+1];
        for (int i = 2; i < clen + 1; i++) {
            dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[clen];
    }
}
