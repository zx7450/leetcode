package 程序员面试金典.魔术索引;

/**
 * @author zx
 * @date 2022/4/20 9:57
 */
public class Quiz08_03 {
    public int findMagicIndex(int[] nums) {
        return findans(0,nums.length-1,nums);
    }

    public int findans(int left,int right,int[] nums) {
        if (left>right)
            return -1;
        int mid=(left+right)/2;
        int leftans=findans(left,mid-1,nums);
        if (leftans!=-1)
            return leftans;
        else if (nums[mid]==mid)
            return mid;
        else return findans(mid+1,right,nums);
    }
}
