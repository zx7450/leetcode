package 剑指offer第二版.礼物的最大价值;

/**
 * @author zx
 * @date 2022/3/1 10:10
 */
public class Quiz47 {
    public int maxValue(int[][] grid) {
        int rowlen= grid.length;
        int collen=grid[0].length;
        if (rowlen==1&&collen==1)
            return grid[0][0];
        int[][] dp=new int[rowlen][collen];
        dp[0][0]=grid[0][0];
        for (int i = 1; i < rowlen; i++) {
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }
        for (int i = 1; i < collen; i++) {
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }
        for (int i = 1; i < rowlen; i++) {
            for (int j = 1; j < collen; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[rowlen-1][collen-1];
    }
}
