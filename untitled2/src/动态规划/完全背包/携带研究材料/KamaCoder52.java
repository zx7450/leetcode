package 动态规划.完全背包.携带研究材料;

import java.util.*;

/**
 * @author zx
 * @date 2024/2/9 12:30
 */
public class KamaCoder52 {
    public static int solution(int n, int v, int[] weight, int[] value) {
        int[] dp = new int[v + 1];
        for (int i = 0; i < n; i++) {
            for (int j = weight[i]; j <= v; j++) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        return dp[v];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        System.out.println(solution(n, v, weight, value));
    }
}
