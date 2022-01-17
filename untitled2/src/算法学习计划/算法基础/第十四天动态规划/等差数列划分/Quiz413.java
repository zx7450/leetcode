package 算法学习计划.算法基础.第十四天动态规划.等差数列划分;

/**
 * @author zx
 * @date 2022/1/13 1:46
 */
public class Quiz413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int numlen=nums.length;
        if (numlen<3)
            return 0;
        int[] dp=new int[numlen];//表示以nums[i]结尾且长度大于等于3的等差数列的个数(此处必须以nums[i]结尾)
        int ans=0;
        for (int i = 2; i < numlen; i++) {//由于等差数列长度至少为3，dp数组从3开始才有实际意义
            if (nums[i]-nums[i-1]==nums[i-1]-nums[i-2]) {//表明序列满足等差数列性质
                dp[i]=dp[i-1]+1;//dp[i]为以dp[i-1]结尾的长度大于等于3的个数加上长度为2（加上nums[i]就满足条件）的个数（即1）
                ans+=dp[i];
            }
        }
        return ans;
    }
}
