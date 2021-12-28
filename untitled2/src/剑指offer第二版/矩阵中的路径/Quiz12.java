package 剑指offer第二版.矩阵中的路径;

/**
 * @author zx
 * @date 2021/12/28 10:47
 */
public class Quiz12 {
    boolean[][] visit;
    public boolean exist(char[][] board, String word) {
        int rowlen= board.length;
        int collen=board[0].length;
        if (word.length()>(rowlen*collen))
            return false;
        visit=new boolean[rowlen][collen];
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word,int startpos,int i,int j) {
        if (i<0||i>=board.length||j<0||j>=board[0].length||visit[i][j]||board[i][j]!=word.charAt(startpos))
            return false;
        if (startpos==word.length()-1)
            return true;
        visit[i][j]=true;
        boolean res=dfs(board,word,startpos+1,i+1,j)||dfs(board,word,startpos+1,i-1,j)||dfs(board,word,startpos+1,i,j+1)||dfs(board,word,startpos+1,i,j-1);
        visit[i][j]=false;
        return res;
    }
}
