package 每日一题.三角形的最大周长;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2023/12/27 9:38
 */
public class Quiz976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) return nums[i - 2] + nums[i - 1] + nums[i];
        }
        return 0;
    }
}
