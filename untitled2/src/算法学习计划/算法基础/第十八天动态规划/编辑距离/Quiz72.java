package 算法学习计划.算法基础.第十八天动态规划.编辑距离;

/**
 * @author zx
 * @date 2022/1/19 17:11
 */
public class Quiz72 {
    public int minDistance(String word1, String word2) {
        int w1len=word1.length();
        int w2len=word2.length();
        int[][] dp=new int[w1len+1][w2len+1];
        for (int i = 0; i <= w1len; i++) {
            dp[i][0]=i;
        }
        for (int j = 0; j <= w2len; j++) {
            dp[0][j]=j;
        }
        for (int i = 1; i <= w1len; i++) {
            char c1=word1.charAt(i-1);
            for (int j = 1; j <= w2len; j++) {
                char c2=word2.charAt(j-1);
                if (c2==c1)
                    dp[i][j]=dp[i-1][j-1];
                else //以下分别代表对word1进行增加（对word1增加等价于对word2删除）、删除、修改
                    dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
            }
        }
        return dp[w1len][w2len];
    }
}
