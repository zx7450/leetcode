package 图论.岛屿的周长;

/**
 * @author zx
 * @date 2024/2/11 17:21
 */
public class Quiz463 {
    boolean[][] visited;
    int m, n;
    int ans;
    int[][] move = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int islandPerimeter(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        ans = 0;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    return ans;
                }
            }
        }
        return 0;
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i == m || j < 0 || j == n || grid[i][j] == 0 || visited[i][j])
            return;
        visited[i][j] = true;
        //只有当该陆地位于格子边缘或者与水域相连时才会计算周长
        if (j == 0 || grid[i][j - 1] == 0)
            ans++;
        if (j == n - 1 || grid[i][j + 1] == 0)
            ans++;
        if (i == 0 || grid[i - 1][j] == 0)
            ans++;
        if (i == m - 1 || grid[i + 1][j] == 0)
            ans++;
        for (int mo = 0; mo < 4; mo++) {
            dfs(grid, i + move[mo][0], j + move[mo][1]);
        }
    }
}
