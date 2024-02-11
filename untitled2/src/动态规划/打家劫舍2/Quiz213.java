package 动态规划.打家劫舍2;

public class Quiz213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        else if (n == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(dp(nums, 0, n - 2), dp(nums, 1, n - 1));
    }

    public int dp(int[] nums, int beg, int end) {
        int[] dp = new int[end + 1];
        dp[beg] = nums[beg];
        dp[beg + 1] = Math.max(nums[beg], nums[beg + 1]);
        for (int i = beg + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}
