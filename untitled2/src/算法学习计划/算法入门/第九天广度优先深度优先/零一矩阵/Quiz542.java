package 算法学习计划.算法入门.第九天广度优先深度优先.零一矩阵;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/21 9:54
 */
public class Quiz542 {
//    int[] dx={-1,1,0,0};
//    int[] dy={0,0,-1,1};
//    public int[][] updateMatrix(int[][] mat) {
//        int rowlen= mat.length;
//        int collen=mat[0].length;
//        int[][] dist=new int[rowlen][collen];
//        boolean[][] visited=new boolean[rowlen][collen];
//        Queue<int[]> queue=new LinkedList<>();
//        for (int i = 0; i < rowlen; i++) {//首先将所有0添加进队列中
//            for (int j = 0; j < collen; j++) {
//                if (mat[i][j]==0) {
//                    queue.add(new int[]{i,j});
//                    visited[i][j]=true;
//                }
//            }
//        }
//        while (!queue.isEmpty()) {
//            int[] cell=queue.poll();
//            int i=cell[0],j=cell[1];
//            for (int d = 0; d < 4; d++) {
//                int di=i+dx[d];
//                int dj=j+dy[d];
//                if (di>=0&&di<rowlen&&dj>=0&&dj<collen&&!visited[di][dj]){
//                    dist[di][dj]=dist[i][j]+1;
//                    queue.add(new int[]{di,dj});
//                    visited[di][dj]=true;
//                }
//            }
//        }
//        return dist;
//    }
    public int[][] updateMatrix(int[][] mat) {//动态规划
        int rowlen= mat.length,collen=mat[0].length;
        int[][] dp=new int[rowlen][collen];
        for (int i = 0; i < rowlen; i++) {
            Arrays.fill(dp[i],Integer.MAX_VALUE/2);
        }
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (mat[i][j]==0)
                    dp[i][j]=0;
            }
        }
        //只有水平向左移动和竖直向上移动
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (i-1>=0)
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);
                if (j-1>=0)
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
            }
        }
        //只有水平向左和竖直向下
        for (int i = rowlen-1; i >= 0; i--) {
            for (int j = 0; j < collen; j++) {
                if (i+1<rowlen)
                    dp[i][j]=Math.min(dp[i][j],dp[i+1][j]+1);
                if (j-1>=0)
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
            }
        }
        //只有水平向右和竖直向上
        for (int i = 0; i < rowlen; i++) {
            for (int j = collen-1; j >= 0; j--) {
                if (i-1>=0)
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);
                if (j+1<collen)
                    dp[i][j]=Math.min(dp[i][j],dp[i][j+1]+1);
            }
        }
        //只有水平向右和竖直向下
        for (int i = rowlen-1; i >= 0; i--) {
            for (int j = collen-1; j >= 0; j--) {
                if (i+1<rowlen)
                    dp[i][j]=Math.min(dp[i][j],dp[i+1][j]+1);
                if (j+1<collen)
                    dp[i][j]=Math.min(dp[i][j],dp[i][j+1]+1);
            }
        }
        return dp;
    }
}
