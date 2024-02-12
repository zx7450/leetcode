package 贪心算法.加油站;

/**
 * @author zx
 * @date 2021/11/06 10:16
 */
public class Quiz134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if (n == 1)
            return gas[0] >= cost[0] ? 0 : -1;
        int total = 0, cur = 0, start = 0;
        for (int i = 0; i < n; i++) {
            cur += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (cur < 0) {
                start = i + 1;
                cur = 0;
            }
        }
        if (total < 0)
            return -1;
        return start;
    }
}
