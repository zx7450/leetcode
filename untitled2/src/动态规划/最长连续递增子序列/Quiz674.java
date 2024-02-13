package 动态规划.最长连续递增子序列;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/22 9:16
 */
public class Quiz674 {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        else if (n == 2)
            return nums[1] > nums[0] ? 2 : 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1])
                dp[i] = dp[i - 1] + 1;
            if (ans < dp[i])
                ans = dp[i];
        }
        return ans;
    }
}
