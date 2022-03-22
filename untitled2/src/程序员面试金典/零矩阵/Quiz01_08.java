package 程序员面试金典.零矩阵;

/**
 * @author zx
 * @date 2022/3/22 10:44
 */
public class Quiz01_08 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] rowzero=new boolean[m];
        boolean[] colzero=new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0) {
                    rowzero[i]=true;
                    colzero[j]=true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowzero[i]||colzero[j])
                    matrix[i][j]=0;
            }
        }
        return;
    }
}
