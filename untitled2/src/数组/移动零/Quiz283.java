package 数组.移动零;

/**
 * @author zx
 * @date 2024/2/1 16:26
 */
public class Quiz283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return;
        int fast = 0, slow = 0;
        while (fast < n) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        for (int i = slow; i < n; i++) {
            nums[i] = 0;
        }
    }
}
