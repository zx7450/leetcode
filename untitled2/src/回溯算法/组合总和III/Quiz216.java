package 回溯算法.组合总和III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2024/2/10 21:08
 */
public class Quiz216 {
    static List<List<Integer>> ans;
    static List<Integer> path;
    static int sum;

    public static List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        if (n == 1) {
            if (k == 1) {
                path.add(1);
                ans.add(path);
            }
            return ans;
        }
        sum = 0;
        backtracing(1, k, n);
        return ans;
    }

    public static void backtracing(int i, int k, int n) {
        if (k == 0) {
            if (sum == n)
                ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j <= 9 - k + 1; j++) {
            sum += j;
            if (sum > n) {
                sum -= j;
                return;
            }
            path.add(j);
            backtracing(j + 1, k - 1, n);
            path.remove(path.size() - 1);
            sum -= j;
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
}
