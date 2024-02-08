package 动态规划.不同的二叉搜索树;

/**
 * @author zx
 * @date 2021/11/12 9:33
 */
public class Quiz96 {
    public int numTrees(int n) {
        if (n < 3)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
