package 回溯算法.子集;

import java.util.ArrayList;
import java.util.List;

public class Quiz78 {
    List<List<Integer>> ans;
    List<Integer> path;
    int n;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        n = nums.length;
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int flag) {
        ans.add(new ArrayList<>(path));
        if (flag == n)
            return;
        for (int i = flag; i < n; i++) {
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
