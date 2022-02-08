package 剑指offer第二版.调整数组顺序使奇数位于偶数前面;

/**
 * @author zx
 * @date 2022/2/8 15:53
 */
public class Quiz21 {
    public int[] exchange(int[] nums) {//思路：双指针，分别从前往后找偶数、从后往前找偶数，然后交换
        int numlen=nums.length;
        if (numlen<2)
            return nums;
        int left=0,right=numlen-1;
        while (left<right) {
            while (nums[left]%2!=0&&left<right)
                left++;
            while (nums[right]%2==0&&left<right)
                right--;
            if (left<right) {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            } else break;
        }
        return nums;
    }
}
