package 贪心算法.K次取反后最大化的数组和;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/05 10:36
 */
public class Quiz1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            return k % 2 == 0 ? nums[0] : -nums[0];
        }
        Arrays.sort(nums);
        if (nums[0] >= 0) {
            if (k % 2 != 0)
                nums[0] = -nums[0];
        } else if (nums[n - 1] <= 0) {
            for (int i = 0; i < n && k > 0; i++) {
                nums[i] = -nums[i];
                k--;
            }
            if (k % 2 != 0 && nums[n - 1] != 0)
                nums[n - 1] = -nums[n - 1];
        } else {
            int i = 0;
            while (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                i++;
                k--;
            }
            if (k > 0) {
                if (nums[i] != 0 && k % 2 != 0) {
                    if (nums[i] > nums[i - 1])
                        nums[i - 1] = -nums[i - 1];
                    else
                        nums[i] = -nums[i];
                }
            }
        }
        return getSum(nums);
    }

    public int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
