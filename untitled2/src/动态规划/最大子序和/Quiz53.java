package 动态规划.最大子序和;

/**
 * @author zx
 * @date 2021/11/23 10:02
 */
public class Quiz53 {
    public int maxSubArray(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        int[] dp=new int[numlen];
        dp[0]=nums[0];
        int res=dp[0];
        for (int i = 1; i < numlen; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if (dp[i]>res)
                res=dp[i];
        }
        return res;
    }
}
