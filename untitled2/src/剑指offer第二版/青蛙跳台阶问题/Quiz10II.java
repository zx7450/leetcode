package 剑指offer第二版.青蛙跳台阶问题;

/**
 * @author zx
 * @date 2021/12/24 16:06
 */
public class Quiz10II {
    public int numWays(int n) {
        if (n==1||n==2)
            return n;
        else if (n==0)
            return 1;
        final int MOD=1000000007;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < n + 1; i++) {
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
        }
        return dp[n];
    }
}
