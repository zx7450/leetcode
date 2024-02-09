package 动态规划.一和零;

/**
 * @author zx
 * @date 2024/2/9 11:39
 */
public class Quiz474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zero = 0, one = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0')
                    zero++;
                else
                    one++;
            }
            if (zero > m || one > n)
                continue;
            for (int i = m; i >= zero; i--)
                for (int j = n; j >= one; j--)
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
        }
        return dp[m][n];
    }
}
