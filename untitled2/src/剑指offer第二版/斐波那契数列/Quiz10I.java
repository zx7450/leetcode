package 剑指offer第二版.斐波那契数列;

/**
 * @author zx
 * @date 2021/12/24 16:00
 */
public class Quiz10I {
    public int fib(int n) {
        final int MOD = 1000000007;
        if (n==0||n==1)
            return n;
        int[] dp=new int[n+1];
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=(dp[i-2]+dp[i-1])%MOD;
        }
        return dp[n];
    }
}
