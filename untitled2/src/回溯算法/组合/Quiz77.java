package 回溯算法.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2024/2/10 20:34
 */
public class Quiz77 {
    static List<List<Integer>> ans;
    static List<Integer> path;

    public static List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        if (n == 1) {
            path.add(1);
            ans.add(new ArrayList<>(path));
            return ans;
        }
        path = new ArrayList<>();
        backtracing(1, n, k);
        return ans;
    }

    public static void backtracing(int i, int n, int k) {
        if (k == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j <= n - k + 1; j++) {
            path.add(j);
            backtracing(j + 1, n, k - 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(1, 1));
    }
}
