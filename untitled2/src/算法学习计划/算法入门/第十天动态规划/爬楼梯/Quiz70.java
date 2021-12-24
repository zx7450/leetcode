package 算法学习计划.算法入门.第十天动态规划.爬楼梯;

/**
 * @author zx
 * @date 2021/12/24 9:32
 */
public class Quiz70 {
    public int climbStairs(int n) {
        if (n==1||n==2)
            return n;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < n + 1; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
