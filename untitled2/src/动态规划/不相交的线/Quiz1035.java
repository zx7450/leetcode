package 动态规划.不相交的线;

/**
 * @author zx
 * @date 2021/11/23 9:58
 */
public class Quiz1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[][] dp = new int[l1][l2];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j])
                    dp[i][j] = (i == 0 || j == 0) ? 1 : dp[i - 1][j - 1] + 1;
                else {
                    if (i > 0 && j > 0)
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    else if (i > 0)
                        dp[i][j] = dp[i - 1][j];
                    else if (j > 0)
                        dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[l1 - 1][l2 - 1];
    }
}
