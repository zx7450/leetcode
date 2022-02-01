package 剑指offer第二版.机器人的运动范围;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/2/1 18:39
 */
public class Quiz13 {
//    boolean[][] visit;
//    int m,n,k;
//    public int movingCount(int m, int n, int k) {//dfs
//        if (m==1&&n==1)
//            return 1;
//        this.m=m;
//        this.k=k;
//        this.n=n;
//        visit=new boolean[m][n];
//        return backtracing(0,0,0,0);
//    }
//
//    public int backtracing(int x,int y,int sx,int sy) {//sx、sy代表x、y的数位和
//        if (x>=m||y>=n||visit[x][y]||sx+sy>k)   return 0;
//        visit[x][y]=true;
//        return 1+backtracing(x+1,y,(x+1)%10==0?sx-8:sx+1,sy)
//                +backtracing(x,y+1,sx,(y+1)%10==0?sy-8:sy+1);//分别向右和下方向计算能到达的格子数加一即为从本位置开始能到达的最大格子数
//    }

    public int movingCount(int m, int n, int k) {//bfs，先将能到达的元素入队，过滤不满足条件的元素再进行下一步操作
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        int res=0;
        boolean[][] visit=new boolean[m][n];
        while (!queue.isEmpty()) {
            int[] cell= queue.poll();
            int x=cell[0],y=cell[1],sx=cell[2],sy=cell[3];//sx、sy代表x、y的数位和
            if (x>=m||y>=n||sx+sy>k||visit[x][y])   continue;
            visit[x][y]=true;
            res++;
            queue.add(new int[]{x+1,y,(x+1)%10==0?sx-8:sx+1,sy});
            queue.add(new int[]{x,y+1,sx,(y+1)%10==0?sy-8:sy+1});
        }
        return res;
    }

}
