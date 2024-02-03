package 数组.螺旋矩阵II;

import java.util.ArrayList;
import java.util.List;

public class Quiz54 {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> ans=new ArrayList<Integer>();
//        int linlength=matrix[0].length;
//        int rowlength=matrix.length;
//        int linerequire=linlength;//行需要遍历的数量
//        int rowrequire=rowlength-1;//列需要遍历的数量
//        int linenow=0;//当前行已遍历了多少次
//        int rownow=0;//当前列已遍历了多少次
//        int time=1;//当前循环次数
//        int i=0,j=0;
//        boolean rightflag=true,downflag=false,leftflag=false;
//        while (time<=linlength*rowlength){
//            ans.add(matrix[i][j]);
//            time++;
//            if (rightflag==true){
//                linenow++;
//                if (linenow==linerequire){
//                    rightflag=false;
//                    downflag=true;
//                    linenow=0;
//                    linerequire--;
//                    i++;
//                } else
//                    j++;
//            } else if (downflag==true){
//                rownow++;
//                if (rownow==rowrequire){
//                    downflag=false;
//                    leftflag=true;
//                    rownow=0;
//                    rowrequire--;
//                    j--;
//                } else
//                    i++;
//            } else if (leftflag==true){
//                linenow++;
//                if (linenow==linerequire){
//                    leftflag=false;
//                    linenow=0;
//                    linerequire--;
//                    i--;
//                } else
//                    j--;
//            } else {
//                rownow++;
//                if (rownow==rowrequire){
//                    rightflag=true;
//                    rownow=0;
//                    rowrequire--;
//                    j++;
//                } else
//                    i--;
//            }
//        }
//        return ans;
//    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visit = new boolean[m][n];
        int flag = 1, visitNum = 0, allNum = m * n, i = 0, j = 0;
        while (visitNum < allNum) {
            ans.add(matrix[i][j]);
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
            visitNum++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }
}
