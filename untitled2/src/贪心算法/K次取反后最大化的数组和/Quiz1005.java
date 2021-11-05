package 贪心算法.K次取反后最大化的数组和;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/05 10:36
 */
public class Quiz1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums[0]>=0){//排序后最小数大于等于0
            if (nums[0]==0)//最小数等于0，则最大和的情况为对0k次取反，结果为原数组元素之和
                return getsum(nums);
            else {//最小元素如果大于0，若k为偶数结果为原数组之和，否则为1至num.length元素减位置0的元素
                if (k%2==0)
                    return getsum(nums);
                else {
                    nums[0]=-nums[0];
                    return getsum(nums);
                }
            }
        }
        int i=0;
        while (k>0){//这种情况下首先从左到右对负数取反，若有0则停止，否则取绝对值最小的数进行反复取反操作
            if (nums[i]<0) {
                nums[i]=-nums[i];
                k--;
                if (i<nums.length-1)
                    i++;
            } else {
                if (nums[i]==0)//等于0的情况直接对变换后的数组求和即可
                    break;
                else {
                    if (k%2==0)
                        break;
                    else {
                        if (nums[i]>nums[i-1])
                            nums[i-1]=-nums[i-1];
                        else
                            nums[i]=-nums[i];
                        break;
                    }
                }
            }
        }
        return getsum(nums);
    }
    public int getsum(int[] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
