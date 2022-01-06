package 算法学习计划.算法基础.第五天滑动窗口.长度最小的子数组;

/**
 * @author zx
 * @date 2022/1/4 15:55
 */
public class Quiz209 {
    public int minSubArrayLen(int target, int[] nums) {
        int numlen = nums.length;
        if (numlen == 1)
            return nums[0] < target ? 0 : 1;
        int left = 0, right = 0, sum = 0, minlen = 100001, currlen = 0;
        while (right < numlen) {
            sum += nums[right];
            if (sum < target) {
                right++;
                continue;
            } else {
                while (sum >= target) {
                    sum -= nums[left++];
                }
                if (left > right)
                    return 1;
                else {
                    currlen = right - left + 2;
                    minlen = minlen < currlen ? minlen : currlen;
                }
                right++;
            }
        }
        return minlen == 100001 ? 0 : minlen;
    }
}
