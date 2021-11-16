package 动态规划.背包问题.零一背包相关问题.目标和;

public class Quiz494 {
//    int res = 0;//回溯法
//
//    public int findTargetSumWays(int[] nums, int target) {
//        backtracing(nums,target,0);
//        return res;
//    }
//
//    public void backtracing(int[] nums, int target, int startpos) {
//        if (startpos == nums.length) {
//            int sum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                sum += nums[i];
//            }
//            if (sum == target)
//                res++;
//            return;
//        }
//        backtracing(nums, target, startpos+1);
//        nums[startpos]=-nums[startpos];
//        backtracing(nums, target, startpos+1);
//    }
    public int findTargetSumWays(int[] nums, int target) {//dp
        int sum=0;
        for (int i:nums)
            sum+=i;
        if ((target+sum)%2!=0)
            return 0;
        if (Math.abs(target)>sum)
            return 0;
        int size=(sum+target)/2;
        if (size<0)
            size=-size;
        int[] dp=new int[size+1];
        dp[0]=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j=size;j>=nums[i];j--)
                dp[j]+=dp[j-nums[i]];
        }
        return dp[size];
    }
}
