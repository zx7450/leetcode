package 动态规划.不同的二叉搜索树;

/**
 * @author zx
 * @date 2021/11/12 9:33
 */
public class Quiz96 {
    public int numTrees(int n) {
        if (n==1||n==2)
            return n;
        int[] dp=new int[n+1];
        dp[0]=1;//无实际意义，仅用于求解（也可以用空结点也是一个二叉树来说明）
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i]+=(dp[j-1]*dp[i-j]);//确定一个根节点后左、右子树的数目相乘
            }
        }
        return dp[n];
    }
}
