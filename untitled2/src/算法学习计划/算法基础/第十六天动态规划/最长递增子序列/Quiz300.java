package 算法学习计划.算法基础.第十六天动态规划.最长递增子序列;

import java.util.Arrays;

/**
 * @author zx
 * @date 2022/1/17 22:50
 */
public class Quiz300 {
    public int lengthOfLIS(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return 1;
        int[] dp=new int[numlen];//代表以下标i结尾的最长递增子序列长度
        Arrays.fill(dp,1);//每个位置最小长度都应该为1，即字符本身长度1
        int res=0;
        for (int i = 1; i < numlen; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i])
                    dp[i]=Math.max(dp[i],dp[j]+1);
                if (dp[i]>res)
                    res=dp[i];
            }
        }
        return res;
    }
}
