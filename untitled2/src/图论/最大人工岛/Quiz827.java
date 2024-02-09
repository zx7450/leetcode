package 图论.最大人工岛;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * @date 2024/2/9 17:05
 */
public class Quiz827 {
    int m, n;
    Map<Integer, Integer> areamap = new HashMap<>();

    final int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int flag = 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    areamap.put(flag, dfs(grid, i, j, flag));
                    flag++;
                }
            }
        }
        int ans = 0;
        if (!areamap.isEmpty())
            ans = areamap.get(2);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    ans = Math.max(ans, connect(grid, i, j));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int i, int j, int flag) {
        if (i < 0 || i == m || j < 0 || j == n || grid[i][j] != 1)
            return 0;
        grid[i][j] = flag;
        return 1 + dfs(grid, i + 1, j, flag) + dfs(grid, i - 1, j, flag)
                + dfs(grid, i, j + 1, flag) + dfs(grid, i, j - 1, flag);
    }

    public int connect(int[][] grid, int i, int j) {
        int area = 1;
        Set<Integer> hascal = new HashSet<>();
        for (int mo = 0; mo < 4; mo++) {
            int x = i + move[mo][0];
            int y = j + move[mo][1];
            if (x < 0 || x == m || y < 0 || y == n || grid[x][y] == 0 || hascal.contains(grid[x][y])) continue;
            area += areamap.get(grid[x][y]);
            hascal.add(grid[x][y]);
        }
        return area;
    }
}
