package 动态规划.两个字符串的删除操作;

/**
 * @author zx
 * @date 2021/11/24 10:24
 */
public class Quiz583 {
//    public int minDistance(String word1, String word2) {//删除次数法
//        int w1len=word1.length();
//        int w2len=word2.length();
//        int[][] dp=new int[w1len+1][w2len+1];//其中dp[i][j]表示使word1[0:i]和word2[0:j]相同的最小删除操作次数
//        for (int i = 1; i < w1len + 1; i++) {
//            dp[i][0]=i;
//        }
//        for (int i = 1; i < w2len + 1; i++) {
//            dp[0][i]=i;
//        }
//        for (int i = 1; i < w1len + 1; i++) {
//            for (int j = 1; j < w2len+1; j++) {
//                if (word1.charAt(i-1)==word2.charAt(j-1))
//                    dp[i][j]=dp[i-1][j-1];
//                else
//                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+1;
//            }
//        }
//        return dp[w1len][w2len];
//    }
    public int minDistance(String word1, String word2) {//最长公共子序列法（若要删除次数最小，则剩下的必然为word1和word2的最长公共子序列）
        int w1len=word1.length();
        int w2len=word2.length();
        int[][] dp=new int[w1len+1][w2len+1];//表示最长公共子序列长度
        for (int i = 1; i < w1len + 1; i++) {
            for (int j = 1; j < w2len+1; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return w1len+w2len-2*dp[w1len][w2len];
    }
}
