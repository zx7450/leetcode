package 算法学习计划.算法基础.第六天深度优先广度优先.岛屿数量;

/**
 * @author zx
 * @date 2022/1/4 16:25
 */
public class Quiz200 {
    public int numIslands(char[][] grid) {
        int rowlen= grid.length,collen=grid[0].length;
        if (rowlen==1&&collen==1)
            return grid[0][0]=='1'?1:0;
        int ans=0;
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (grid[i][j]=='1') {
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid,int i,int j) {
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
    }
}
