package 随意练习.旋转图像;

/**
 * @author zx
 * @date 2024/1/2 10:50
 */
public class Quiz48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
