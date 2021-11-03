package 回溯算法.解数独;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2021/11/03 9:30
 */
public class Quiz37 {
    public void solveSudoku(char[][] board) {
        backtracing(board);
    }
    public boolean isValid(char[][] board,char num,int row,int col){
        for (int i = 0; i < 9; i++) {
            if (board[row][i]==num)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col]==num)
                return false;
        }
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (board[i][j]==num)
                    return false;
            }
        }
        return true;
    }
    public boolean backtracing(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]!='.')//找到需要填数的位置
                    continue;
                for (char num='1';num<='9';num++) {//将num从1-9放入该位置并判断是否合适
                    if (isValid(board,num,i,j)){
                        board[i][j]=num;
                        if (backtracing(board)) return true;//由于数独仅有一组解，遇到解直接返回即可
                        board[i][j]='.';//不是解，则该位置置空，重新尝试
                    }
                }
                return false;//9个数都试过均不行，返回false
                // 因为如果一行一列确定下来了，这里尝试了9个数都不行，说明这个棋盘找不到解决数独问题的解！
                // 那么会直接返回， 「这也就是为什么没有终止条件也不会永远填不满棋盘而无限递归下去！」
            }
        }
        return true;//遍历完成没有返回false，则说明找到了解
    }
}
