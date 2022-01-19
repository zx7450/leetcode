package 算法学习计划.算法基础.第十七天动态规划.最长公共子序列;

/**
 * @author zx
 * @date 2022/1/19 16:24
 */
public class Quiz1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1len=text1.length();
        int t2len=text2.length();
        int[][] dp=new int[t1len+1][t2len+1];
        for (int i = 1; i < t1len + 1; i++) {//此处i和后面j表示意义为长度，而非下标
            char c1=text1.charAt(i-1);
            for (int j = 1; j < t2len+1; j++) {
                char c2=text2.charAt(j-1);
                if (c1==c2)
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[t1len][t2len];
    }
}
