package 随意练习.从两个数字数组里生成最小数字;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * @date 2024/1/9 9:35
 */
public class Quiz2605 {
    public int minNumber(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length, ans = -1, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        Set<Integer> numsset = new HashSet<>();
        for (int i = 0; i < l1; i++) {
            if (nums1[i] < min1) min1 = nums1[i];
            numsset.add(nums1[i]);
        }
        for (int i = 0; i < l2; i++) {
            if (numsset.contains(nums2[i])) {
                ans = ans < 0 ? nums2[i] : Math.min(ans, nums2[i]);
            }
            if (ans < 0) {
                if (nums2[i] < min2) min2 = nums2[i];
            }
        }
        if (ans > 0) return ans;
        else return min1 > min2 ? min2 * 10 + min1 : min1 * 10 + min2;
    }
}
