package 随意练习.买钢笔和铅笔的方案数;

/**
 * @author zx
 * @date 2024/1/8 14:38
 */
public class Quiz2240 {
    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (total < cost1 && total < cost2) return 1;
        else if (total < cost1) return total / cost2 + 1;
        else if (total < cost2) return total / cost1 + 1;
        long ans = 0;
        for (int i = 0; i <= total / cost1; i++) {
            ans += (total - i * cost1) / cost2 + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToBuyPensPencils(20, 10, 5));
    }
}
