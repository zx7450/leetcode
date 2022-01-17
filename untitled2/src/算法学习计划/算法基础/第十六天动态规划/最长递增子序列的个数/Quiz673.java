package 算法学习计划.算法基础.第十六天动态规划.最长递增子序列的个数;

import java.util.Arrays;

/**
 * @author zx
 * @date 2022/1/17 23:08
 */
public class Quiz673 {
    public int findNumberOfLIS(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return 1;
        int[] dp=new int[numlen];//代表以下标i结尾的最长递增子序列长度
        int[] maxlencount=new int[numlen];//代表以下标i结尾的最长递增子序列个数
        Arrays.fill(dp,1);//每个位置最小长度都应该为1，即字符本身长度1
        Arrays.fill(maxlencount,1);//此处考虑最坏情况，即严格递减，每位长度都设为1
        int maxlen=0;
        int res=0;
        for (int i = 0; i < numlen; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]) {
                    if (dp[j]+1>dp[i]) {
                        dp[i]=dp[j]+1;
                        maxlencount[i]=maxlencount[j];//重置个数
                    } else if (dp[j]+1==dp[i]) {
                        maxlencount[i]+=maxlencount[j];
                    }
                }
            }
            if (dp[i]==maxlen) {
                res+=maxlencount[i];
            } else if (dp[i]>maxlen) {
                maxlen=dp[i];
                res=maxlencount[i];
            }
        }
        return res;
    }
}
