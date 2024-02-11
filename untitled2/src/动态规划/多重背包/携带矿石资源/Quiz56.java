package 动态规划.多重背包.携带矿石资源;

import java.util.Scanner;

/**
 * @author zx
 * @date 2024/2/11 16:00
 */
public class Quiz56 {
    public static int getValue(int c, int n, int[] weight, int[] value, int[] num) {
        int[] dp = new int[c + 1];
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = c; j >= weight[i]; j--) {
                for (int k = 1; k <= num[i] && (j - k * weight[i] >= 0); k++) {
                    dp[j] = Math.max(dp[j], dp[j - k * weight[i]] + k * value[i]);
                }
            }
        }
        return dp[c];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(getValue(c, n, weight, value, num));
    }
}
