package 图论.太平洋大西洋水流问题;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2024/2/6 13:05
 */
public class Quiz417 {
    int m, n;
    boolean[][] pacificvisit;
    boolean[][] atlanticvisit;
    int[][] move = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        pacificvisit = new boolean[m][n];
        atlanticvisit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, pacificvisit);
            dfs(heights, i, n - 1, atlanticvisit);
        }
        for (int i = 0; i < n; i++) {
            dfs(heights, 0, i, pacificvisit);
            dfs(heights, m - 1, i, atlanticvisit);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificvisit[i][j] && atlanticvisit[i][j]) {
                    List<Integer> res = new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    ans.add(res);
                }
            }
        }
        return ans;
    }

    public void dfs(int[][] heights, int i, int j, boolean[][] oceans) {
        oceans[i][j] = true;
        for (int mo = 0; mo < 4; mo++) {
            int x = i + move[mo][0];
            int y = j + move[mo][1];
            if (x < 0 || x == m || y < 0 || y == n || oceans[x][y] || heights[x][y] < heights[i][j]) continue;
            dfs(heights, x, y, oceans);
        }
    }
}
