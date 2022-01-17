package 算法学习计划.算法基础.第十二天动态规划.跳跃游戏;

/**
 * @author zx
 * @date 2022/1/13 0:27
 */
public class Quiz55 {
    public boolean canJump(int[] nums) {
        int numlen=nums.length;
        int cover=0;
        for (int i = 0; i <= cover; i++) {
            cover=Math.max(i+nums[i],cover);
            if (cover>=(numlen-1))
                return true;
        }
        return false;
    }
}
