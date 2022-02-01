package 剑指offer第二版.剪绳子;

/**
 * @author zx
 * @date 2022/2/1 19:22
 */
public class Quiz14_1 {
    public int cuttingRope(int n) {//同样可用贪心，且时间更佳，见14.2思路
        if (n==2)
            return 1;
        int[] dp=new int[n+1];//代表长度为n的绳子裁剪后可得到的最大长度成绩
        dp[2]=1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));//判断是否进行裁剪
            }
        }
        return dp[n];
    }
}
