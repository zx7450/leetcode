package 算法学习计划.算法基础.第一天二分查找.在排序数组中查找元素的第一个和最后一个位置;

/**
 * @author zx
 * @date 2021/12/27 19:08
 */
public class Quiz34 {
//    public int[] searchRange(int[] nums, int target) {//暴力搜索
//        int numlen=nums.length;
//        if (numlen==0)
//            return new int[]{-1,-1};
//        else if (numlen==1)
//            if (nums[0]==target)
//                return new int[]{0,0};
//            else return new int[]{-1,-1};
//        int startpos=-1,endpos=-1;
//        for (int i = 0; i < numlen; i++) {
//            if (nums[i]==target) {
//                if (startpos==-1) {
//                    startpos = i;
//                    endpos = i;
//                } else {
//                    endpos++;
//                }
//            }
//        }
//        return new int[]{startpos,endpos};
//    }

    public int[] searchRange(int[] nums, int target) {//二分法
        int numlen=nums.length;
        if (numlen==0)
            return new int[]{-1,-1};
        else if (numlen==1)
            if (nums[0]==target)
                return new int[]{0,0};
            else return new int[]{-1,-1};
        int left=binarySearch(nums,target,true);//通过二分法找到第一个等于target的数字
        int right=binarySearch(nums,target,false)-1;//通过二分法找到第一个大于target的数字，减一即为答案
        if (left<=right&&right<numlen&&nums[left]==target&&nums[right]==target)
            return new int[]{left,right};
        else return new int[]{-1,-1};
    }

    public int binarySearch(int[] nums,int target,boolean isleft) {
        int numslen=nums.length,left=0,right=numslen-1;
        int ans=numslen;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]>target||(nums[mid]>=target&&isleft)) {
                right=mid-1;
                ans=mid;
            } else {
                left=mid+1;
            }
        }
        return ans;
    }
}
