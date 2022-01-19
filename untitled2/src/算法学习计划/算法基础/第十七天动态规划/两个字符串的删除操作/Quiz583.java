package 算法学习计划.算法基础.第十七天动态规划.两个字符串的删除操作;

/**
 * @author zx
 * @date 2022/1/19 16:47
 */
public class Quiz583 {
//    public int minDistance(String word1, String word2) {//最长公共子序列法：若要删除次数最少，则删除后的字符必然为两个字符串的最长公共子序列
//        int w1len=word1.length();
//        int w2len=word2.length();
//        int[][] dp=new int[w1len+1][w2len+1];
//        for (int i = 1; i < w1len + 1; i++) {
//            char c1=word1.charAt(i-1);
//            for (int j = 1; j < w2len+1; j++) {
//                char c2=word2.charAt(j-1);
//                if (c1==c2)
//                    dp[i][j]=dp[i-1][j-1]+1;
//                else
//                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
//            }
//        }
//        return w1len+w2len-2*dp[w1len][w2len];
//    }
    public int minDistance(String word1, String word2) {//统计删除次数法
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
                if (c1==c2)
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+1;
            }
        }
        return dp[w1len][w2len];
    }
}
