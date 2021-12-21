package 算法学习计划.算法入门.第九天广度优先深度优先.腐烂的橘子;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/21 14:14
 */
public class Quiz994 {
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    public int orangesRotting(int[][] grid) {
        int rowlen=grid.length;
        int collen=grid[0].length;
        int freshcount=0;
        Queue<int[]> queue=new LinkedList<>();
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (grid[i][j]==1)
                    freshcount++;
                else if (grid[i][j]==2)
                    queue.add(new int[]{i,j});
            }
        }
        int times=0;
        while (!queue.isEmpty()&&freshcount>0) {
            int queuesize=queue.size();
            for (int i = 0; i < queuesize; i++) {
                int[] cell=queue.poll();
                int a=cell[0],b=cell[1];
                for (int d = 0; d < 4; d++) {
                    int da=a+dx[d],db=b+dy[d];
                    if (da>=0&&da<rowlen&&db>=0&&db<collen&&grid[da][db]==1) {
                        grid[da][db]=2;
                        queue.add(new int[]{da,db});
                        freshcount--;
                    }
                }
            }
            times++;
        }
        if (freshcount>0)
            return -1;
        else return times;
    }
}
