package 图论.飞地的数量;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2024/2/5 9:53
 */
public class Quiz1020 {
    boolean isEdge;
    int m, n;
    int ans;
    int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    isEdge = false;
                    int area = bfs(grid, i, j);
                    if (!isEdge)
                        ans += area;
                }
            }
        }
        return ans;
    }

    public int bfs(int[][] grid, int i, int j) {
        int area = 1;
        if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
            isEdge = true;
        Queue<int[]> nodeque = new LinkedList<>();
        grid[i][j] = 0;
        nodeque.add(new int[]{i, j});
        while (!nodeque.isEmpty()) {
            int[] node = nodeque.poll();
            for (int mo = 0; mo < 4; mo++) {
                int newi = node[0] + move[mo][0];
                int newj = node[1] + move[mo][1];
                if (newi < 0 || newi == m || newj < 0 || newj == n || grid[newi][newj] == 0) continue;
                if (newi == 0 || newi == m - 1 || newj == 0 || newj == n - 1)
                    isEdge = true;
                grid[newi][newj] = 0;
                area++;
                nodeque.add(new int[]{newi, newj});
            }
        }
        return area;
    }
}
