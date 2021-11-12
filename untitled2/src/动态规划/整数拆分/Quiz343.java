package 动态规划.整数拆分;

/**
 * @author zx
 * @date 2021/11/12 9:18
 */
public class Quiz343 {
    public int integerBreak(int n) {
        if (n==2)
            return 1;
        int[] dp=new int[n+1];
        dp[2]=1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i-1; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
