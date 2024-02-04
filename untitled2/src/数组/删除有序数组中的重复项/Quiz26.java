package 数组.删除有序数组中的重复项;

/**
 * @author zx
 * @date 2024/2/1 15:22
 */
public class Quiz26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
