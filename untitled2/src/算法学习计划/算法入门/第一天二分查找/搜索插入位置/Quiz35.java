package 算法学习计划.算法入门.第一天二分查找.搜索插入位置;

/**
 * @author zx
 * @date 2021/12/13 16:30
 */
public class Quiz35 {
    public int searchInsert(int[] nums, int target) {
        int numlen=nums.length;
        if (numlen==1)
            if (nums[0]==target||nums[0]>target)
                return 0;
            else
                return 1;
        int left=0;
        int right=numlen-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]==target)
                return mid;
            else {
                if (nums[mid]>target)
                    right=mid;
                else
                    left=mid+1;
            }
        }
        if (nums[left]<target)
            return left+1;
        else
            return left;
    }
}
