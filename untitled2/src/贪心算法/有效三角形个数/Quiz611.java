package 贪心算法.有效三角形个数;

import java.util.Arrays;

/**
 * @author zx
 * @date 2023/12/29 14:53
 */
public class Quiz611 {
    public int triangleNumber(int[] nums) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = n - 1; k > j; k--) {
                    if (nums[k] >= nums[i] + nums[j]) continue;
                    ans += k - j;
                    break;
                }
            }
        }
        return ans;
    }
}
