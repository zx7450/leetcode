package 算法学习计划.算法基础.第二天二分查找.寻找峰值;

/**
 * @author zx
 * @date 2021/12/28 10:00
 */
public class Quiz162 {
//    public int findPeakElement(int[] nums) {//暴力搜索
//        int numlen=nums.length;
//        if (numlen==1)
//            return 0;
//        else if (numlen==2)
//            return nums[0]>nums[1]?0:1;
//        int ans=0;
//        for (int i = 0; i < numlen; i++) {
//            if (i==0) {
//                if (nums[1] < nums[0])
//                    return 0;
//            } else if (i==(numlen)-1)
//                return numlen-1;
//            else {
//                if (nums[i]>nums[i-1]&&nums[i]>nums[i+1])
//                    return i;
//                }
//        }
//        return ans;
//    }

    public int findPeakElement(int[] nums) {//二分爬坡
        int numlen=nums.length;
        if (numlen==1)
            return 0;
        else if (numlen==2)
            return nums[0]>nums[1]?0:1;
        int left=0,right=numlen-1;
        while (left<right) {
            int mid=left+(right-left)/2;
            if (nums[mid]<nums[mid+1])
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
}
