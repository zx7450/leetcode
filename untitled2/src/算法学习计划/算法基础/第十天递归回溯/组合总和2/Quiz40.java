package 算法学习计划.算法基础.第十天递归回溯.组合总和2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/7 9:58
 */
public class Quiz40 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length==1) {
            if (candidates[0] == target) {
                path.add(candidates[0]);
                res.add(new ArrayList<>(path));
            }
            return res;
        }
        Arrays.sort(candidates);
        backtracing(candidates,target,0,0);
        return res;
    }
    public void backtracing(int[] candidates, int target,int start,int sum) {
        if (sum==target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length&&candidates[i]+sum<=target; i++) {
            if (i>start&&candidates[i]==candidates[i-1])
                continue;
            path.add(candidates[i]);
            sum+=candidates[i];
            backtracing(candidates,target,i+1,sum);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
