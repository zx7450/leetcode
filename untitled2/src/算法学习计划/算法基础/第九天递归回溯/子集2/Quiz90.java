package 算法学习计划.算法基础.第九天递归回溯.子集2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/6 11:41
 */
public class Quiz90 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracing(nums,0);
        return res;
    }

    public void backtracing(int[] nums,int start) {
        res.add(new ArrayList<>(path));
        if (start== nums.length)
            return;
        for (int i = start; i < nums.length; i++) {
            if (i!=start&&nums[i]==nums[i-1])
                continue;
            path.add(nums[i]);
            backtracing(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
