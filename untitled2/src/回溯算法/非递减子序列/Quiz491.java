package 回溯算法.非递减子序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2024/3/4 16:26
 */
public class Quiz491 {
    List<List<Integer>> ans;
    List<Integer> path;
    int n;

    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        n = nums.length;
        if (n == 1)
            return ans;
        else if (n == 2) {
            if (nums[1] >= nums[0]) {
                path.add(nums[0]);
                path.add(nums[1]);
                ans.add(new ArrayList<>(path));
            }
            return ans;
        }
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int start) {
        if (path.size() >= 2)
            ans.add(new ArrayList<>(path));
        if (start == n)
            return;
        boolean[] visited = new boolean[201];
        for (int i = start; i < n; i++) {
            if ((!path.isEmpty() && path.get(path.size() - 1) > nums[i]) || visited[nums[i] + 100])
                continue;
            path.add(nums[i]);
            visited[nums[i] + 100] = true;
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
