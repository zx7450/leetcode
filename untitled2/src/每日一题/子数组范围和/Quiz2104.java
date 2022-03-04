package 每日一题.子数组范围和;

/**
 * @author zx
 * @date 2022/3/4 15:43
 */
public class Quiz2104 {
    public long subArrayRanges(int[] nums) {
        int numlen= nums.length;
        if (numlen==1)
            return 0;
        long ans=0;
        for (int i = 0; i < numlen; i++) {
            int minval=Integer.MAX_VALUE,maxval=Integer.MIN_VALUE;
            for (int j = i; j < numlen; j++) {
                maxval=Math.max(maxval,nums[j]);
                minval=Math.min(minval,nums[j]);
                ans+=maxval-minval;
            }
        }
        return ans;
    }
}
