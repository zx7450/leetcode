package 数组.长度最小的子数组;

public class Quiz209 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = 0;
        int head = 0;
        int tail = 0;
        int length = 1;
        int sum = nums[0];
        while (true) {
            if (sum >= target)
                if (length == 1)
                    return 1;
                else {
                    if (ans == 0 || ans > length)
                        ans = length;
                    sum -= nums[head];
                    head++;
                    length--;
                }
            else {
                tail++;
                if (tail == nums.length)
                    break;
                sum += nums[tail];
                length++;
            }
        }
        return ans;
    }
}
