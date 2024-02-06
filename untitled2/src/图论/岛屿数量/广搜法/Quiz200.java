package 图论.岛屿数量.广搜法;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2024/2/4 11:11
 */
public class Quiz200 {
    static int m;
    static int n;
    static int[][] move = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    bfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    public static void bfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        Queue<int[]> nodeQue = new LinkedList<>();
        nodeQue.add(new int[]{i, j});
        while (!nodeQue.isEmpty()) {
            int[] currNode = nodeQue.poll();
            for (int mo = 0; mo < move.length; mo++) {
                int newi = currNode[0] + move[mo][0];
                int newj = currNode[1] + move[mo][1];
                if (newi < 0 || newj < 0 || newi == m || newj == n || grid[newi][newj] == '0') continue;
                grid[newi][newj] = '0';
                nodeQue.add(new int[]{newi, newj});
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }
}
