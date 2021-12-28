package 算法学习计划.算法基础.第二天二分查找.寻找旋转排序数组中的最小值;

/**
 * @author zx
 * @date 2021/12/28 9:36
 */
public class Quiz153 {
//    public int findMin(int[] nums) {//暴搜
//        int numslen=nums.length;
//        if (numslen==1)
//            return nums[0];
//        else if (numslen==2)
//            return nums[0]<nums[1]?nums[0]:nums[1];
//        else if (nums[0]<nums[numslen-1])
//            return nums[0];
//        int ans=nums[numslen-1];
//        for (int i = 1; i < numslen; i++) {
//            if (nums[i]<nums[i-1])
//                return nums[i];
//        }
//        return ans;
//    }

    public int findMin(int[] nums) {//二分
        int numslen=nums.length;
        if (numslen==1)
            return nums[0];
        else if (numslen==2)
            return nums[0]<nums[1]?nums[0]:nums[1];
        else if (nums[0]<nums[numslen-1])
            return nums[0];
        int left=0,right=numslen-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if (nums[mid]<nums[right])
                right=mid;
            else if (nums[mid]>nums[right])
                left=mid+1;
            else
                right--;
        }
        return nums[left];
    }
}
