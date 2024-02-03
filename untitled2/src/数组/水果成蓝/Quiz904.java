package 数组.水果成蓝;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2024/2/3 20:40
 */
public class Quiz904 {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n < 3)
            return n;
        Map<Integer, Integer> fruitsMap = new HashMap<>();
        int l = 0, ans = 0;
        for (int r = 0; r < n; r++) {
            fruitsMap.put(fruits[r], fruitsMap.getOrDefault(fruits[r], 0) + 1);
            while (fruitsMap.size() > 2) {
                int lNum = fruitsMap.get(fruits[l]);
                if (lNum == 1)
                    fruitsMap.remove(fruits[l]);
                else
                    fruitsMap.put(fruits[l], lNum - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
