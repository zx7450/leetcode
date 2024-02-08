package 动态规划.背包问题.零一背包相关问题.目标和;

import java.util.Date;

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
        int n = nums.length;
        if (n == 1)
            return (nums[0] == target || nums[0] == -target) ? 1 : 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > sum)
            return 0;
        else if ((target + sum) % 2 != 0)
            return 0;
        int left = (target + sum) / 2;
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = left; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[left];
    }
}
