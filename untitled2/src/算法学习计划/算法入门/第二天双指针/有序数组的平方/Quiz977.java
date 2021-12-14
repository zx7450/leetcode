package 算法学习计划.算法入门.第二天双指针.有序数组的平方;

/**
 * @author zx
 * @date 2021/12/14 9:25
 */
public class Quiz977 {
    public int[] sortedSquares(int[] nums) {
        int numlen=nums.length;
        if (numlen==1) {
            nums[0]=nums[0]*nums[0];
            return nums;
        }
        int left=0;
        int right=numlen-1;
        int[] ans=new int[numlen];
        if (nums[right]<=0)
            for (int i = 0; i < numlen; i++) {
                ans[i]=nums[right]*nums[right];
                right--;
            }
        else if (nums[left]>=0)
            for (int i = 0; i < numlen; i++) {
                ans[i]=nums[left]*nums[left];
                left++;
            }
        else {
            for (int i = numlen-1; i >=0; i--) {
                if (nums[left]<0)
                    if (nums[left]*nums[left]>nums[right]*nums[right]) {
                        ans[i] = nums[left]*nums[left];
                        left++;
                    } else {
                        ans[i]=nums[right]*nums[right];
                        right--;
                    }
                else {
                    ans[i] = nums[right]*nums[right];
                    right--;
                }
            }
        }
        return ans;
    }
}
