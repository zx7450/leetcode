package 剑指offer第二版.和为s的连续正数序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/3/9 9:10
 */
public class Quiz57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ans=new ArrayList<>();
        for (int l=1,r=2;l<r;) {
            int sum=(r-l+1)*(l+r)/2;
            if (sum==target) {
                int[] res=new int[r-l+1];
                for (int i = l; i <= r; i++) {
                    res[i-l]=i;
                }
                ans.add(res);
                l++;
            } else if (sum<target) {
                r++;
            } else
                l++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
