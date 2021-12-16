package 算法学习计划.算法入门.第三天双指针.移动零;

/**
 * @author zx
 * @date 2021/12/15 9:19
 */
public class Quiz283 {
//    public void moveZeroes(int[] nums) {
//        int numlen=nums.length;
//        if (numlen==1)
//            return;
//        int left=0;
//        int right=1;
//        while (right<numlen) {
//            while (nums[left]!=0) {
//                if (left>=numlen-2)
//                    return;
//                left++;
//            }
//            right=left+1;
//            if (right>=numlen)
//                return;
//            while (nums[right]==0) {
//                if (right==numlen-1)
//                    return;
//                right++;
//            }
//            nums[left]=nums[right];
//            nums[right]=0;
//            left++;
//        }
//    }

    public void moveZeroes(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return;
        int index=0;
        for (int num:nums) {
            if (num!=0)
                nums[index++]=num;
        }
        for (int i = index; i < numlen; i++) {
            nums[i]=0;
        }
    }
}
