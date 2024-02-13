package 动态规划.最长递增子序列;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/22 9:06
 */
public class Quiz300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        else if (n == 2)
            return nums[1] > nums[0] ? 2 : 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if (dp[i] > ans)
                ans = dp[i];
        }
        return ans;
    }
}
