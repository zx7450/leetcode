package 动态规划.爬楼梯进阶版;

import java.util.*;

/**
 * @author zx
 * @date 2024/2/9 16:51
 */
public class KamaCoder57 {

    public static int solution(int n, int m) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i >= j)
                    dp[i] += dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }

}
