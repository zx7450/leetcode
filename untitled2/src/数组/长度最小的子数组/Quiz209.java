package 数组.长度最小的子数组;

public class Quiz209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0] >= target ? 1 : 0;
        int ans = Integer.MAX_VALUE, l = 0, r = 0, sum = 0;
        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
