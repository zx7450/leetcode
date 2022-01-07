package 算法学习计划.算法基础.第十天递归回溯.组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/7 9:46
 */
public class Quiz39 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracing(candidates,target,0,0);
        return res;
    }

    public void backtracing(int[] candidates, int target,int start,int sum){
        if (sum==target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length&&sum+candidates[i]<=target; i++) {
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracing(candidates,target,i,sum);
            path.remove(path.size()-1);
            sum-=candidates[i];
        }
    }
}
