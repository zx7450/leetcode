package 动态规划.背包问题.零一背包相关问题.分割等和子集;

public class Quiz416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return false;
        else if (n == 2)
            return nums[0] == nums[1];
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0)
            return false;
        sum /= 2;
        int[] dp = new int[sum + 1];
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
            if (dp[sum] == sum)
                return true;
        }
        return false;
    }
}
