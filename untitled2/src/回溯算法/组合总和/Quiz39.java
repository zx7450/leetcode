package 回溯算法.组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz39 {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<Integer>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {//优化：对集合进行排序，则在for循环就可以知道sum是否大于target
        Arrays.sort(candidates);
        backtracing(candidates,target,0,0);
        return result;
    }
    public void backtracing(int[] candidates, int target,int startpos,int sum) {
        if (target==sum){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i < candidates.length&&sum+candidates[i]<=target; i++) {
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracing(candidates,target,i,sum);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
