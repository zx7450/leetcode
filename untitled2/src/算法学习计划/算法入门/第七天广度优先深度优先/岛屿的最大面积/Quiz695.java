package 算法学习计划.算法入门.第七天广度优先深度优先.岛屿的最大面积;

/**
 * @author zx
 * @date 2021/12/20 10:35
 */
public class Quiz695 {
    public int maxAreaOfIsland(int[][] grid) {//深度优先
        int maxarea=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==0)
                    continue;
                else {
                    int islenarea=calarea(grid,i,j);
                    if (islenarea>maxarea)
                        maxarea=islenarea;
                }
            }
        }
        return maxarea;
    }

    public int calarea(int[][] grid,int x,int y) {
        if (x<0||x==grid.length||y<0||y==grid[0].length||grid[x][y]==0)
            return 0;
        else {
            grid[x][y]=0;
            return calarea(grid,x+1,y)+calarea(grid,x-1,y)+calarea(grid,x,y-1)+calarea(grid,x,y+1)+1;
        }
    }
}
