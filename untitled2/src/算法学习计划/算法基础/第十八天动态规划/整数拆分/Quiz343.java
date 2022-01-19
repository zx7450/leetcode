package 算法学习计划.算法基础.第十八天动态规划.整数拆分;

/**
 * @author zx
 * @date 2022/1/19 18:17
 */
public class Quiz343 {
    public int integerBreak(int n) {
        if (n==2)
            return 1;
        int[] dp=new int[n+1];
        dp[2]=1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i-1; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
