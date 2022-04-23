package 回溯算法.组合问题;

import java.util.ArrayList;
import java.util.List;

public class Quiz77 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();

    public List<List<Integer>> combine(int n, int k) {
        backtracing(n, k, 1);
        return result;
    }

    public void backtracing(int n, int k, int startpos) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracing(n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
