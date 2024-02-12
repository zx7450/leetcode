package 回溯算法.组合总和2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz40 {
    List<List<Integer>> result;
    List<Integer> path;
    int sum;
    int n;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        path = new ArrayList<>();
        sum = 0;
        n = candidates.length;
        Arrays.sort(candidates);
        backtracing(candidates, target, 0);
        return result;
    }

    public void backtracing(int[] candidates, int target, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < n && sum + candidates[i] <= target; i++) {
            if (i != start && candidates[i] == candidates[i - 1])
                continue;
            sum += candidates[i];
            path.add(candidates[i]);
            backtracing(candidates, target, i + 1);
            path.remove(path.size() - 1);
            sum -= candidates[i];
        }
    }
}
