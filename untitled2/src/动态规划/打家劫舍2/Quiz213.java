package 动态规划.打家劫舍2;

public class Quiz213 {
    public int rob(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return nums[0];
        int res1=robdp(nums,0,numlen-2);//不考虑最后一个房子的情况
        int res2=robdp(nums,1,numlen-1);//不考虑第一个房子的情况
        return Math.max(res1,res2);
    }
    public int robdp(int[] nums,int beg,int end) {
        if (end==beg)
            return nums[beg];
        int[] dp=new int[nums.length];
        dp[beg]=nums[beg];
        dp[beg+1]=Math.max(nums[beg],nums[beg+1]);
        for (int i = beg+2; i <= end; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[end];
    }
}
