package 动态规划.最长公共子序列;

/**
 * @author zx
 * @date 2021/11/23 9:49
 */
public class Quiz1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1len=text1.length();
        int t2len=text2.length();
        int[][] dp=new int[t1len+1][t2len+1];
        for (int i = 1; i <= t1len; i++) {
            char c1=text1.charAt(i-1);
            for (int j = 1; j <= t2len; j++) {
                char c2=text2.charAt(j-1);
                if (c1==c2)
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[t1len][t2len];
    }
}
