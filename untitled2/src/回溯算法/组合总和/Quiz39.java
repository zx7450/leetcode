package 回溯算法.组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz39 {
    List<List<Integer>> result;
    List<Integer> path;
    int n;
    int sum;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {//优化：对集合进行排序，则在for循环就可以知道sum是否大于target
        n = candidates.length;
        result = new ArrayList<>();
        path = new ArrayList<>();
        if (n == 1) {
            if (target == candidates[0]) {
                path.add(candidates[0]);
                result.add(new ArrayList<>(path));
            }
            return result;
        }
        Arrays.sort(candidates);
        sum = 0;
        backTracing(candidates, target, 0);
        return result;
    }

    public void backTracing(int[] candidates, int target, int cur) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
        } else if (sum < target) {
            for (int i = cur; i < n && sum + candidates[i] <= target; i++) {
                sum += candidates[i];
                path.add(candidates[i]);
                backTracing(candidates, target, i);
                path.remove(path.size() - 1);
                sum -= candidates[i];
            }
        }
    }

}
