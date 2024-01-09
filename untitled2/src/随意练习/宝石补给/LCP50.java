package 随意练习.宝石补给;

/**
 * @author zx
 * @date 2024/1/9 10:07
 */
public class LCP50 {
    public int giveGem(int[] gem, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int sentnum = gem[operations[i][0]] / 2;
            gem[operations[i][0]] -= sentnum;
            gem[operations[i][1]] += sentnum;
        }
        int max = gem[0], min = gem[0];
        for (int i = 1; i < gem.length; i++) {
            if (gem[i] > max) max = gem[i];
            if (gem[i] < min) min = gem[i];
        }
        return max - min;
    }
}
