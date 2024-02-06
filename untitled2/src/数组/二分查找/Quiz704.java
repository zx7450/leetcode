package 数组.二分查找;

/**
 * @author zx
 * @date 2024/1/29 9:53
 */
public class Quiz704 {
    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        if (target == nums[0])
            return 0;
        else if (target == nums[j])
            return j;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2));
    }
}
