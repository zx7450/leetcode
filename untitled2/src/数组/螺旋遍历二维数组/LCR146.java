package 数组.螺旋遍历二维数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2024/2/3 22:03
 */
public class LCR146 {
    public int[] spiralArray(int[][] array) {
        int m = array.length;
        if (m == 0) {
            return new int[0];
        }
        int n = array[0].length;
        boolean[][] visit = new boolean[m][n];
        int flag = 1, visitNum = 0, allNum = m * n, i = 0, j = 0;
        int[] ans = new int[allNum];
        while (visitNum < allNum) {
            ans[visitNum++] = array[i][j];
            visit[i][j] = true;
            if (flag == 1) {
                if (j == n - 1 || visit[i][j + 1]) {
                    flag = 2;
                    i++;
                } else j++;
            } else if (flag == 2) {
                if (i == m - 1 || visit[i + 1][j]) {
                    flag = 3;
                    j--;
                } else i++;
            } else if (flag == 3) {
                if (j == 0 || visit[i][j - 1]) {
                    flag = 4;
                    i--;
                } else j--;
            } else {
                if (visit[i - 1][j]) {
                    flag = 1;
                    j++;
                } else i--;
            }
        }
        return ans;
    }
}

