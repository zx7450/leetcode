package 程序员面试金典.三步问题;

/**
 * @author zx
 * @date 2022/4/20 9:09
 */
public class Quiz08_01 {
    public int waysToStep(int n) {
        if (n<=2)
            return n;
        else if (n==3)
            return 4;
        long[] dp=new long[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for (int i = 4; i <= n; i++) {
            dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return (int)dp[n]%1000000007;
    }
}
