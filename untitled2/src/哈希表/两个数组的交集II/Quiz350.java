package 哈希表.两个数组的交集II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zx
 * @date 2024/2/7 17:41
 */
public class Quiz350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        if (l1 == 0 || l2 == 0)
            return new int[0];
        Map<Integer, Integer> num1map = new HashMap<>();
        for (int i : nums1) {
            num1map.put(i, num1map.getOrDefault(i, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < l2 && !num1map.isEmpty()) {
            if (num1map.containsKey(nums2[i])) {
                ans.add(nums2[i]);
                int val = num1map.get(nums2[i]);
                if (val == 1)
                    num1map.remove(nums2[i]);
                else
                    num1map.put(nums2[i], val - 1);
            }
            i++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
