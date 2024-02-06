package 图论.被围绕的区域.广搜法;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2024/2/5 15:09
 */
public class Quiz130 {
    int m, n;

    int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            bfs(board, i, 0);
            bfs(board, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            bfs(board, 0, i);
            bfs(board, m - 1, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'A')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    public void bfs(char[][] board, int i, int j) {
        if (board[i][j] != 'O') return;
        board[i][j] = 'A';
        Queue<int[]> nodeque = new LinkedList<>();
        nodeque.add(new int[]{i, j});
        while (!nodeque.isEmpty()) {
            int[] node = nodeque.poll();
            for (int mo = 0; mo < 4; mo++) {
                int newi = node[0] + move[mo][0];
                int newj = node[1] + move[mo][1];
                if (newi < 0 || newi == m || newj < 0 || newj == n || board[newi][newj] != 'O') continue;
                board[newi][newj] = 'A';
                nodeque.add(new int[]{newi, newj});
            }
        }
    }
}
