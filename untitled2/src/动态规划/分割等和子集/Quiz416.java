package 动态规划.分割等和子集;

public class Quiz416 {
    public boolean canPartition(int[] nums) {
        int numsize=nums.length;
        if (numsize<2)
            return false;
        int allsum=0;
        for (int i = 0; i < numsize; i++) {
            allsum+=nums[i];
        }
        if (allsum%2==1)
            return false;
        int sum=allsum/2;
        int[] dp=new int[sum+1];
        for (int i = 0; i < numsize; i++) {
            for (int j=sum;j>=nums[i];j--)
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
        }
        return dp[sum]==sum;
    }
}
