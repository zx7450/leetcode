package 程序员面试金典.旋转矩阵;

/**
 * @author zx
 * @date 2022/3/21 11:39
 */
public class Quiz01_07 {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n+1)/2; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=tmp;
            }
        }
        return;
    }
}
