package 贪心算法.跳跃游戏;

/**
 * @author zx
 * @date 2021/11/05 9:12
 */
public class Quiz55 {//思路：不用管能跳几步，每次取最大的跳跃范围，若能覆盖到最后一位就可以跳到

    public boolean canJump(int[] nums) {
        int maxRange = 0;
        for (int i = 0; i <= maxRange; i++) {
            maxRange = Math.max(maxRange, i + nums[i]);
            if (maxRange >= nums.length - 1)
                return true;
        }
        return false;
    }
}
