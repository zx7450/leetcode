package 动态规划.爬楼梯;

/**
 * @author zx
 * @date 2021/11/10 10:37
 */
public class Quiz70 {
//    public int climbStairs(int n) {
//        if (n==1)
//            return 1;
//        int[] dp=new int[n+1];
//        dp[0]=dp[1]=1;//这里对dp[0]为何设置为1的解释有些牵强（其实就是奔着解题去的），也可以初始化dp[1]和dp[2]，从3开始遍历，就有了实际意义
//        for (int i = 2; i < n + 1; i++) {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }

    public static int climbStairs(int n) {
        if (n < 3)
            return n;
        int flag = 2, pre = 1, cur = 2;
        while (flag < n) {
            int tmp = cur;
            cur += pre;
            pre = tmp;
            flag++;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
