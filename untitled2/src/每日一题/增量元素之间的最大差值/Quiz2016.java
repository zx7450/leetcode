package 每日一题.增量元素之间的最大差值;

/**
 * @author zx
 * @date 2022/2/26 9:34
 */
public class Quiz2016 {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        if (n==2)
            return nums[1]>nums[0]?nums[1]-nums[0]:-1;
        int maxdiff=-1;
        int left=0,right=1;
        while (right<n) {
            if (nums[left]>=nums[right]) {
                left=right;
                right++;
            } else {
                while (right<n-1&&nums[right+1]>nums[right])
                    right++;
                maxdiff=Math.max(maxdiff,nums[right]-nums[left]);
                right++;
            }
        }
        return maxdiff;
    }
}
