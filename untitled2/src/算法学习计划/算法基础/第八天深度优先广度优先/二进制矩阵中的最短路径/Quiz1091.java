package 算法学习计划.算法基础.第八天深度优先广度优先.二进制矩阵中的最短路径;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/1/6 9:38
 */
public class Quiz1091 {
    int[] dx=new int[]{1,1,1,-1,-1,-1,0,0};
    int[] dy=new int[]{0,1,-1,0,1,-1,1,-1};
    public int shortestPathBinaryMatrix(int[][] grid) {//dfs容易超时，应该使用bfs
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        if (n == 1)
            return grid[0][0] == 0 ? 1 : -1;
        else if (n == 2)
            return grid[1][1] == 0 ? 2 : -1;
        Queue<int[]> dq=new LinkedList<>();
        int len=1;
        dq.add(new int[]{0,0});
        grid[0][0]=1;
        while (!dq.isEmpty()) {
            int size=dq.size();
            for (int i = 0; i < size; i++) {
                int[] point=dq.poll();
                int x=point[0];
                int y=point[1];
                if (x==n-1&&y==n-1)
                    return len;
                for (int j = 0; j < 8; j++) {
                    int newx=x+dx[j];
                    int newy=y+dy[j];
                    if (newx>=0&&newx<n&&newy>=0&&newy<n&&grid[newx][newy]==0) {
                        grid[newx][newy]=1;
                        dq.add(new int[]{newx,newy});
                    }
                }
            }
            len++;
        }
        return -1;
    }


}
