package 动态规划.最长递增子序列;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/22 9:06
 */
public class Quiz300 {
    public int lengthOfLIS(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return 1;
        else if (numlen==2)
            if (nums[0]>=nums[1])
                return 1;
            else
                return 2;
        int[] dp=new int[numlen];
        Arrays.fill(dp,1);//每个位置开始的子序列最小长度应该为1（它本身）
        int res=0;
        for (int i = 1; i < numlen; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            if (dp[i]>res)
                res=dp[i];
        }
        return res;
    }
}
