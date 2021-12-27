package 算法学习计划.算法基础.第一天二分查找.搜索二维矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/27 20:16
 */
public class Quiz74 {
//    public boolean searchMatrix(int[][] matrix, int target) {//二维数组转一维数组再进行二分
//        int rowlen=matrix.length;
//        int collen=matrix[0].length;
//        if (rowlen==1&&collen==1)
//            return matrix[0][0]==target;
//        List<Integer> valOfMatrix=new ArrayList<>();
//        for (int i = 0; i < rowlen; i++) {
//            for (int j = 0; j < collen; j++) {
//                valOfMatrix.add(matrix[i][j]);
//            }
//        }
//        int left=0,right=valOfMatrix.size()-1;
//        while (left<=right) {
//            int mid=left+(right-left)/2;
//            if (valOfMatrix.get(mid)==target)
//                return true;
//            else {
//                if (valOfMatrix.get(mid)>target)
//                    right=mid-1;
//                else
//                    left=mid+1;
//            }
//        }
//        return false;
//    }

    public boolean searchMatrix(int[][] matrix, int target) {//二分升序数组的下标，将其映射到原矩阵的行和列上
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        if (rowlen == 1 && collen == 1)
            return matrix[0][0] == target;
        int left = 0, right = rowlen * collen - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int x = matrix[mid / collen][mid % collen];
            if (x == target)
                return true;
            else if (x > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}
