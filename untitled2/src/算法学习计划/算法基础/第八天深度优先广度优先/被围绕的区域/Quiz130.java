package 算法学习计划.算法基础.第八天深度优先广度优先.被围绕的区域;

/**
 * @author zx
 * @date 2022/1/6 10:25
 */
public class Quiz130 {
    int m,n;
    public void solve(char[][] board) {//思路：对边界上的O进行dfs改为其他字符，最后再遍历一遍，未被修改的O改为X其余还原
        m=board.length;
        n=board[0].length;
        if (m==1||n==1)
            return;
        for (int i = 0; i < m; i++) {
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for (int i = 1; i < n-1; i++) {
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]=='O')
                    board[i][j]='X';
                else if (board[i][j]=='a')
                    board[i][j]='O';
            }
        }
    }

    public void dfs(char[][] board,int i,int j){
        if (i<0||i>=m||j<0||j>=n||board[i][j]!='O')
            return;
        board[i][j]='a';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}
