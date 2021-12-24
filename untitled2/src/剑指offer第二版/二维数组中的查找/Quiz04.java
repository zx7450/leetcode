package 剑指offer第二版.二维数组中的查找;

/**
 * @author zx
 * @date 2021/12/24 10:24
 */
public class Quiz04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rowlen=matrix.length;
        if (rowlen==0)
            return false;
        int collen=matrix[0].length;
        if (collen==0)
            return false;
        for (int i = 0; i < rowlen; i++) {
            if (matrix[i][0]==target)
                return true;
            else if (matrix[i][0]>target)
                break;
            for (int j = 1; j < collen; j++) {
                if (matrix[i][j]==target)
                    return true;
                else if (matrix[i][j]>target)
                    break;
            }
        }
        return false;
    }
}
