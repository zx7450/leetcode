package 哈希表.两个数组的交集;

import java.util.*;

public class Quiz349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        if (l1 == 0 || l2 == 0)
            return new int[0];
        Set<Integer> nums1set = new HashSet<>();
        for (int i : nums1) {
            if (nums1set.contains(i)) continue;
            nums1set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < l2 && !nums1set.isEmpty()) {
            if (nums1set.contains(nums2[i])) {
                ans.add(nums2[i]);
                nums1set.remove(nums2[i]);
            }
            i++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
