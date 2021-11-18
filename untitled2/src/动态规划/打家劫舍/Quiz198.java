package 动态规划.打家劫舍;

public class Quiz198 {
    public int rob(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        int[] dp=new int[numlen];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < numlen; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[numlen-1];
    }
}
