package 贪心算法.跳跃游戏;

/**
 * @author zx
 * @date 2021/11/05 9:12
 */
public class Quiz55 {//思路：不用管能跳几步，每次取最大的跳跃范围，若能覆盖到最后一位就可以跳到
    public boolean canJump(int[] nums) {
        int cover=0;
        for (int i = 0; i <= cover; i++) {//i只能在最大覆盖范围内尝试
            cover=Math.max(i+nums[i],cover);//当前位置的最大跳跃范围若大于之前的最大范围则更新
            if (cover>=(nums.length-1))//最大跳跃范围若大于最后一个元素的下标则直接返回
                return true;
        }
        return false;//范围内无法跳到，返回false
    }
}
