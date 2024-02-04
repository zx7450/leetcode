package 数组.移除元素;

/**
 * @author zx
 * @date 2024/1/31 9:09
 */
public class Quiz27 {
    public static int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length;
        while (l < r) {
            if (nums[l] == val) {
                nums[l] = nums[r-1];
                r--;
            } else
                l++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }
}
