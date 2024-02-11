package 贪心算法.跳跃游戏2;

/**
 * @author zx
 * @date 2021/11/05 9:30
 */
public class Quiz45 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        int currRange = 0, maxRange = 0, i = 0, step = 0;
        while (i < n - 1) {
            maxRange = Math.max(maxRange, nums[i] + i);
            if (i == currRange) {
                step++;
                currRange = maxRange;
            }
            i++;
        }
        return step + 1;
    }
}
