package 算法学习计划.算法入门.第十天动态规划.打家劫舍;

/**
 * @author zx
 * @date 2021/12/24 9:38
 */
public class Quiz198 {
    public int rob(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        else if (numlen==2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        int[] dp=new int[numlen];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < numlen; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[numlen-1];
    }
}
