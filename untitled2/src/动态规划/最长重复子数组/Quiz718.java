package 动态规划.最长重复子数组;

/**
 * @author zx
 * @date 2021/11/22 9:32
 */
public class Quiz718 {
    public int findLength(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[][] dp = new int[l1][l2];
        int ans = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j])
                    if (i > 0 && j > 0)
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    else
                        dp[i][j] = 1;
                if (dp[i][j] > ans)
                    ans = dp[i][j];
            }
        }
        return ans;
    }
}
