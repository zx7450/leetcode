package 图论.岛屿的最大面积.广搜法;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2024/2/4 15:33
 */
public class Quiz695 {
    static int m;
    static int n;

    static int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) ans = Math.max(ans, bfs(grid, i, j));
            }
        }
        return ans;
    }

    public static int bfs(int[][] grid, int i, int j) {
        int area = 1;
        Queue<int[]> nodeQue = new LinkedList<>();
        nodeQue.add(new int[]{i, j});
        grid[i][j] = 0;
        while (!nodeQue.isEmpty()) {
            int[] node = nodeQue.poll();
            for (int mo = 0; mo < 4; mo++) {
                int newi = node[0] + move[mo][0];
                int newj = node[1] + move[mo][1];
                if (newi < 0 || newj < 0 || newi == m || newj == n || grid[newi][newj] == 0) continue;
                grid[newi][newj] = 0;
                area++;
                nodeQue.add(new int[]{newi, newj});
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(maxAreaOfIsland(grid));
    }
}
