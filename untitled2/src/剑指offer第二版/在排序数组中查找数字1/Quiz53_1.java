package 剑指offer第二版.在排序数组中查找数字1;

/**
 * @author zx
 * @date 2022/3/4 15:48
 */
public class Quiz53_1 {
    public int search(int[] nums, int target) {
        int numlen=nums.length;
        if (numlen==0)
            return 0;
        else if (numlen==1)
            return nums[0]==target?1:0;
        int ans=0;
        for (int i = 0; i < numlen; i++) {
            if (nums[i]==target)
                ans++;
            else if (ans==0)
                continue;
            else
                break;
        }
        return ans;
    }
}
