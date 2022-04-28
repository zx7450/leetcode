package 程序员面试金典.硬币;

/**
 * @author zx
 * @date 2022/4/23 10:33
 */
public class Quiz08_11 {
    public int waysToChange(int n) {
        if (n<5)
            return n==0?0:1;
        else if (n<10)
            return 2;
        long[] dp=new long[n+1];
        dp[0]=1;
        for (int i = 1; i < 5; i++) {
            dp[i]=1;
        }
        for (int i = 5; i <= n; i++) {
            dp[i]=dp[i-1];
            if (i>=5)
                dp[i]+=dp[i-5];
            if (i>=10)
                dp[i]+=dp[i-10];
            if (i>=25)
                dp[i]+=dp[i-25];
        }
        return (int)dp[n]%1000000007;
    }
}
