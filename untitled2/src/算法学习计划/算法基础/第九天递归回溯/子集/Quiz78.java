package 算法学习计划.算法基础.第九天递归回溯.子集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/6 11:36
 */
public class Quiz78 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracing(nums,0);
        return res;
    }

    public void backtracing(int[] nums,int start) {
        res.add(new ArrayList<>(path));
        if (start== nums.length)
            return;
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtracing(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
