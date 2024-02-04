package 数组.有序数组的平方;

/**
 * @author zx
 * @date 2024/2/2 14:21
 */
public class Quiz977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = n - 1, pos = n - 1;
        while (pos >= 0) {
            int l1 = nums[l] * nums[l], l2 = nums[r] * nums[r];
            if (l1 >= l2) {
                ans[pos] = l1;
                l++;
            } else {
                ans[pos] = l2;
                r--;
            }
            pos--;
        }
        return ans;
    }
}
