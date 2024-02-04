package 每日一题.适合野炊的日子;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2024/1/18 10:19
 */
public class Quiz2100 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) left[i] = left[i - 1] + 1;
            if (security[n - i - 1] <= security[n - i]) right[n - i - 1] = right[n - i] + 1;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = time; i < n; i++) {
            if (left[i] >= time && right[i] >= time) ans.add(i);
        }
        return ans;
    }
}
