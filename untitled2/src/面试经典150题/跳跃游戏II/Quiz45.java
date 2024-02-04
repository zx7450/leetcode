package 面试经典150题.跳跃游戏II;

/**
 * @author zx
 * @date 2024/1/24 10:54
 */
public class Quiz45 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        int end = 0;
        int maxdis = 0;
        int step = 0;
        for (int i = 0; i < n - 1; i++) {
            maxdis = Math.max(maxdis, nums[i] + i);
            if (i == end) {
                end = maxdis;
                step++;
            }
        }
        return step;
    }
}
