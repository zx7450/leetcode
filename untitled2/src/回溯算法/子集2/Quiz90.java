package 回溯算法.子集2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz90 {
    List<List<Integer>> ans;
    List<Integer> path;
    int n;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        n = nums.length;
        Arrays.sort(nums);
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int flag) {
        ans.add(new ArrayList<>(path));
        if (flag == n)
            return;
        for (int i = flag; i < n; i++) {
            if (i != flag && nums[i] == nums[i - 1])
                continue;
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
