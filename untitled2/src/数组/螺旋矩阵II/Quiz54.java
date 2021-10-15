package 数组.螺旋矩阵II;

import java.util.ArrayList;
import java.util.List;

public class Quiz54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        int linlength=matrix[0].length;
        int rowlength=matrix.length;
        int linerequire=linlength;//行需要遍历的数量
        int rowrequire=rowlength-1;//列需要遍历的数量
        int linenow=0;//当前行已遍历了多少次
        int rownow=0;//当前列已遍历了多少次
        int time=1;//当前循环次数
        int i=0,j=0;
        boolean rightflag=true,downflag=false,leftflag=false;
        while (time<=linlength*rowlength){
            ans.add(matrix[i][j]);
            time++;
            if (rightflag==true){
                linenow++;
                if (linenow==linerequire){
                    rightflag=false;
                    downflag=true;
                    linenow=0;
                    linerequire--;
                    i++;
                } else
                    j++;
            } else if (downflag==true){
                rownow++;
                if (rownow==rowrequire){
                    downflag=false;
                    leftflag=true;
                    rownow=0;
                    rowrequire--;
                    j--;
                } else
                    i++;
            } else if (leftflag==true){
                linenow++;
                if (linenow==linerequire){
                    leftflag=false;
                    linenow=0;
                    linerequire--;
                    i--;
                } else
                    j--;
            } else {
                rownow++;
                if (rownow==rowrequire){
                    rightflag=true;
                    rownow=0;
                    rowrequire--;
                    j++;
                } else
                    i--;
            }
        }
        return ans;
    }
}
