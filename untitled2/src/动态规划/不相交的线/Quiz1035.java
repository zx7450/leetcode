package 动态规划.不相交的线;

/**
 * @author zx
 * @date 2021/11/23 9:58
 */
public class Quiz1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1len=nums1.length;
        int n2len=nums2.length;
        int[][] dp=new int[n1len+1][n2len+1];
        for (int i = 1; i <= n1len; i++) {
            int n1=nums1[i-1];
            for (int j = 1; j <= n2len; j++) {
                int n2=nums2[j-1];
                if (n1==n2)
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n1len][n2len];
    }
}
