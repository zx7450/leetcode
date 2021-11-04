package 贪心算法.最大子序和;

/**
 * @author zx
 * @date 2021/11/04 9:41
 */
public class Quiz53 {
    public int maxSubArray(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum>maxsum)// 取区间累计的最大值（相当于不断确定最大子序终止位置）
                maxsum=sum;
            if (sum<0)// 相当于重置最大子序起始位置，因为遇到负数一定是拉低总和
                sum=0;
        }
        return maxsum;
    }
}
