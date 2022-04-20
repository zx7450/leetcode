package 程序员面试金典.迷路的机器人;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/4/20 9:28
 */
public class Quiz08_02 {
    boolean visit[][];
    int rowlen, collen;
    List<List<Integer>> path;

    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        rowlen = obstacleGrid.length;
        collen = obstacleGrid[0].length;
        visit = new boolean[rowlen][collen];
        path = new ArrayList<>();
        dfs(0, 0, obstacleGrid);
        return path;
    }

    public boolean dfs(int row, int col, int[][] obstacleGrid) {
        if (row == rowlen || col == collen || obstacleGrid[row][col] == 1 || visit[row][col])
            return false;
        path.add(Arrays.asList(row, col));
        visit[row][col] = true;//不管怎么到这个位置，接下来只有两种选择，不影响决策，所以回溯时visit不用置为false
        if (row == rowlen - 1 && col == collen - 1)
            return true;
        else if (dfs(row + 1, col, obstacleGrid) || dfs(row, col + 1, obstacleGrid))
            return true;
        path.remove(path.size() - 1);
        return false;
    }
}
