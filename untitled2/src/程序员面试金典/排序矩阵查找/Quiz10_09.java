package 程序员面试金典.排序矩阵查找;

/**
 * @author zx
 * @date 2022/4/28 9:00
 */
public class Quiz10_09 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowlen = matrix.length;
        if (rowlen==0)
            return false;
        int collen = matrix[0].length, x = 0, y = collen - 1;
        while (x < rowlen && y >= 0) {
            if (matrix[x][y] == target)
                return true;
            else if (matrix[x][y] > target)
                y--;
            else
                x++;
        }
        return false;
    }
}
