package 算法学习计划.算法入门.第一天二分查找.二分查找;

/**
 * @author zx
 * @date 2021/12/13 16:00
 */
public class Quiz704 {
    public int search(int[] nums, int target) {
        int numlen=nums.length;
        if (numlen==1)
            if (nums[0]==target)
                return 0;
            else return -1;
        int left=0;
        int right=numlen-1;
        while (left<=right) {
            int mid= (left+right)/2;
            if (nums[mid]==target)
                return mid;
            else {
                if (nums[mid]<target)
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
}
