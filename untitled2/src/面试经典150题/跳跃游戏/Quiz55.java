package 面试经典150题.跳跃游戏;

/**
 * @author zx
 * @date 2024/1/24 10:09
 */
public class Quiz55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int canreach = 0;
        for (int i = 0; i <= canreach; i++) {
            canreach = Math.max(canreach, nums[i] + i);
            if (canreach >= n - 1)
                return true;
        }
        return false;
    }
}
