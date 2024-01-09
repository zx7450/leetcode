package 程序员面试金典.消失的数字;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2024/1/9 15:01
 */
public class Quiz17_04 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0] == 0 ? 1 : 0;
        Set<Integer> hasoccur = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hasoccur.add(nums[i]);
        }
        for (int i = 0; i < n + 1; i++) {
            if (!hasoccur.contains(i)) return i;
        }
        return 0;
    }
}
