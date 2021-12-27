package 算法学习计划.算法基础.第一天二分查找.搜索旋转排序数组;

/**
 * @author zx
 * @date 2021/12/27 19:39
 */
public class Quiz33 {
//    public int search(int[] nums, int target) {//暴力搜索+优化
//        int numlen=nums.length;
//        if (numlen==1)
//            if (nums[0]==target)
//                return 0;
//            else return -1;
//        for (int i = 0; i < numlen; i++) {
//            if (nums[i]==target)
//                return i;
//            else {
//                if (nums[i]>target)
//                    if (i>0&&nums[i]<nums[i-1])
//                        return -1;
//                    else
//                        continue;
//                else {
//                    if (i<numlen-1&&nums[i]>nums[i+1])
//                        return -1;
//                    else continue;
//                }
//            }
//        }
//        return -1;
//    }

    public int search(int[] nums, int target) {//二分法
        int numlen=nums.length;
        if (numlen==1)
            return target==nums[0]?0:-1;
        int left=0,right=numlen-1;
        while (left<=right) {//以mid为中心划分两个空间,先判断哪个空间是有序空间,在在符合条件的空间内二分
            int mid=left+(right-left)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[0]<=nums[mid]) {//判断[0,mid]是否为有序部分
                if (target >= nums[0] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {//右边为有序空间
                if (target > nums[mid] && target <= nums[numlen - 1])
                    left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
