package 算法学习计划.算法基础.第十一天递归回溯.单词搜索;

/**
 * @author zx
 * @date 2022/1/7 17:31
 */
public class Quiz79 {
    boolean[][] visit;
    int rowlen;
    int collen;
    public boolean exist(char[][] board, String word) {
        rowlen= board.length;
        collen=board[0].length;
        if (word.length()>rowlen*collen)
            return false;
        visit=new boolean[rowlen][collen];
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (backtracing(board,word,i,j,0)==true)
                    return true;
            }
        }
        return false;
    }

    public boolean backtracing(char[][] board, String word,int i,int j,int pos) {
        if (pos==word.length())
            return true;
        if (i<0||i>=rowlen||j<0||j>=collen||visit[i][j]==true||board[i][j]!=word.charAt(pos))
            return false;
        visit[i][j]=true;
        boolean ans=backtracing(board,word,i+1,j,pos+1)||backtracing(board,word,i-1,j,pos+1)||
                backtracing(board,word,i,j+1,pos+1)||backtracing(board,word,i,j-1,pos+1);
        visit[i][j]=false;
        return ans;
    }
}
