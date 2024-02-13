package 动态规划.最长公共子序列;

/**
 * @author zx
 * @date 2021/11/23 9:49
 */
public class Quiz1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1len = text1.length();
        int t2len = text2.length();
        int[][] dp = new int[t1len][t2len];
        for (int i = 0; i < t1len; i++) {
            for (int j = 0; j < t2len; j++) {
                if (text1.charAt(i) == text2.charAt(j))
                    if (i > 0 && j > 0)
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    else
                        dp[i][j] = 1;
                else if (i > 0 && j > 0)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                else {
                    if (i > 0)
                        dp[i][j] = dp[i - 1][j];
                    else if (j > 0)
                        dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[t1len - 1][t2len - 1];
    }
}
