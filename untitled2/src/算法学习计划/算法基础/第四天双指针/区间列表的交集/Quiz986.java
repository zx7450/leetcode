package 算法学习计划.算法基础.第四天双指针.区间列表的交集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/31 15:34
 */
public class Quiz986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstlenth= firstList.length;
        int secondlenth=secondList.length;
        if (firstlenth==0||secondlenth==0)
            return new int[0][0];
        int i=0,j=0;
        List<int[]> ans=new ArrayList<>();
        while (i<firstlenth&&j<secondlenth) {
            int left=Math.max(firstList[i][0],secondList[j][0]);
            int right=Math.min(firstList[i][1],secondList[j][1]);
            if (left<=right)
                ans.add(new int[]{left,right});
            if (firstList[i][1]<secondList[j][1])
                i++;
            else
                j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
