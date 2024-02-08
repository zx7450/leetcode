package 哈希表.两数之和;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * @date 2024/2/8 22:36
 */
public class Quiz1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> occ = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (occ.containsKey(target - nums[i]))
                return new int[]{occ.get(target - nums[i]), i};
            occ.put(nums[i], i);
        }
        return new int[0];
    }
}
