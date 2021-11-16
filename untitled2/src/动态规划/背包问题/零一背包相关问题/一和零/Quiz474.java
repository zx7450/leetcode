package 动态规划.背包问题.零一背包相关问题.一和零;

public class Quiz474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for (String str:strs) {
            int onenum=0,zeronum=0;
            for (char c:str.toCharArray())
                if (c=='0')
                    zeronum++;
                else
                    onenum++;
            for (int i=m;i>=zeronum;i--)
                for (int j=n;j>=onenum;j--)
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeronum][j-onenum]+1);
        }
        return dp[m][n];
    }
}
