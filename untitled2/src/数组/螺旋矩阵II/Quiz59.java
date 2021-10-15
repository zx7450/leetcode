package 数组.螺旋矩阵II;

public class Quiz59 {
    public int[][] generateMatrix(int n) {
        if(n==1)
            return new int[][]{{1}};
        int[][] ans=new int[n][n];
        boolean rightflag=true,downflag=false,leftflag=false;
        int now=1;
        int i=0,j=0;
        while(now<=n*n){
            ans[i][j]=now;
            now++;
            if (rightflag==true){
                if (j+1==n||ans[i][j+1]!=0){
                    rightflag=false;
                    downflag=true;
                    i++;
                }else
                    j++;
            } else if (downflag==true){
                if (i+1==n||ans[i+1][j]!=0){
                    downflag=false;
                    leftflag=true;
                    j--;
                } else
                    i++;
            } else if (leftflag==true){
                if (j-1<0||ans[i][j-1]!=0){
                    leftflag=false;
                    i--;
                } else
                    j--;
            } else {
                if (ans[i-1][j]!=0){
                    rightflag=true;
                    j++;
                } else
                    i--;
            }
        }
        return ans;
    }
}
