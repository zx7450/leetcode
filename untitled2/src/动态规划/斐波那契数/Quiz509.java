package 动态规划.斐波那契数;

/**
 * @author zx
 * @date 2021/11/10 10:28
 */
public class Quiz509 {
    public int fib(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        int[] dp=new int[n+1];
        dp[1]=1;
        for (int i = 2; i < n + 1; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
