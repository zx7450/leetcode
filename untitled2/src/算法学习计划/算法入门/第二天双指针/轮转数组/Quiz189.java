package 算法学习计划.算法入门.第二天双指针.轮转数组;

/**
 * @author zx
 * @date 2021/12/14 9:40
 */
public class Quiz189 {
//    public void rotate(int[] nums, int k) {//双数组
//        int numlen=nums.length;
//        if (numlen==1)
//            return;
//        int[] ans=new int[numlen];
//        for (int i = 0; i < numlen; i++) {
//            ans[(i+k)%numlen]=nums[i];
//        }
//        for (int i = 0; i < numlen; i++) {
//            nums[i]=ans[i];
//        }
//        return;
//    }
    public void rotate(int[] nums, int k) {//翻转
        int numlen=nums.length;
        if (numlen==1)
            return;
        k%=numlen;
        reverse(nums,0,numlen-1);
        reverse(nums,0,k-1);
        reverse(nums,k,numlen-1);
    }
    public void reverse(int[] nums,int start,int end) {
        while (start<end) {
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}
