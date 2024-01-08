package 程序员面试金典.按摩师;

/**
 * @author zx
 * @date 2024/1/5 15:02
 */
public class Quiz17_16 {
    public static int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        else if (n == 1) return nums[0];
        else if (n == 2) return Math.max(nums[0], nums[1]);
        int[][] dp = new int[n][2];
        int serveThis = nums[0], notServe = 0;
        for (int i = 1; i < n; i++) {
            int temp = notServe;
            notServe = Math.max(serveThis, notServe);
            serveThis = temp + nums[i];
        }
        return Math.max(serveThis, notServe);
    }

    public static void main(String[] args) {
        System.out.println(massage(new int[]{2, 1, 1, 2}));
    }
}
