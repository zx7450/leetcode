package 动态规划.最长回文子序列;

/**
 * @author zx
 * @date 2021/11/25 10:00
 */
public class Quiz516 {
    public int longestPalindromeSubseq(String s) {
        int slen=s.length();
        if (slen==1)
            return 1;
        else if (slen==2)
            if (s.charAt(0)==s.charAt(1))
                return 2;
            else
                return 1;
        int[][] dp=new int[slen][slen];//代表下表从i到j的范围中的最大回文子串长度
        int maxlen=0;
        for (int i = 0; i < slen; i++) {
            dp[i][i]=1;
        }
        for (int i = slen-1; i >= 0; i--) {
            for (int j = i+1; j < slen; j++) {
                if (s.charAt(i)==s.charAt(j))
                    dp[i][j]=dp[i+1][j-1]+2;
                else {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
                if (dp[i][j]>maxlen)
                    maxlen=dp[i][j];
            }
        }
        return maxlen;
    }
}
