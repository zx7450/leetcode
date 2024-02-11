package 贪心算法.最大子序和;

/**
 * @author zx
 * @date 2021/11/04 9:41
 */
public class Quiz53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > ans)
                ans = sum;
            if (sum < 0)
                sum = 0;
        }
        return ans;
    }
}
