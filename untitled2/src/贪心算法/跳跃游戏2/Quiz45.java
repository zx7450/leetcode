package 贪心算法.跳跃游戏2;

/**
 * @author zx
 * @date 2021/11/05 9:30
 */
public class Quiz45 {
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;//代表次数之内的最大距离，当i超过这个距离时说明需要加一次了
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
