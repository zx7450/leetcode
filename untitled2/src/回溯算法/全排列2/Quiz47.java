package 回溯算法.全排列2;

import java.util.*;

/**
 * @author zx
 * @date 2021/11/01 9:12
 */
public class Quiz47 {
    static List<List<Integer>> ans;
    static List<Integer> path;
    static boolean[] used;
    static int n;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        n = nums.length;
        used = new boolean[n];
        Arrays.sort(nums);
        backtracing(nums);
        return ans;
    }

    private static void backtracing(int[] nums) {
        if (path.size() == n) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]))
                continue;
            path.add(nums[i]);
            used[i] = true;
            backtracing(nums);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(permuteUnique(nums));
    }
}
