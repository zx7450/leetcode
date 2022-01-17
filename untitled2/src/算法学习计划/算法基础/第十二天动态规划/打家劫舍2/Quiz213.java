package 算法学习计划.算法基础.第十二天动态规划.打家劫舍2;

/**
 * @author zx
 * @date 2022/1/13 0:11
 */
public class Quiz213 {
    public int rob(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        else if (numlen==2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        int rob1=maxvalue(nums,0,numlen-2);
        int rob2=maxvalue(nums,1,numlen-1);
        return rob1>rob2?rob1:rob2;
    }

    public int maxvalue(int[] nums,int start,int end) {
        if (start==end)
            return nums[start];
        int[] dp=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for (int i = start+2; i < end + 1; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
