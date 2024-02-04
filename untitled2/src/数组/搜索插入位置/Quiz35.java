package 数组.搜索插入位置;

/**
 * @author zx
 * @date 2024/1/29 10:13
 */
public class Quiz35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (target <= nums[0])
            return 0;
        else if (target >= nums[r])
            return target == nums[r] ? r : r + 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r + 1;
    }
}
