package 回溯算法.N皇后2;

import java.util.Arrays;

/**
 * @author zx
 * @date 2021/11/04 9:05
 */
public class Quiz52 {
    int ans=0;
    public int totalNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c, '.');
        }
        backtracing(chessboard,0,n);
        return ans;
    }
    public void backtracing(char[][] chessboard,int row,int n){
        if (row==n){
            ans++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(chessboard,row,col,n)){
                chessboard[row][col]='Q';
                backtracing(chessboard,row+1,n);
                chessboard[row][col]='.';
            }
        }
    }
    public boolean isValid(char[][] chessboard,int row,int col,int n){//由于是按每行开始添加，所以无需检查行和下面的对角线
        for (int i = 0; i < row; i++) {//检查列
            if (chessboard[i][col]=='Q')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {//检查45度对角线
            if (chessboard[i][j]=='Q')
                return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<=(n-1);i--,j++) {//检查135度对角线
            if (chessboard[i][j]=='Q')
                return false;
        }
        return true;
    }
}
