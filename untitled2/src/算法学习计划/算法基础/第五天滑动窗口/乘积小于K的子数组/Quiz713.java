package 算法学习计划.算法基础.第五天滑动窗口.乘积小于K的子数组;

/**
 * @author zx
 * @date 2022/1/4 15:11
 */
public class Quiz713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1)
            return 0;
        int numlen=nums.length;
        if (numlen==1)
            return nums[0]<k?1:0;
        int prod=1,left=0,right=0,ans=0;
        while (right<numlen) {
            prod*=nums[right];
            while (prod>=k) {
                prod/=nums[left++];
            }
            ans+=right-left+1;
            right++;
        }
        return ans;
    }
}
