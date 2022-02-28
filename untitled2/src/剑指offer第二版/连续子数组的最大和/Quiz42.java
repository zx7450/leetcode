package 剑指offer第二版.连续子数组的最大和;

/**
 * @author zx
 * @date 2022/2/28 8:55
 */
public class Quiz42 {
    public int maxSubArray(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        int[] dp=new int[numlen];
        int ans=nums[0];
        dp[0]=nums[0];
        for (int i = 1; i < numlen; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if (dp[i]>ans)
                ans=dp[i];
        }
        return ans;
    }
}
