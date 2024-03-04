package 回溯算法.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/11/01 8:58
 */
public class Quiz46 {
    List<List<Integer>> ans;
    List<Integer> path;
    boolean[] used;
    int n;

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        n = nums.length;
        used = new boolean[n];
        backtracing(nums);
        return ans;
    }

    public void backtracing(int[] nums) {
        if (path.size() == n) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                backtracing(nums);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
