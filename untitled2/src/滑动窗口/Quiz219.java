package 滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * @date 2024/1/10 11:16
 */
public class Quiz219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Map<Integer, Integer> numandpos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numandpos.containsKey(nums[i])) {
                if (Math.abs(numandpos.get(nums[i]) - i) <= k) return true;
            }
            numandpos.put(nums[i], i);
        }
        return false;
    }
}
