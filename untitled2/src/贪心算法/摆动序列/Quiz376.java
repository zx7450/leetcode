package 贪心算法.摆动序列;

/**
 * @author zx
 * @date 2021/11/03 10:46
 */
public class Quiz376 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        else if (n == 2)
            return nums[0] == nums[1] ? 1 : 2;
        int ans = 0;
        boolean isPos = true;
        boolean firststart = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                if (firststart) {
                    isPos = true;
                    firststart = false;
                    ans++;
                } else if (!isPos) {
                    isPos = true;
                    ans++;
                }
            } else if (nums[i] < nums[i - 1]) {
                if (firststart) {
                    isPos = false;
                    firststart = false;
                    ans++;
                } else if (isPos) {
                    isPos = false;
                    ans++;
                }
            }
        }
        return ans + 1;
    }
}
