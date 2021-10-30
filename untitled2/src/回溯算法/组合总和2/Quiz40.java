package 回溯算法.组合总和2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz40 {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<Integer>();
    int sum=0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length==1) {
            if (candidates[0] == target) {
                path.add(candidates[0]);
                result.add(new ArrayList<>(path));
            }
            return result;
        }
        Arrays.sort(candidates);
        backtracing(candidates,target,0);
        return result;
    }

    public void backtracing(int[] candidates, int target,int startpos) {
        if (target==sum) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i < candidates.length&&candidates[i]+sum<=target; i++) {
            if (i>startpos&&candidates[i]==candidates[i-1])//i比开始位置大说明已经不是第一次遍历，此时若本位置值与前一位置的相等则应该去重，直接进入下一步
                continue;
            path.add(candidates[i]);
            sum+=candidates[i];
            backtracing(candidates,target,i+1);
            path.remove(path.size()-1);
            sum-=candidates[i];
        }
    }
}
