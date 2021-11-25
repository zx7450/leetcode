package 动态规划.编辑距离;

/**
 * @author zx
 * @date 2021/11/25 9:20
 */
public class Quiz72 {
    public int minDistance(String word1, String word2) {
        int w1len=word1.length();
        int w2len=word2.length();
        if (w1len==0)
            return w2len;
        else if (w2len==0)
            return w1len;
        int[][] dp=new int[w1len+1][w2len+1];
        for (int i = 1; i <= w1len; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i <= w2len; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <= w1len; i++) {
            for (int j = 1; j <= w2len; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;//分别代表增加（对word2进行删除等价于对word1进行增加）、删除、更改一个字符
                }
            }
        }
        return dp[w1len][w2len];
    }
}
