package 数组.螺旋矩阵II;

public class Quiz59 {
//    public int[][] generateMatrix(int n) {
//        if(n==1)
//            return new int[][]{{1}};
//        int[][] ans=new int[n][n];
//        boolean rightflag=true,downflag=false,leftflag=false;
//        int now=1;
//        int i=0,j=0;
//        while(now<=n*n){
//            ans[i][j]=now;
//            now++;
//            if (rightflag==true){
//                if (j+1==n||ans[i][j+1]!=0){
//                    rightflag=false;
//                    downflag=true;
//                    i++;
//                }else
//                    j++;
//            } else if (downflag==true){
//                if (i+1==n||ans[i+1][j]!=0){
//                    downflag=false;
//                    leftflag=true;
//                    j--;
//                } else
//                    i++;
//            } else if (leftflag==true){
//                if (j-1<0||ans[i][j-1]!=0){
//                    leftflag=false;
//                    i--;
//                } else
//                    j--;
//            } else {
//                if (ans[i-1][j]!=0){
//                    rightflag=true;
//                    j++;
//                } else
//                    i--;
//            }
//        }
//        return ans;
//    }

    public int[][] generateMatrix(int n) {
        if (n == 1)
            return new int[][]{{1}};
        int[][] ans = new int[n][n];
        int flag = 1, i = 0, j = 0, curr = 1, endNum = n * n;
        while (curr <= endNum) {
            ans[i][j] = curr++;
            if (flag == 1) {
                if (j == n - 1 || ans[i][j + 1] != 0) {
                    flag = 2;
                    i++;
                } else j++;
            } else if (flag == 2) {
                if (i == n - 1 || ans[i + 1][j] != 0) {
                    flag = 3;
                    j--;
                } else i++;
            } else if (flag == 3) {
                if (j == 0 || ans[i][j - 1] != 0) {
                    flag = 4;
                    i--;
                } else j--;
            } else {
                if (ans[i - 1][j] != 0) {
                    flag = 1;
                    j++;
                } else i--;
            }
        }
        return ans;
    }
}
