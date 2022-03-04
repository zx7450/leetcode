package 剑指offer第二版.缺失的数字;

/**
 * @author zx
 * @date 2022/3/4 15:53
 */
public class Quiz53_2 {
    public int missingNumber(int[] nums) {
        int numlen=nums.length;
        int now=0;
        for (int i = 0; i < numlen; i++) {
            if (nums[i]!=now)
                break;
            now++;
        }
        return now;
    }
}
